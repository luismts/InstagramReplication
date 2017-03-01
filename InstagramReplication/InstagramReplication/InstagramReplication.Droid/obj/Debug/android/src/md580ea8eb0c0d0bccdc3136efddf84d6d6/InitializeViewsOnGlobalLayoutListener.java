package md580ea8eb0c0d0bccdc3136efddf84d6d6;


public class InitializeViewsOnGlobalLayoutListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("BottomNavigationBar.Listeners.InitializeViewsOnGlobalLayoutListener, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", InitializeViewsOnGlobalLayoutListener.class, __md_methods);
	}


	public InitializeViewsOnGlobalLayoutListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == InitializeViewsOnGlobalLayoutListener.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Listeners.InitializeViewsOnGlobalLayoutListener, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public InitializeViewsOnGlobalLayoutListener (boolean p0, android.support.design.widget.CoordinatorLayout.LayoutParams p1, android.view.View p2, android.view.ViewTreeObserver p3, boolean p4, boolean p5) throws java.lang.Throwable
	{
		super ();
		if (getClass () == InitializeViewsOnGlobalLayoutListener.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Listeners.InitializeViewsOnGlobalLayoutListener, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:Android.Support.Design.Widget.CoordinatorLayout+LayoutParams, Xamarin.Android.Support.Design, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null:Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Views.ViewTreeObserver, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5 });
	}


	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
