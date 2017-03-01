using BottomBar.XamarinForms;
using InstagramReplication.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
using System.Text;

using Xamarin.Forms;

namespace InstagramReplication.Pages
{
    public class MainPage : BottomBarPage
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MainPage" /> class.
        /// </summary>
        public MainPage()
        {
            // some configuration
            BarBackgroundColor = Color.White;
            BarTextColor = Color.Gray; // Setting Color of selected Text and Icon
            
            // create tab page
            var home = new HomePage();
            var search = new SearchPage();
            var cam = new CamPage(this);
            var like = new LikePage();
            var profile = new ProfilePage();
            
            // tab color
            home.SetTabColor(Color.FromHex("#fafafa"));
            search.SetTabColor(Color.FromHex("#fafafa"));
            like.SetTabColor(Color.FromHex("#fafafa"));
            profile.SetTabColor(Color.FromHex("#fafafa"));
            cam.SetTabColor(Color.FromHex("#fafafa"));

            // add tab pag to tab control
            Children.Add(home);
            Children.Add(search);
            Children.Add(cam);
            Children.Add(like);
            Children.Add(profile);
        }
    }
}
