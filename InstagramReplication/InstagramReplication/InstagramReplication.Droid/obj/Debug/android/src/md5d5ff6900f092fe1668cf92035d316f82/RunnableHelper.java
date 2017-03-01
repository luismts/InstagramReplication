package md5d5ff6900f092fe1668cf92035d316f82;


public class RunnableHelper
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.lang.Runnable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("BottomNavigationBar.Utils.RunnableHelper, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", RunnableHelper.class, __md_methods);
	}


	public RunnableHelper () throws java.lang.Throwable
	{
		super ();
		if (getClass () == RunnableHelper.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Utils.RunnableHelper, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

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
