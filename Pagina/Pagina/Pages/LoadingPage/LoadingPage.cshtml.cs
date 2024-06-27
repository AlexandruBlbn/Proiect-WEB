using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages;
using Pagina.Pages.AccesingPages;
using Pagina.Pages.GenerarePaginaUniversitate;
using Pagina.Pages.Shared.IndexShared;
using System.ComponentModel;

namespace Pagina.Pages.LoadingPage
{
    public class LoadingPageModel : PageModel
    {

        public IActionResult OnGet()
        {

            ValoareUniversitate.setRefreshed(true);
           return RedirectToPage("../GenerarePaginaUniversitate/FacultatiUniversitate");
        }
    }
}
