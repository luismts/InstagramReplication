package md5eda56a8140dce4dc7d57391f82515569;


public class CustomViewPropertyAnimatorListenerAdapter
	extends android.support.v4.view.ViewPropertyAnimatorListenerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnimationEnd:(Landroid/view/View;)V:GetOnAnimationEnd_Landroid_view_View_Handler\n" +
			"n_onAnimationCancel:(Landroid/view/View;)V:GetOnAnimationCancel_Landroid_view_View_Handler\n" +
			"";
		mono.android.Runtime.register ("BottomNavigationBar.Adapters.CustomViewPropertyAnimatorListenerAdapter, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", CustomViewPropertyAnimatorListenerAdapter.class, __md_methods);
	}


	public CustomViewPropertyAnimatorListenerAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CustomViewPropertyAnimatorListenerAdapter.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Adapters.CustomViewPropertyAnimatorListenerAdapter, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public CustomViewPropertyAnimatorListenerAdapter (android.view.View p0, int p1, android.view.View p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == CustomViewPropertyAnimatorListenerAdapter.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Adapters.CustomViewPropertyAnimatorListenerAdapter, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onAnimationEnd (android.view.View p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.view.View p0);


	public void onAnimationCancel (android.view.View p0)
	{
		n_onAnimationCancel (p0);
	}

	private native void n_onAnimationCancel (android.view.View p0);

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
