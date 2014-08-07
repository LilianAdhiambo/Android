package com.example.mycollection;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;

public class SplashScreen extends Activity {
	
	//declaring variables for the motion event
	float x1,x2;
	float y1,y2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		
		//setting time for the splashscreen

		int SPLASH_TIME = 3000;
		Handler hnd =new Handler();
		hnd.postDelayed(new Runnable(){
			@Override
			public void run(){
				finish();
				startActivity(new Intent(getApplicationContext(),Main.class));
			}
				},SPLASH_TIME);
	}
	
	  // onTouchEvent () method gets called when User performs any touch event on screen 
    // Method to handle touch event like left to right swap and right to left swap
                 public boolean onTouchEvent(MotionEvent touchevent) 
                 {
                              switch (touchevent.getAction())
                              {
                                     // when user first touches the screen we get x and y coordinate
                                      case MotionEvent.ACTION_DOWN: 
                                      {
                                          x1 = touchevent.getX();
                                          y1 = touchevent.getY();
                                          break;
                                     }
                                      case MotionEvent.ACTION_UP: 
                                      {
                                          x2 = touchevent.getX();
                                          y2 = touchevent.getY(); 
                                          
                                          break;
                                      }
                              }
                              return false;
                 }

}
