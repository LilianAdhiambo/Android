package com.example.mycollection;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Logins extends Activity implements OnClickListener, OnCheckedChangeListener {

	EditText etuser,etpass;
	TextView tvuser,tvpass;
	Button btntoast,btnback;
	CheckBox chshow;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logins);
		
		etuser=(EditText) findViewById(R.id.etuser);
		
		etpass=(EditText) findViewById(R.id.etpass);
		
		//creating a custom to a text 	view
		tvuser=(TextView)findViewById(R.id.tvuser);
		//Typeface font=Typeface.createFromAsset(getAssets(), "Gabrielle.ttf");
		//tvuser.setTypeface(font);
		
		tvpass=(TextView)findViewById(R.id.tvpass);
		//Typeface font1=Typeface.createFromAsset(getAssets(), "Gabrielle.ttf");
		//tvpass.setTypeface(font1);
		
		
		btntoast=(Button) findViewById(R.id.btntoast);
		btntoast.setOnClickListener(this);
		
		btnback=(Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
		chshow=(CheckBox) findViewById(R.id.chshow);
		
		//creating a font for the check box
		//Typeface font2=Typeface.createFromAsset(getAssets(), "Gabrielle");
		//chshow.setTypeface(font2);
		
		chshow.setOnCheckedChangeListener(this);
		
		
		

	}


	@Override
	public void onClick(View v) {
		
		
		
		
		
	switch (v.getId()) {
	case R.id.btnback :
		startActivity(new Intent(getApplicationContext(),Main.class));
		
		break;
		
	case R.id.btntoast:
		
		//initialising the password and username
		String userName="Akira";
		String password="Geek";
		
		//checking if both the fields are empty
		if(etuser.getText().toString().equals("") && etpass.getText().toString().equals("")){
			Toast.makeText(getApplicationContext(), "please enter username and password", Toast.LENGTH_SHORT).show();
			
	  }//checking if user name is empty
		else if(etuser.getText().toString().equals("")){
		Toast.makeText(getApplicationContext(), "please enter username", Toast.LENGTH_SHORT).show();
	}
		//checking if password is empty
		else if(etpass.getText().toString().equals("")){
			Toast.makeText(getApplicationContext(), "please enter password", Toast.LENGTH_SHORT).show();
	}
		//checking if both the user name and password match
		else if(etuser.getText().toString().equals(userName) && etpass.getText().toString().equals(password)){
		Toast.makeText(getApplicationContext(), "login successful..welcome", Toast.LENGTH_SHORT).show();
		
	} 
		//checking if user name match
		else if(!etuser.getText().toString().equals(userName)){
		Toast.makeText(getApplicationContext(), "incorrect username", Toast.LENGTH_SHORT).show();
	}
		//checking if password match
		else if(!etpass.getText().toString().equals(password)){
		Toast.makeText(getApplicationContext(), "incorrect password", Toast.LENGTH_SHORT).show();
	}
		
		break;

	default:
		break;
		
		
		
	}	
}


	@Override
	public void onCheckedChanged(CompoundButton button, boolean ischecked) {
		if(!ischecked){
			
			//showing password
			etpass.setTransformationMethod(PasswordTransformationMethod.getInstance());
			
		} else {
			
			//hiding password
			etpass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

		}
		
	}

}
