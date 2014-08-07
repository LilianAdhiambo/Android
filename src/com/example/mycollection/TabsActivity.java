package com.example.mycollection;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabsActivity extends TabActivity { 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);
		
		//instantiating the class tab host
		TabHost tabhost=getTabHost();//holds the tabs
		Resources resources = getResources();//access res folder
		
		Intent homeActivity=new Intent().setClass(getApplicationContext(),HomeActivity.class);
		TabSpec hometabspec= tabhost.newTabSpec("Home").setIndicator("Home",resources.getDrawable(R.drawable.ic_launcher))//setting UI for a specific tab
        .setContent(homeActivity);
        
        
        Intent contactsActivity=new Intent().setClass(getApplicationContext(),ContactActivity.class);
		TabSpec contactstabspec= tabhost.newTabSpec("Contact").setIndicator("Contact",resources.getDrawable(R.drawable.ic_launcher))//setting UI for a specific tab
        .setContent(contactsActivity);
		
		Intent aboutActivity= new Intent().setClass(getApplicationContext(),AboutActivity.class);
		TabSpec abouttabspec=tabhost.newTabSpec("About").setIndicator("About",resources.getDrawable(R.drawable.ic_launcher))
				.setContent(aboutActivity);
		
		tabhost.addTab(contactstabspec);
		tabhost.addTab(hometabspec);
		tabhost.addTab(abouttabspec);
		
		
	}

}
