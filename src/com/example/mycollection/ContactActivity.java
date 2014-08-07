package com.example.mycollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.os.Build;

public class ContactActivity extends Activity implements OnClickListener {
	
	Button btnsubmit,btncancel;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact);
		
		btnsubmit=(Button) findViewById(R.id.btnsubmit);
		btnsubmit.setOnClickListener(this);
		
		btncancel=(Button) findViewById(R.id.btncancel);
		btncancel.setOnClickListener(this);

		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		
		case R.id.btncancel:
			startActivity(new Intent(getApplicationContext(),Main.class));
			
			break;

		default:
			break;
		}
		
	}

}
