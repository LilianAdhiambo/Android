package com.example.akirachix;

import android.content.Intent;
import android.net.MailTo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {
	
	//Declare Variables
	Button btnLogin;
	Button btnRegister;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        
        //Initialize Variables
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(this);
                
        btnRegister = (Button) findViewById(R.id.buttonRegister);
        btnRegister.setOnClickListener(this);

        
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonLogin:
			
//			Intent intentLogin = new Intent(WelcomeScreen.this, LoginScreen.class);
//			startActivity(intentLogin);
			
			startActivity(new Intent(getApplicationContext(), MainActivity.class));
			
			break;
			
		case R.id.buttonRegister:
			
			break;

		default:
			break;
		}
		
	}
	
}
