using GalaSoft.MvvmLight.Command;
using PropertyChanged;
using System;
using System.Threading.Tasks;
using System.Windows.Input;
using Xamarin.Forms;

namespace InstagramReplication.ViewModels
{
    [ImplementPropertyChanged]
    public class BaseViewModel : IDisposable
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BaseViewModel" /> class.
        /// </summary>
        public BaseViewModel()
        {
            
        }

        #region Propertys
        /// <summary>
        /// Gets or sets if VM is busy working
        /// </summary>
        public bool IsBusy { get; set; }

        #endregion






        #region Methods
        /// <summary>
        /// Llama al metodo Dispose para liberar los recursos
        /// </summary>
        public void Dispose()
        {
            Dispose(true);
            GC.SuppressFinalize(this);
        }

        /// <summary>
        ///  Liberar los recursos
        /// </summary>
        /// <param name="disposing">parametro que recibe True si quiere liberar los recursos y False si no</param>
        protected virtual void Dispose(bool disposing)
        {
            if (disposing)
            {
                
            }
        }
        
        #endregion

        /// <summary>
        /// Destructor
        /// </summary>
        ~BaseViewModel()
        {
            Dispose(false);
        }

    }
}
