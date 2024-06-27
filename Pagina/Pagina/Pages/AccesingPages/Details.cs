namespace Pagina.Pages.AccesingPages
{
    public static class Details
    {



        private static Boolean Status = false;

        private static String Nume;
        private static String parola;
        private static String Universitate;
        private static String Facultate;
        private static String Specializare;



        public static String getUniversitate()
        {
            return Universitate;
        }

        public static void setUniversitate(String value)
        {
            Universitate = value;
        }

        public static String getFacultate()
        {
            return Facultate;
        }

        public static void setFacultate(String value)
        {
            Facultate = value;
        }


        public static String getSpecializare()
        {
            return Specializare;
        }

        public static void setSpecializare(String value)
        {
            Specializare = value;
        }

        public static String getNume()
        {
            return Nume;
        }

        public static void setNume(String value)
        {
            Nume = value;
        }

        public static String getParola()
        {
            return parola;
        }

        public static void setParola(String value)
        {
            parola = value;
        }


        public static Boolean getStatus()
        {
            return Status;
        }

        public static void setStatus(Boolean value)
        {
            Status = value;
        }







    }
}
