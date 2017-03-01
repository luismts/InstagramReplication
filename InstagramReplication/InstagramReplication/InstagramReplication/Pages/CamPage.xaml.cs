using InstagramReplication.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;

namespace InstagramReplication.Pages
{
    public partial class CamPage : ContentPage
    {
        MediaViewModel media;
        MainPage MainTabPage;

        /// <summary>
        /// Initializes a new instance of the <see cref="CamPage" /> class.
        /// </summary>
        /// <param name="tabpage"></param>
        public CamPage(MainPage tabpage)
        {
            // Sets the resultant tree of objects defined in the xaml as the content of the page
            InitializeComponent();

            // Gets the context
            media = this.BindingContext as MediaViewModel;
            
            // Verification that the mainPage is not null
            if (tabpage != null)
            {
                MainTabPage = tabpage;
                this.Appearing += CamPage_Focused;
            }
        }

        /// <summary>
        /// Procedure to focus the mainPage(home) after taking a photo
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private async void CamPage_Focused(object sender, EventArgs e)
        {
            // Take a photo
            var photo = await media.TakePhoto();

            // Focus selection on homePage
            MainTabPage.CurrentPage = MainTabPage.Children[0]; 
        }
    }
}
