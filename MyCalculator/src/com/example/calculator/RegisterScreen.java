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
import android.widget.Toast;
import android.os.Build;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	EditText etfirstname,etsecondname,etemail,etpassword;
	Button btnsubmit,btncancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//initialize
		etfirstname = (EditText) findViewById(R.id.etRegisterFname);
		etsecondname = (EditText) findViewById(R.id.etRegisterSname);
		etemail = (EditText) findViewById(R.id.etRegisterEmail);
		etpassword = (EditText) findViewById(R.id.etRegisterPassword);
		
		btnsubmit = (Button) findViewById(R.id.btnRegisterSubmit);
		btnsubmit.setOnClickListener(this);
		btncancel = (Button) findViewById(R.id.btnRegisterCancel);
		btncancel.setOnClickListener(this);
		

		
	}

	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnRegisterSubmit:
		startActivity(new Intent(getApplicationContext(),LoginScreen.class));
		break;
		
case R.id.btnRegisterCancel:
	startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
	Toast.makeText(getApplicationContext(), "takes you back to welcome page",2000);
		break;


	default:
		break;
	}
		
	}

}
