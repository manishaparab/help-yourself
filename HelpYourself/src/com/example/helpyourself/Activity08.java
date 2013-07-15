package com.example.helpyourself;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity08 extends Activity
	{
       
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.hello_display08);
	    setTitle("Help Yourself");
	}
	public void onButtonClicked80(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview80);
		textView.setVisibility(View.VISIBLE);
	}
	public void onButtonClicked81(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview81);
		textView.setVisibility(View.VISIBLE);
	}
	public void onButtonClicked82(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview82);
		textView.setVisibility(View.VISIBLE);
	}
	public void onButtonClicked83(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview83);
		textView.setVisibility(View.VISIBLE);
	}
}