package com.example.calculator;

import com.example.calculator.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.os.Build;

public class IconScreen extends ActionBarActivity implements OnClickListener {
	Button btnIconsubmit;
	Button btnIconcancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.icon);
		btnIconsubmit = (Button) findViewById(R.id.btnIconsubmit);
		btnIconsubmit.setOnClickListener(this);
		btnIconcancel = (Button) findViewById(R.id.btnIconcancel);
		btnIconcancel.setOnClickListener(this);

		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnIconcancel:
			Toast.makeText(getApplicationContext(), "you are about to leave this page",2000);
			break;
			
			case R.id.btnIconsubmit:
				break;
				

		default:
			break;
		}
	
		
	}

}
