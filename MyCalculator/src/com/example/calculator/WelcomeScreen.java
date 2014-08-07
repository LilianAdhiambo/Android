package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {
	Button btnLogin;
	Button btnRegister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		//initialize
		
		btnLogin = (Button) findViewById(R.id.buttonLogin);
		btnLogin.setOnClickListener(this);
		btnRegister = (Button) findViewById(R.id.buttonRegister);
		btnRegister.setOnClickListener(this);
		
		
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonLogin:
			startActivity(new Intent(getApplicationContext(),LoginScreen.class));
			break;
			
case R.id.buttonRegister:
	startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
			break;

		default:
			break;
		}
		
		
	}
		
}
