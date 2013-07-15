package com.example.helpyourself;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity12 extends Activity
	{
       
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.hello_display12);
	    setTitle("Help Yourself");
	    }
	public void onButtonClicked120(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview120);
		textView.setVisibility(View.VISIBLE);
	}
	public void onButtonClicked121(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview121);
		textView.setVisibility(View.VISIBLE);
	}
	public void onButtonClicked122(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview122);
		textView.setVisibility(View.VISIBLE);
	}
}