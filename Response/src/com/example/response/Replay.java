package com.example.response;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Replay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_replay);
		
		Bundle b1 = new Bundle();
		b1 = getIntent().getExtras();
		String fin = b1.getString("final");
		TextView t1 = (TextView) findViewById(R.id.textfin);
		t1.setText("Congratulation "+fin+" !");
		Button P1 = (Button) findViewById(R.id.Replay);
		P1.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			      // TODO Auto-generated method stub
				   Intent intent=new Intent(Replay.this, Game.class);
					startActivity(intent);
			   }
		 });
		Button P2 = (Button) findViewById(R.id.Meniu);
		P2.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			      // TODO Auto-generated method stub
				   Intent intent=new Intent(Replay.this, Meniu.class);
				   startActivity(intent);
				   finish();
			   }
		 });
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.replay, menu);
		return true;
	}

}
