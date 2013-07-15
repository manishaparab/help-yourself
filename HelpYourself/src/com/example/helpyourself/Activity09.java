package com.example.helpyourself;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity09 extends Activity
	{
       
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.hello_display09);
	    setTitle("Help Yourself");
	    }
	public void onButtonClicked90(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview90);
		textView.setVisibility(View.VISIBLE);
	}
	public void onButtonClicked91(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview91);
		textView.setVisibility(View.VISIBLE);
	}
	public void onButtonClicked92(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview92);
		textView.setVisibility(View.VISIBLE);
	}
}