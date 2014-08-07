package com.example.mycollection;


import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends Activity implements OnItemClickListener {
	
		//declaring variables
			private ListView listview;
			private ArrayAdapter<String>StringArrayAdapter;
			String[] content={"Counter","Login","Geek","mathematics","tabs Activity","Webview Activity"};
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		

		// Initialization
		listview = (ListView) findViewById(R.id.mainList);
		ArrayList<String> contentList = new ArrayList<String>();
		contentList.addAll(Arrays.asList(content));

		// Design the ListView
		StringArrayAdapter = new ArrayAdapter<String>(this,R.layout.simple_layout, contentList);
		listview.setAdapter(StringArrayAdapter);
		listview.setOnItemClickListener(this);
	}
	
		  
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			
			String ListData= listview.getItemAtPosition(position).toString();
			switch (position) {
			case 0:
				startActivity(new Intent(getApplicationContext(),Counters.class));
				break;
				
			case 1:
				startActivity(new Intent(getApplicationContext(),Logins.class));
			break;
			
			case 2:
				startActivity(new Intent(getApplicationContext(),Geeks.class));
				break;
				
			case 3:
				startActivity(new Intent(getApplicationContext(),Mathematics.class));
				break;
				
			case 4:
				startActivity(new Intent(getApplicationContext(),TabsActivity.class));
				break;
				
			case 5:
				startActivity(new Intent(getApplicationContext(),WebViewActivity.class));
				break;
				
				
			default:
				break;
			
			
		}
			}
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	

