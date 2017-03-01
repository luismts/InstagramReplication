package md5eda56a8140dce4dc7d57391f82515569;


public class CustomAnimatorListenerAdapter
	extends android.animation.AnimatorListenerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnimationEnd:(Landroid/animation/Animator;)V:GetOnAnimationEnd_Landroid_animation_Animator_Handler\n" +
			"n_onAnimationCancel:(Landroid/animation/Animator;)V:GetOnAnimationCancel_Landroid_animation_Animator_Handler\n" +
			"";
		mono.android.Runtime.register ("BottomNavigationBar.Adapters.CustomAnimatorListenerAdapter, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", CustomAnimatorListenerAdapter.class, __md_methods);
	}


	public CustomAnimatorListenerAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CustomAnimatorListenerAdapter.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Adapters.CustomAnimatorListenerAdapter, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public CustomAnimatorListenerAdapter (android.view.View p0, int p1, android.view.View p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == CustomAnimatorListenerAdapter.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Adapters.CustomAnimatorListenerAdapter, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onAnimationEnd (android.animation.Animator p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.animation.Animator p0);


	public void onAnimationCancel (android.animation.Animator p0)
	{
		n_onAnimationCancel (p0);
	}

	private native void n_onAnimationCancel (android.animation.Animator p0);

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
