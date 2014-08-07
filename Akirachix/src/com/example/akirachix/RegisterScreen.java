package com.example.akirachix;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterScreen extends ActionBarActivity implements OnClickListener{
	//Declaring of variables
	EditText  etFirstname,etSecondname,etEmail,etPassword;
	
	String strFirstName,strSecondName,strEmail,strPassword;
	
	Button btnSubmit, btnCancel;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//intialization of variables
		
		etFirstname = (EditText) findViewById(R.id.etRegisterFname);
		etSecondname = (EditText) findViewById(R.id.etRegisterSname);
		etEmail = (EditText) findViewById(R.id.etRegisterEmail);
		etPassword = (EditText) findViewById(R.id.etRegisterPassword);
		
		//Get Data from the EditText
		strFirstName = etFirstname.getText().toString();
		strSecondName = etSecondname.getText().toString();
		strEmail  = etEmail.getText().toString();
		strPassword = etPassword.getText().toString();
		
		btnCancel = (Button) findViewById(R.id.btnRegisterCancel);
		btnCancel.setOnClickListener(this);
		
		btnSubmit = (Button) findViewById(R.id.btnRegisterSubmit);
		btnSubmit.setOnClickListener(this);
		
	}



	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnRegisterCancel:
			
			break;
			
		case R.id.btnRegisterSubmit:
			
			Toast.makeText(RegisterScreen.this, strFirstName + " " + strSecondName + " " +strPassword, Toast.LENGTH_SHORT).show();
			
			break;

		default:
			break;
		}
		
	}
	

}
