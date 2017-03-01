package md5ba8b42cb10c0d0e759100f177321c7f0;


public class BottomNavigationBehavior_1
	extends md5ba8b42cb10c0d0e759100f177321c7f0.VerticalScrollingBehavior_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_layoutDependsOn:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z:GetLayoutDependsOn_Landroid_support_design_widget_CoordinatorLayout_Landroid_view_View_Landroid_view_View_Handler\n" +
			"n_onDependentViewRemoved:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)V:GetOnDependentViewRemoved_Landroid_support_design_widget_CoordinatorLayout_Landroid_view_View_Landroid_view_View_Handler\n" +
			"n_onDependentViewChanged:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z:GetOnDependentViewChanged_Landroid_support_design_widget_CoordinatorLayout_Landroid_view_View_Landroid_view_View_Handler\n" +
			"";
		mono.android.Runtime.register ("BottomNavigationBar.Scrollswetness.BottomNavigationBehavior`1, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", BottomNavigationBehavior_1.class, __md_methods);
	}


	public BottomNavigationBehavior_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BottomNavigationBehavior_1.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Scrollswetness.BottomNavigationBehavior`1, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public BottomNavigationBehavior_1 (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == BottomNavigationBehavior_1.class)
			mono.android.TypeManager.Activate ("BottomNavigationBar.Scrollswetness.BottomNavigationBehavior`1, BottomNavigationBar, Version=1.1.2.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean layoutDependsOn (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2)
	{
		return n_layoutDependsOn (p0, p1, p2);
	}

	private native boolean n_layoutDependsOn (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2);


	public void onDependentViewRemoved (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2)
	{
		n_onDependentViewRemoved (p0, p1, p2);
	}

	private native void n_onDependentViewRemoved (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2);


	public boolean onDependentViewChanged (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2)
	{
		return n_onDependentViewChanged (p0, p1, p2);
	}

	private native boolean n_onDependentViewChanged (android.support.design.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2);

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
