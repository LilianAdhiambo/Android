package com.example.project;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends ActionBarActivity implements OnClickListener, OnItemSelectedListener {
	
	//declaring variables
	EditText etmail,etpass,etuser;
	Button btndis,btnback;
	Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		//initialising variables
		etmail=(EditText)findViewById(R.id.etmail);
		etpass=(EditText)findViewById(R.id.etpass);
		etuser=(EditText)findViewById(R.id.etuser);
		
		btndis=(Button)findViewById(R.id.btndis);
		btndis.setOnClickListener(this);
		
		btnback=(Button)findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
		spinner1=(Spinner)findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(this);
		
		
		//adding list dynamically
		ArrayList<String>list=new ArrayList<String>();
		
		list.add("Tanzania");
		list.add("Uganda");
		list.add("Kenya");
		list.add("America");
		list.add("Brazil");
		list.add("South Africa");
		list.add("Somalia");
		list.add("Dubai");
		list.add("Morocco");
		list.add("Rwanda");
		list.add("Eritrea");
		list.add("Mogadishu");
		list.add("Sudan");
		
		ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(this,R.layout.simple_layout,list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.btnback:
			startActivity(new Intent(getApplicationContext(),MainActivity.class));
			
			break;
			
		case R.id.btndis:
			Toast.makeText(getApplicationContext(), "etmail +  etpass+ etuser",Toast.LENGTH_SHORT).show();
			
			break;


		default:
			break;
		}
		
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
