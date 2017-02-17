// Create Package for main screen
package com.planner;

// Importing Android Packages
import android.app.Activity;          
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashActivity extends Activity  // Starting Activity Class
 {
    ImageView animation;
    public void onCreate(Bundle savedInstanceState) // OnCreate Life Cycle of activity class starts
 {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); // Calling Layout from Layout ID R.Java File
        animation = (ImageView) findViewById(R.id.AnimInageview); // Calling Anim from Layout ID R.Java File
        Toast.makeText(getApplicationContext(), "Loading Please Wait ..", Toast.LENGTH_LONG).show(); // It Will Make text if Application Runs
        myAnimation();
        Thread splashThread = new Thread() // Creating Thread object
{
          public void run(){
     
   		try{                   // Exception Handling Block
        		
	sleep(3500);
 }
catch(Exception ae){
   
     		Toast.makeText(getApplicationContext(), "Error in Loading ..", Toast.LENGTH_SHORT).show();

        		}
finally{
        			
finish();
        			
Intent goMain = new Intent(getApplicationContext(),MainScreen.class); // This Function Take Application to the Next Screen Which Is main Screen

        			startActivity(goMain);
   
     			System.out.println("1...Control at Splash SCreen last Line " );
        		}

        	}
        };
        splashThread.start();
    }
    public void myAnimation(){          // For Applying Animation to the Image

		      
    	TranslateAnimation sc=new TranslateAnimation( 0, 0, -200, 0) ;
		 sc.setDuration(3000);
		 animation.startAnimation(sc);
	
    }
}