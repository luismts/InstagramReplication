package md580ea8eb0c0d0bccdc3136efddf84d6d6;


public class BarSizeOnGlobalLayoutListener
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
		mono.android.Runtime.register ("BottomNavigationBar.Listeners.BarSizeOnGlobalLayoutListener, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", BarSizeOnGlobalLayoutListener.class, __md_methods);
	}


	public BarSizeOnGlobalLayoutListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BarSizeOnGlobalLayoutListener.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Listeners.BarSizeOnGlobalLayoutListener, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
