package com.example.mycollection;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Counters extends Activity implements OnClickListener {
	
	//declaring variables
	EditText etnumber;
	TextView tvnumber,tvresult;
	Button btnIncre,btnDecre,btnback;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counter);

		//initializing variables
		etnumber=(EditText)findViewById(R.id.etnumber);
		
		tvnumber=(TextView) findViewById(R.id.tvnumber);
		tvresult=(TextView) findViewById(R.id.tvresult);
		
		btnIncre=(Button) findViewById(R.id.btnIncre);
		btnIncre.setOnClickListener(this);
		
		
		btnDecre=(Button) findViewById(R.id.btnDecre);
		btnDecre.setOnClickListener(this);
		
		

	}
	
	/*public int handleInt(int num, int option)
	{
		int val = num;
		if(option == 0) // increment
		{
			num = Integer.parseInt(etnumber.getText().toString());
			value;
			tvresult.setText("The increment is:" + value);
		}
		
		return num;
	}
	*/
	@Override
	public void onClick(View v) {
		
int value = 0;
switch (v.getId()) {
case R.id.btnIncre:
	
	value = Integer.parseInt(etnumber.getText().toString());
	++value; // pre-increment
	etnumber.setText("" + value); // update text
	tvresult.setText("The increment is:" + value); //update label
	
	break;
	
case R.id.btnDecre:

		value = Integer.parseInt(etnumber.getText().toString());
		--value;
		etnumber.setText("" + value); // update text
		tvresult.setText("The decrement is:" + value); // update label
			
	break;

default:
	break;
}
		
		
		
	}

}
