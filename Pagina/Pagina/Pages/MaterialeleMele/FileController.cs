using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Mvc;
using Pagina.Pages.AccesingPages;
using System.Collections.Generic;
using System.IO;

namespace Pagina.Pages.MaterialeleMele
{
    public class FileController : Controller
    {
        private readonly IWebHostEnvironment _environment;

        public FileController(IWebHostEnvironment environment)
        {
            _environment = environment;
        }

        public IActionResult Index()
        {
            string pathFisier = Path.Combine("FileStorage", Details.getUniversitate(), Details.getFacultate(), "licenta");
            string[] filePaths = Directory.GetFiles(Path.Combine(_environment.WebRootPath, pathFisier));

            List<FileModel> fileList = new List<FileModel>();
            foreach (string file in filePaths)
            {
                fileList.Add(new FileModel { FileName = Path.GetFileName(file) });
            }

            return View(fileList); // Trimite lista de fișiere către view
        }

        public IActionResult DownloadFile(string filename)
        {
            string path = Path.Combine(_environment.WebRootPath, "FileStorage", Details.getUniversitate(), Details.getFacultate(), "licenta", filename);
            byte[] bytes = System.IO.File.ReadAllBytes(path);

            return File(bytes, "application/octet-stream", filename);
        }
    }
}
