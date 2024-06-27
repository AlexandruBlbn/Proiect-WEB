// Register.cshtml.cs

using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Pagina.Pages.AccesingPages.Register
{
    public class RegisterModel : PageModel
    {
        private readonly RegisterOperations _registerOperations;

        public RegisterModel(RegisterOperations registerOperations)
        {
            _registerOperations = registerOperations;
        }

        [BindProperty]
        public string Username { get; set; }

        [BindProperty]
        public string Password { get; set; }

        [BindProperty]
        public string ConfirmPassword { get; set; }

        [BindProperty]
        public string InstitutionalEmail { get; set; }

        [BindProperty]
        public string University { get; set; }

        [BindProperty]
        public string Faculty { get; set; }

        [BindProperty]
        public string RecoveryEmail { get; set; }

        [BindProperty]
        public string Specialization { get; set; }

        public List<UniversityModel> UniversityList { get; private set; }
        public List<FacultyModel> FacultyList { get; private set; }
        public List<SpecializationModel> SpecializationList { get; private set; }

        public void OnGet()
        {
            UniversityList = _registerOperations.GetUniversities();
            FacultyList = new List<FacultyModel>();     
            SpecializationList = new List<SpecializationModel>();
        }

        public IActionResult OnGetFaculties(string university)
        {
            try
            {
                var faculties = _registerOperations.GetFaculties(university);
                return new JsonResult(faculties);
            }
            catch (ArgumentException ex)
            {
                return BadRequest(ex.Message);
            }
            catch (SqlException ex)
            {
                return BadRequest("Error fetching faculties: " + ex.Message);
            }
        }

        public IActionResult OnGetSpecializations(string faculty)
        {
            try
            {
                var specializations = _registerOperations.GetSpecializations(faculty);
                return new JsonResult(specializations);
            }
            catch (SqlException ex)
            {
                return BadRequest("Error fetching specializations: " + ex.Message);
            }
        }

        public IActionResult OnPost()
        {
            if (!ModelState.IsValid)
            {
                return Page();
            }
            if (Password != ConfirmPassword)
            {
                ModelState.AddModelError("", "Parolele nu coincid!");
                return Page();
            }
            try
            {
                _registerOperations.OperationRegister(Username, Password, InstitutionalEmail, RecoveryEmail, University, Faculty, Specialization);
                return RedirectToPage("../Login/LoginPagina");
            }
            catch (SqlException ex)
            {
                ModelState.AddModelError("", "Error registering user: " + ex.Message);
                return Page();
            }
        }
    }
}
