using BottomBar.XamarinForms;
using InstagramReplication.Pages;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using XamarinForms.Services;

[assembly: XamlCompilation(XamlCompilationOptions.Compile)]
namespace InstagramReplication
{
    public partial class App : Application
    {
        public static NavigationPage Navigator { get; internal set; }
        public static InstagramService Instagram { get; internal set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="App" /> class.
        /// </summary>
        public App()
        {
            Instagram = new InstagramService();
            InitializeComponent();
            
            MainPage = GetMainPage();
        }

        /// <summary>
        /// Gets the main page
        /// </summary>
        /// <returns>Main page</returns>
        public static Page GetMainPage()
        {
            var main = new MainPage();

            NavigationPage.SetHasNavigationBar(main, false);
            Navigator = new NavigationPage(main);
            Navigator.BarBackgroundColor = Color.FromHex("#fafafa");
            Navigator.BarTextColor = Color.Black;

            return Navigator;
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}

