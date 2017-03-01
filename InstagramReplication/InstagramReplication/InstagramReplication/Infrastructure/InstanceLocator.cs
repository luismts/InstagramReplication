using InstagramReplication.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InstagramReplication.Infrastructure
{
    /// <summary>
    /// Class entry point for the viewModels in the aplication
    /// </summary>
    public class InstanceLocator
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstanceLocator" /> class.
        /// </summary>
        public InstanceLocator()
        {
            Media = new MediaViewModel();
            Home = new HomeViewModel();
            Profile = new ProfileViewModel();
        }

        /// <summary>
        /// Finalizes instance of the <see cref="InstanceLocator" /> class.
        /// </summary>
        ~InstanceLocator()
        {
            Media = null;
            Home = null;
            Profile = null;

            GC.SuppressFinalize(this);
        }
        
        public MediaViewModel Media { get; set; }
        public HomeViewModel Home { get; set; }
        public ProfileViewModel Profile { get; set; }
    }
}
