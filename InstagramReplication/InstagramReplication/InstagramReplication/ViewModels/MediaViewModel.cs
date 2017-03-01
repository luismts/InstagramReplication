using GalaSoft.MvvmLight.Command;
using Plugin.Media;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
using Xamarin.Forms;

namespace InstagramReplication.ViewModels
{
    /// <summary>
	/// Class MediaViewModel.
	/// </summary>
    public class MediaViewModel : BaseViewModel
    {
        
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaViewModel" /> class.
        /// </summary>
        public MediaViewModel()
        {
            
        }
        
        /// <summary>
        /// Take pickture from camera
        /// </summary>
        /// <returns></returns>
        public async Task<byte[]> TakePhoto()
        {
            try
            {
                // Inizialize all camera components
                await CrossMedia.Current.Initialize();
            }
            catch (Exception)
            {
                return null;
            }

            try
            {
                // Verification that the camera is available or has ability to take photo supported on the device
                if (!CrossMedia.Current.IsCameraAvailable || !CrossMedia.Current.IsTakePhotoSupported)
                {
                    await App.Current.MainPage.DisplayAlert("No Camera", ":( No camera avaialble.", "Ok");
                    return null;
                }

                // Take photo
                var file = await CrossMedia.Current.TakePhotoAsync(new Plugin.Media.Abstractions.StoreCameraMediaOptions
                {
                    PhotoSize = Plugin.Media.Abstractions.PhotoSize.Medium,
                    Directory = "Photos",
                    Name = "IMG-000.jpg"
                });

                // Verification that the file is not null
                if (file == null)
                    return null;
                
                // Copy file in memory
                using (var memoryStream = new System.IO.MemoryStream())
                {
                    file.GetStream().CopyTo(memoryStream);
                    file.Dispose();
                    return memoryStream.ToArray();
                }
            }
            catch (Exception)
            {
                return null;
            }
        }
        
        /// <summary>
        /// Pick picture from gallery
        /// </summary>
        /// <returns></returns>
        public async Task<byte[]> PickPhoto()
        {
            try
            {
                // Verification if has ability to pick photo supported on the device
                if (!CrossMedia.Current.IsPickPhotoSupported)
                {
                    await App.Current.MainPage.DisplayAlert("Photos Not Supported", ":( Permission not granted to photos.", "Ok");
                    return null;
                }

                // Pick photo
                var file = await Plugin.Media.CrossMedia.Current.PickPhotoAsync(new Plugin.Media.Abstractions.PickMediaOptions
                {
                    PhotoSize = Plugin.Media.Abstractions.PhotoSize.Medium
                });

                // Verification that the file is not null
                if (file == null)
                    return null;

                // Copy file in memory
                using (var memoryStream = new System.IO.MemoryStream())
                {
                    file.GetStream().CopyTo(memoryStream);
                    file.Dispose();
                    return memoryStream.ToArray();
                }
            }
            catch (Exception)
            {
                return null;
            }
        }
    }
}
