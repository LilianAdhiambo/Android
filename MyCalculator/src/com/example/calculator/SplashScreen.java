package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class SplashScreen extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		int SPLASH_TIME = 3000;
		Handler hnd =new Handler();
		hnd.postDelayed(new Runnable(){
			@Override
			public void run(){
				finish();
				startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			}
				},SPLASH_TIME);
	}

}
