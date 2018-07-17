package com.data.travellersguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import android.widget.ListView;
public class HotelList extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.d("Check point", "one");
		setContentView(R.layout.listview);
		Log.d("Check point", "two");
		HotelListAdapter hla= new HotelListAdapter(this);
		Log.d("Check point", "three");
		ListView list = (ListView)findViewById(R.id.list);
		Log.d("Check point", "four");
		list.setAdapter(hla);
		list.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent=new Intent(HotelList.this,ShowDetails.class);
				startActivity(myIntent);
				
			}
		});
	}

}
	
		

	
	
	

