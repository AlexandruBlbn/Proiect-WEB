using System.Data.SqlClient;

namespace Pagina.Pages.AccesingPages
{
    public static class DBElements
    {
        private static string connectionString = "Data Source=.\\sqlserver;Initial Catalog=AuthStore;User ID=LoginVerificare;Password=verificare;";


        
        public static string getConnectionString() { 
            return connectionString;
        }


        private static String univeritiesQuery = "select Universitate from Universitati;";

        public static String getUniveritiesQuery()
        {
            return univeritiesQuery;
        }
    }
}
