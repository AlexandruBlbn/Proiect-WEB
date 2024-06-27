using System.Collections.Generic;
using System.Data.SqlClient;

namespace Pagina.Pages.AccesingPages.Register
{
    public class RegisterOperations
    {
        private readonly string _connectionString = "Data Source=.\\sqlserver;Initial Catalog=AuthStore;User ID=LoginVerificare;Password=verificare;";

        public void OperationRegister(string username, string password, string institutionalEmail, string recoveryEmail, string university, string faculty, string specialization)
        {
            const string query = "INSERT INTO WERQWERQ_Users (Username, Parola, EMAIL_INST, EMAIL_REC, UNIVERSITATE, FACULTATE, SPECIALIZARE, TAGS, ROL) " +
                "VALUES (@Username, @Password, @InstitutionalEmail, @RecoveryEmail, @University, @Faculty, @Specialization, @Tags, @Rol)";

            using (var connection = new SqlConnection(_connectionString))
            {
                using (var command = new SqlCommand(query, connection))
                {
                    command.Parameters.AddWithValue("@Username", username);
                    command.Parameters.AddWithValue("@Password", password);
                    command.Parameters.AddWithValue("@InstitutionalEmail", institutionalEmail);
                    command.Parameters.AddWithValue("@RecoveryEmail", recoveryEmail);
                    command.Parameters.AddWithValue("@University", university);
                    command.Parameters.AddWithValue("@Faculty", faculty);
                    command.Parameters.AddWithValue("@Specialization", specialization);
                    command.Parameters.AddWithValue("@Tags", "");
                    command.Parameters.AddWithValue("@Rol", "Student");

                    connection.Open();
                    command.ExecuteNonQuery();
                }
            }
        }

        public List<UniversityModel> GetUniversities()
        {
            var universities = new List<UniversityModel>();
            const string query = "SELECT DISTINCT UNIVERSITATE FROM UNIVERSITATI;";

            using (var connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                using (var command = new SqlCommand(query, connection))
                {
                    using (var reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            universities.Add(new UniversityModel { Name = reader["UNIVERSITATE"].ToString() });
                        }
                    }
                }
            }
            return universities;
        }

        public List<FacultyModel> GetFaculties(string university)
        {
            var facultyList = new List<FacultyModel>();
            const string query = "SELECT DISTINCT FACULTATE FROM UNIVERSITATI WHERE UNIVERSITATE = @University;";

            using (var connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                using (var command = new SqlCommand(query, connection))
                {
                    if (string.IsNullOrEmpty(university))
                    {
                        throw new ArgumentException("University parameter is null or empty.");
                    }

                    command.Parameters.AddWithValue("@University", university);
                    using (var reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            facultyList.Add(new FacultyModel { Name = reader["FACULTATE"].ToString(), University = university });
                        }
                    }
                }
            }
            return facultyList;
        }

        public List<SpecializationModel> GetSpecializations(string faculty)
        {
            var specializationList = new List<SpecializationModel>();
            const string query = "SELECT DISTINCT SPECIALIZARE FROM UNIVERSITATI WHERE FACULTATE = @Faculty;";

            using (var connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                using (var command = new SqlCommand(query, connection))
                {
                    command.Parameters.AddWithValue("@Faculty", faculty);
                    using (var reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            specializationList.Add(new SpecializationModel { Name = reader["SPECIALIZARE"].ToString(), Faculty = faculty });
                        }
                    }
                }
            }
            return specializationList;
        }
    }
}
