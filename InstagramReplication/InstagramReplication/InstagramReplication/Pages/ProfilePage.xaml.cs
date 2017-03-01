using InstagramReplication.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;

namespace InstagramReplication.Pages
{
    public partial class ProfilePage : ContentPage
    {
        ProfileViewModel context;

        /// <summary>
        /// Initializes a new instance of the <see cref="ProfilePage" /> class.
        /// </summary>
        public ProfilePage()
        {
            // Sets the resultant tree of objects defined in the xaml as the content of the page
            InitializeComponent();

            // Gets the context
            context = this.BindingContext as ProfileViewModel;
        }

        /// <summary>
        /// Procedure to customize behavior immediately prior to the page becoming visible
        /// </summary>
        protected override void OnAppearing()
        {
            base.OnAppearing();

            // Verify that items are loaded correctly
            if (context.InstagramItems == null && context.IsBusy == false)
                context.LoadData();
        }
        
        /// <summary>
        /// Procedure for displaying the ListItems in list form
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void ShowListMode(object sender, EventArgs e)
        {
            // Show the list selected
            photoGridView.IsVisible = false;
            photoListView.IsVisible = true;

            // Sets the color for the icon
            iconList.TintColor = Color.Blue;
            iconGrid.TintColor = Color.Gray;
        }

        /// <summary>
        /// Procedure for displaying the ListItems in grid form
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void ShowGridMode(object sender, EventArgs e)
        {
            // Show the list selected
            photoGridView.IsVisible = true;
            photoListView.IsVisible = false;

            // Sets the color for the icon
            iconList.TintColor = Color.Gray;
            iconGrid.TintColor = Color.Blue;
        }
    }
}
