using Microsoft.Extensions.DependencyInjection;
using Pagina.Pages.AccesingPages.Register;

public static class NewServiceConfiguration
{
    public static void ConfigureNewServices(IServiceCollection services)
    {
        services.AddSingleton<RegisterOperations>();

    }
}