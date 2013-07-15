package com.example.helpyourself;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	private boolean mIsBackButtonPressed;
    private static final int SPLASH_DURATION = 3000; // 3 seconds
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
            Handler handler = new Handler();

            // run a thread after 3 seconds to start the home screen
            handler.postDelayed(new Runnable() {

                @Override
                public void run() {

                    // make sure we close the splash screen so the user won't come back when it presses back key

                    finish();

                    if (!mIsBackButtonPressed) {
                        // start the home screen if the back button wasn't pressed already 
                        Intent intent = new Intent(getApplicationContext(), Activity0.class);
                        
                        MainActivity.this.startActivity(intent);
                   }

                }

            }, SPLASH_DURATION); // time in milliseconds (1 second = 1000 milliseconds) until the run() method will be called

        }

        @Override
       public void onBackPressed() {

            // set the flag to true so the next activity won't start up
            mIsBackButtonPressed = true;
            super.onBackPressed();

        }
        
        public void onConfigurationChanged(Configuration newConfig) {
	        super.onConfigurationChanged(newConfig);
	 
	        // Checks the orientation of the screen
	        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
	            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
	        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
	            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
	        }
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
