package com.example.mycollection;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Geeks extends Activity implements OnClickListener, OnItemSelectedListener {
	
	//declaring variables
	Spinner spinner1;
	TextView tvtext;
	Button btndisplay,btnback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.geek);
		
		//initiallising of variables
		tvtext=(TextView)findViewById(R.id.tvtext);
		
		btndisplay=(Button) findViewById(R.id.btndisplay);
		btndisplay.setOnClickListener(this);
		
		btnback=(Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
		spinner1=(Spinner)findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(this);
		
		//adding countries dynamically
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("kenya");
		list.add("America");
		list.add("Sudan");
		list.add("Brazil");
		list.add("Holland");
		list.add("Germany");
		list.add("colombia");
		list.add("Tanzania");
		list.add("Somalia");
		list.add("Cote d'Ivore");
		list.add("Nigeria");
		list.add("Chile");
		list.add("Ghana");
		
		//defining design of the spinner
		ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
		
		//setting the design of the drop down
	    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    spinner1.setAdapter(dataAdapter);
	
		}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btndisplay:
			int position = 0;
			//getting text from the spinner
			 spinner1.setSelection(position);
			  String countries = (String) spinner1.getSelectedItem();
			  tvtext.setText("Your country is:" + countries);
			break;
			
		case R.id.btnback:
			startActivity(new Intent(getApplicationContext(),Main.class));

		default:
			break;
		}
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		
		//getting text from the spinner
		 spinner1.setSelection(position);
		  String countries = (String) spinner1.getSelectedItem();
		  tvtext.setText("Your country is:" + countries);
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
