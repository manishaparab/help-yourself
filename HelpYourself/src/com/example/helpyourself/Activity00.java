package com.example.helpyourself;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity00 extends Activity
	{
       
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.hello_display00);
	    setTitle("Help Yourself");
	   }
	public void onButtonClicked00(View view)
	{
		TextView textView=(TextView)findViewById(R.id.textview00);
		textView.setVisibility(View.VISIBLE);
	}
}