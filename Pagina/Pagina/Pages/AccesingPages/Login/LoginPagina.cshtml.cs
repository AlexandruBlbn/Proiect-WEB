using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using System;
using System.Data.SqlClient;

namespace Pagina.Pages.AccesingPages
{
    public class LoginPagina : PageModel
    {
        [BindProperty]
        public string Username { get; set; }

        [BindProperty]
        public string Password { get; set; }

        public string LoginError { get; set; }

        public IActionResult OnGet()
        {
            return Page();
        }

        public IActionResult OnPost()
        {
            string connectionString = "Data Source=.\\sqlserver;Initial Catalog=AuthStore;User ID=LoginVerificare;Password=verificare;";
            string query = "SELECT COUNT(*) FROM WERQWERQ_Users WHERE Username = @Username AND Parola = @Password";

            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                using (SqlCommand command = new SqlCommand(query, connection))
                {
                    command.Parameters.AddWithValue("@Username", Username);
                    command.Parameters.AddWithValue("@Password", Password);

                    connection.Open();

                    int count = (int)command.ExecuteScalar();

                    if (count > 0)
                    {
                        Details.setStatus(true);
                        Details.setNume(Username);
                        Details.setParola(Password);

                        var cookieOptions = new CookieOptions
                        {
                            Expires = DateTime.UtcNow.AddHours(12),
                            Secure = true,
                            SameSite = SameSiteMode.Strict
                        };
                        Response.Cookies.Append("AuthCookie", "AuthTokenValue", cookieOptions);

                        string infoQuery = "SELECT UNIVERSITATE, FACULTATE, SPECIALIZARE FROM WERQWERQ_Users WHERE Username = @Username AND Parola = @Password";
                        using (SqlCommand infoCommand = new SqlCommand(infoQuery, connection))
                        {
                            infoCommand.Parameters.AddWithValue("@Username", Username);
                            infoCommand.Parameters.AddWithValue("@Password", Password);

                            using (SqlDataReader reader = infoCommand.ExecuteReader())
                            {
                                if (reader.Read())
                                {

                                    Details.setUniversitate(reader["UNIVERSITATE"].ToString());
                                    Details.setFacultate(reader["FACULTATE"].ToString());
                                    Details.setSpecializare(reader["SPECIALIZARE"].ToString());
                                }
                            }
                        }

                        connection.Close();
                        return RedirectToPage("../../Index");
                    }
                    else
                    {
                        LoginError = "Incorrect username or password!";
                        return Page();
                    }
                }
            }
        }
    }
}
