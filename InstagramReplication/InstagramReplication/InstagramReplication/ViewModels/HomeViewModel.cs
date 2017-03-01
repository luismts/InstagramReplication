using GalaSoft.MvvmLight.Command;
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
    public class HomeViewModel : BaseViewModel
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HomeViewModel" /> class.
        /// </summary>
        public HomeViewModel()
        {
            ValidateLoadData();
        }
        

        #region Commands
        public ICommand GoToCommand
        {
            get { return new RelayCommand(async () => await App.Navigator.PushAsync(new Pages.DMPage())); }
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
        #endregion

        #region Methods
        /// <summary>
        /// Gets data from services
        /// </summary>
        private void LoadData()
        {
            // Verification that the items is not null and the services is not working
            if (App.Instagram.InstagramItems == null && App.Instagram.IsBusy == false)
                App.Instagram.InitDataAsync().ContinueWith(x => InstagramItems = App.Instagram.InstagramItems);
            else
                InstagramItems = App.Instagram.InstagramItems;
        }

        /// <summary>
        /// Validate that the data is loaded correctly
        /// </summary>
        private void ValidateLoadData()
        {
            // Verification that the items is not null
            if (InstagramItems == null)
            {
                // Starts a recurring timer using the device clock capabilities (every second in this case)
                Device.StartTimer(new TimeSpan(0, 0, 0, 1, 0), () =>
                {
                    // Verification that the items is not null
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
