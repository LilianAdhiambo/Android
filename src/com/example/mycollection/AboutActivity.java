package com.example.mycollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class AboutActivity extends Activity implements OnClickListener {


	//declaring variables
	ImageView imageview;
	ScrollView scrollview;
	Button btnfb,btnIn,btngogle,btnenter,btndecline;
	private WebView broswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);


		imageview=(ImageView)findViewById(R.id.imageView1);
		scrollview=(ScrollView)findViewById(R.id.sv);
		
		btnfb=(Button)findViewById(R.id.btnfb);
		btnfb.setOnClickListener(this);
		
		btnIn=(Button)findViewById(R.id.btnIn);
		btnIn.setOnClickListener(this);
		
		btngogle=(Button)findViewById(R.id.btngogle);
		btngogle.setOnClickListener(this);
		
		btnenter=(Button) findViewById(R.id.btnsubmit);
		btnenter.setOnClickListener(this);
		
		btndecline=(Button)findViewById(R.id.btncancel);
		btndecline.setOnClickListener(this);
		
		broswer=(WebView)findViewById(R.id.Wv);
		broswer.getSettings().setJavaScriptEnabled(true);
		broswer.loadUrl("https://www.facebook.com");
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btncancel:
			startActivity(new Intent(getApplicationContext(),Main.class));
			
			break;
			
		
		default:
			break;
		}
		
	}

}
