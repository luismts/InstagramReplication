package md580ea8eb0c0d0bccdc3136efddf84d6d6;


public class OnTabClickListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("BottomNavigationBar.Listeners.OnTabClickListener, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", OnTabClickListener.class, __md_methods);
	}


	public OnTabClickListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OnTabClickListener.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Listeners.OnTabClickListener, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
