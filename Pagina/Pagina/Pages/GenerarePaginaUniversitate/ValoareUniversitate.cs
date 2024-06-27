namespace Pagina.Pages.GenerarePaginaUniversitate
{
    public static class ValoareUniversitate
    {
        public static string Universitate;

        public static String getUniversitate() {
            return Universitate;
        }

        public static void setUniversitate(String value) { 
            Universitate = value; 
        }

        public static Boolean Refreshed = false;
        public static Boolean getRefreshed()
        {
            return Refreshed;
        }
        public static void setRefreshed(Boolean Value) { 
            Refreshed = Value;
        }

    }
}
