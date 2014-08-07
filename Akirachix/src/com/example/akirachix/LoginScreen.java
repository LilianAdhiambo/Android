package com.example.akirachix;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends ActionBarActivity implements OnClickListener {

	//Declaration of Variables
	Button btnCancel;
	Button btnSubmit;
	
	EditText etEmail;
	EditText etPassword;
	
	String strLoginEmail, strLoginPassword;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		//Initialization of Variables
		btnCancel = (Button) findViewById(R.id.btnLoginCancel);
		btnCancel.setOnClickListener(this);
		btnSubmit = (Button) findViewById(R.id.btnLoginSubmit);
		btnSubmit.setOnClickListener(this);
		
		//Get the values of the EditText
		strLoginEmail = etEmail.getText().toString();
		strLoginPassword = etPassword.getText().toString();
		
		
		etEmail = (EditText) findViewById(R.id.etLoginEmail);
		etPassword = (EditText) findViewById(R.id.etLoginPassword);
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btnLoginCancel:
			
			Toast.makeText(getApplicationContext(), "Cancel Button has been Clicked", Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.btnLoginSubmit:
			
			//Display message or values Entered by the user.
			Toast.makeText(getApplicationContext(), strLoginEmail, Toast.LENGTH_LONG).show();
			break;

		default:
			break;
		}
	}

	
}
