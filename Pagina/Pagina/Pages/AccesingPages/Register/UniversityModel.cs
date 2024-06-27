namespace Pagina.Pages.AccesingPages.Register
{
    public class UniversityModel
    {
        public string Name { get; set; }
    }

    public class FacultyModel
    {
        public string Name { get; set; }
        public string University { get; set; }
    }

    public class SpecializationModel
    {
        public string Name { get; set; }
        public string Faculty { get; set; }
    }
}
