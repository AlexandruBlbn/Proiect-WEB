using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.Blazor;
using Pagina.Pages.AccesingPages;

namespace Pagina.Pages.MaterialeleMele
{
    public class MaterialeleMeleModel : PageModel
    {

        public string Pass { get; set; }
        public string facultate { get; set; }
        public String File { get; set; }
        public void OnGet()
        {
            
        }
    }
}
