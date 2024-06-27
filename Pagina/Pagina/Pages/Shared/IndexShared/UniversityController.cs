using Microsoft.AspNetCore.Mvc;
using Pagina.Pages.GenerarePaginaUniversitate;

namespace Pagina.Pages.Shared.IndexShared
{
    public class UniversityController : Controller
    {





        [HttpPost]
        public IActionResult Action([FromBody] UniversityRequest request)
        {
            if (request == null || string.IsNullOrEmpty(request.UniversityName))
            {
                return BadRequest(new { success = false, message = "Invalid request" });
            }

            string universityName = request.UniversityName;

            ValoareUniversitate.setUniversitate(universityName);


            return Json(new { success = true, universityName });
        }
    }

    public class UniversityRequest
    {
        public string UniversityName { get; set; }

        public UniversityRequest() { }
    }
}
