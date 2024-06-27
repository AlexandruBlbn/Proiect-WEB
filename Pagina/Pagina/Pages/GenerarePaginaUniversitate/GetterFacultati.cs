using Pagina.Pages.AccesingPages;
using Pagina.Pages.AccesingPages.Register;
using System.Data.SqlClient;

namespace Pagina.Pages.GenerarePaginaUniversitate
{
    public class GetterFacultati
    {
      public string Conn = DBElements.getConnectionString();


        public List<string> GetFaculty()
        {
            var facultyList = new List<string>();
            string query = "SELECT DISTINCT FACULTATE FROM UNIVERSITATI WHERE UNIVERSITATE = '" + ValoareUniversitate.getUniversitate() + "';";

            using (var connection = new SqlConnection(Conn))
            {
                connection.Open();
                using (var command = new SqlCommand(query, connection))
                {
  
                    using (var reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            facultyList.Add(reader["FACULTATE"].ToString());
                        }
                    }
                }
            }
            return facultyList;
        }


    }
}
