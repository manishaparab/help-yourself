package com.example.helpyourself;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity03 extends Activity
	{
       
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.hello_display03);
	    setTitle("Help Yourself");
	    }
	public void onButtonClicked30(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview30);
		textView.setVisibility(View.VISIBLE);
	}
	public void onButtonClicked31(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview31);
		textView.setVisibility(View.VISIBLE);
	}
}