package com.example.project;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class Splash extends ActionBarActivity {
	
	float x1,x2;
	float y1,y2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		int SPLASH_TIME=3000;
		Handler hnd=new Handler();
		hnd.postDelayed(new Runnable(){

			@Override
			public void run() {
				finish();
				startActivity(new Intent(getApplicationContext(),MainActivity.class));
				
			}
			
		}, SPLASH_TIME);
		
	}
	
	public boolean OnTouchEvent(MotionEvent touchevent){
		
		switch (touchevent.getAction()) {
		case MotionEvent.ACTION_UP:
		{
			x1=touchevent.getX();
			y1=touchevent.getY();
			break;
		}
		case MotionEvent.ACTION_DOWN:
		{
			x2=touchevent.getX();
			y2=touchevent.getY();
			break;
		}
		default:
			break;
		}
		
	
	return false;

}
}
