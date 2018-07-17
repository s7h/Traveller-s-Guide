package com.data.travellersguide;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
public class ServiceList extends Activity{

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
	}
	
	
}
