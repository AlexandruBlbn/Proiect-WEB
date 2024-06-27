using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Pagina.Pages.AccesingPages;
using Pagina.Pages.AccesingPages.Register;
using Pagina.Pages.Shared.IndexShared;
using System.Security.Cryptography.Xml;

namespace Pagina.Pages
{

    public class IndexModel : PageModel
    {
        private readonly RegisterOperations _registerOperations;
        public string Nume;
        public string MesajBunVenit;

        public IndexModel(RegisterOperations registerOperations)
        {
            _registerOperations = registerOperations;
        }

        public List<UniversityModel> UniversityList { get; private set; }





        public IActionResult OnGet()
        {
            
            if (Details.getStatus() == true)
            {

                UniversityList = _registerOperations.GetUniversities();
                Nume = Details.getNume();
             MesajBunVenit = MesajOra.VerificareOra(MesajBunVenit);
                return Page();
            }
            else
            {
                return RedirectToPage("./AccesingPages/Login/LoginPagina");
            }

            

        }
    }
}
