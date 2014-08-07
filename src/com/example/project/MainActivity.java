package com.example.project;

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

public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	//declaring variables
	Button btnreg,btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//initializing variables
		btnreg=(Button)findViewById(R.id.btnreg);
		btnreg.setOnClickListener(this);
		
		btnLogin=(Button)findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnLogin:
			startActivity(new Intent(getApplicationContext(),LoginActivity.class));
			
			break;
			
		case R.id.btnreg:
			startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
			
			break;

		default:
			break;
		}
		
	}

}
