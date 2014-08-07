package com.example.project;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class LoginActivity extends ActionBarActivity implements OnClickListener, OnCheckedChangeListener {
	
	//declaring variables
	Button btnbac,btnsub;
	EditText etmail,etpass;
	CheckBox cb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		//initializing variables
		btnbac=(Button)findViewById(R.id.btnbac);
		btnbac.setOnClickListener(this);
		
		btnsub=(Button)findViewById(R.id.btnsub);
		btnsub.setOnClickListener(this);
		
		
		etmail=(EditText)findViewById(R.id.etmail);
		etpass=(EditText)findViewById(R.id.etpass);
		
		cb=(CheckBox)findViewById(R.id.cb);
		cb.setOnCheckedChangeListener(this);
		

		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnbac:
			startActivity(new Intent(getApplicationContext(),MainActivity.class));
			
			break;
			
		case R.id.btnsub:
			String Email="Akirachix@gmail.com";
			String Password="girl@ict2013";
			
			if(etmail.getText().toString().equals(Email) && etpass.getText().toString().equals(Password)){
				
       Toast.makeText(getApplicationContext(),Email +  Password, Toast.LENGTH_SHORT).show();				
			}else if(!etmail.getText().toString().equals(Email) && !etpass.getText().toString().equals(Password)){
				
				Toast.makeText(getApplicationContext(), "Incorrect details", Toast.LENGTH_SHORT).show();
				
			}
			
			break;

		default:
			break;
		}
		
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if(!isChecked){
			
			etpass.setTransformationMethod(PasswordTransformationMethod.getInstance());
			
		} else
		{
			etpass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
		}
		
	}

}
