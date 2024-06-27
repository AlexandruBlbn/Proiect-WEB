namespace Pagina.Pages.Shared.IndexShared
{
    public static class MesajOra
    {
        public static String VerificareOra(String mesaj)
        {
            DateTime ora = DateTime.Now;
            TimeSpan seara = new TimeSpan(3, 59, 59);
            TimeSpan dimineata = new TimeSpan(10, 0, 0);
            TimeSpan ziua = new TimeSpan(17, 59, 59);


            if (ora.TimeOfDay >= seara && ora.TimeOfDay < dimineata)
            {
                mesaj = "Neața";
            }
            else if (ora.TimeOfDay >= dimineata && ora.TimeOfDay <= ziua)
            {
                mesaj = "Salutare";
            }
            else
            {
                mesaj = "Bună seara";
            }


            return mesaj;
        }
    }
}
