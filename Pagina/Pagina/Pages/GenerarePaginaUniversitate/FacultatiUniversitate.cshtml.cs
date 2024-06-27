using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Pagina.Pages.Shared.IndexShared;

namespace Pagina.Pages.GenerarePaginaUniversitate
{
    public class FacultatiUniversitateModel : PageModel
    {
        public string Universitate { get; set; }

        public List<String> FacultyList { get; set; } 

        public IActionResult OnGet()
        {
            
            GetterFacultati getter = new GetterFacultati();
            Universitate = ValoareUniversitate.getUniversitate();
            if (ValoareUniversitate.getRefreshed() == false) {
                return RedirectToPage("../LoadingPage/LoadingPage");
            }
            FacultyList = getter.GetFaculty();
            return Page();

        }
    }
}
