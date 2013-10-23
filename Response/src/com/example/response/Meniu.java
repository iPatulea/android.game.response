package com.example.response;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Meniu extends Activity {
	
	Button ng;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meniu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.meniu, menu);
		return true;
	}
	
	public void instruction(View v){
		Intent intent=new Intent(Meniu.this, Instruction.class);
		startActivity(intent);
	}
	
	public void game(View v){
		Intent intent=new Intent(Meniu.this, Game.class);
		startActivity(intent);
		finish();
	}
	
	public void quit(View v){
		finish();
	}
	
	

}
