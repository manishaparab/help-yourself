package com.example.helpyourself;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity01 extends Activity
	{
       
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.hello_display01); 
	    setTitle("Help Yourself");
	}
	public void onButtonClicked10(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview10);
		textView.setVisibility(View.VISIBLE);
	}
}