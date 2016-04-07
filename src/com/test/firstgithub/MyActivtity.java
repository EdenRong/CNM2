package com.test.firstgithub;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MyActivtity extends Activity {

	private TextView textview;
	public int a;
	public String b;
	public boolean c;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.myactivity_layout);
	}
}
