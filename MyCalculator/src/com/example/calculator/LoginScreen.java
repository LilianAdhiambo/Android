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
import android.widget.EditText;
import android.os.Build;

public class LoginScreen extends ActionBarActivity implements OnClickListener {
	
	EditText etemail,etpassword;
	Button  btnsubmit,btncancel;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//initialize
		etemail = (EditText) findViewById(R.id.etLoginEmail);
		etpassword = (EditText) findViewById(R.id.etPassword);
		
		btnsubmit  = (Button) findViewById(R.id.btnLoginSubmit);
		btnsubmit.setOnClickListener(this);
		btncancel = (Button) findViewById(R.id.btnLoginCancel);
	    btncancel.setOnClickListener(this);

		
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnLoginSubmit:
			startActivity(new Intent(getApplicationContext(),IconScreen.class));
			
			break;
			
case R.id.btnLoginCancel:
	startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			break;


		default:
			break;
		}
		
	}

}
