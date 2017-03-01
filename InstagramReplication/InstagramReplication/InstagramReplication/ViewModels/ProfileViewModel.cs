using GalaSoft.MvvmLight.Command;
using InstagramReplication.Pages;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
using Xamarin.Forms;
using XamarinForms.Models;

namespace InstagramReplication.ViewModels
{
    public class ProfileViewModel : BaseViewModel
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProfileViewModel" /> class.
        /// </summary>
        public ProfileViewModel()
        {
            ValidateLoadData();
        }

        #region Commands
        public ICommand GoToCommand
        {
            get { return new RelayCommand<string>(GoTo); }
        }
        #endregion

        #region Properties
        private List<InstagramItem> _instagramItems;
        public List<InstagramItem> InstagramItems
        {
            get { return _instagramItems; }
            set
            {
                if (_instagramItems == null && value != null)
                    _instagramItems = new List<InstagramItem>();

                _instagramItems = value;
            }
        }

        private InstagramItem _instagramProfile;
        public InstagramItem InstagramProfile
        {
            get { return _instagramProfile; }
            set
            {
                if (_instagramProfile == null && value != null)
                    _instagramProfile = new InstagramItem();

                _instagramProfile = value;
            }
        }

        private bool _isGridVisible = true;
        public bool IsGridVisible
        {
            get { return _isGridVisible; }
            set { _isGridVisible = value; }
        }
        #endregion

        #region Methods
        /// <summary>
        /// Navega hacia la pagina nada
        /// </summary>
        /// <param name="pageName">nombre de la pagina</param>
        public async void GoTo(string pageName)
        {
            switch (pageName)
            {
                case "PhotosAppearPage":
                    await App.Navigator.PushAsync(new PhotosAppearPage());
                    break;
                case "OptionsPage":
                    await App.Navigator.PushAsync(new OptionsPage()); 
                    break;
                case "DescribesPeoplePage":
                    await App.Navigator.PushAsync(new DescribesPeoplePage());
                    break;
                case "BackPage":
                    await App.Navigator.PopAsync(); //Navegar a la pagina anterior 
                    break;
                default:
                    break;
            }
        }

        public async void LoadData()
        {
            IsBusy = true;

            if (App.Instagram.InstagramItems == null)
            {
                await App.Instagram.InitDataAsync().ContinueWith(x => InstagramItems = App.Instagram.InstagramItems);

                if(InstagramItems != null)
                    InstagramProfile = InstagramItems[0];
            }
            else
            {
                InstagramItems = App.Instagram.InstagramItems;

                if (InstagramItems != null)
                    InstagramProfile = InstagramItems[0];
            }
            
            IsBusy = false;
        }

        private void ValidateLoadData()
        {
            if (InstagramItems == null)
            {
                Device.StartTimer(new TimeSpan(0, 0, 0, 1, 0), () =>
                {
                    if (InstagramItems == null)
                    {
                        LoadData();
                        return true;
                    }

                    return false;
                });
            }
            else
            {
                LoadData();
            }
        }
        #endregion
    }
}
