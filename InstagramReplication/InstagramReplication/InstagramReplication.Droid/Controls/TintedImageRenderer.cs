using System;
using Xamarin.Forms;
using InstagramReplication.Controls;
using InstagramReplication.Droid.Controls;
using Xamarin.Forms.Platform.Android;
using Android.Graphics;
using System.ComponentModel;

[assembly: ExportRendererAttribute(typeof(TintedImage), typeof(TintedImageRenderer))]
namespace InstagramReplication.Droid.Controls
{
    public class TintedImageRenderer : ImageRenderer
    {
        protected override void OnElementChanged(ElementChangedEventArgs<Image> e)
        {
            base.OnElementChanged(e);

            SetTint();
        }

        protected override void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
        {
            base.OnElementPropertyChanged(sender, e);

            if (e.PropertyName == TintedImage.TintColorProperty.PropertyName)
                SetTint();
        }

        void SetTint()
        {
            if (Control != null && Element != null)
            {
                var colorFilter = new PorterDuffColorFilter(((TintedImage)Element).TintColor.ToAndroid(), PorterDuff.Mode.SrcIn);
                Control.SetColorFilter(colorFilter);
            }
        }
    }
}
