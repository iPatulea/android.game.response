package com.example.response;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Game extends Activity {
	
	ImageView W,b1,b2;
	RelativeLayout B;
	boolean sem = true, pressed = true;
	int scrj=0,in=12,scrs=0;
	double sec;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		b1 = (ImageView) findViewById(R.id.status1);
		b2 = (ImageView) findViewById(R.id.status2);
		W = (ImageView) findViewById(R.id.imageView1);
		Button P1 = (Button) findViewById(R.id.butonjos);
		P1.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			      // TODO Auto-generated method stub
					TextView t = (TextView) findViewById(R.id.scorjos);
					if ( pressed == false ){
						b1.setVisibility(View.VISIBLE);
						if ( sem == true ){
							scrj++;
							t.setText(""+scrj);
							b1.setImageResource(R.drawable.good);
						}
						if ( sem == false ){
							scrj--;
							t.setText(""+scrj);
							b1.setImageResource(R.drawable.bad);
						}
						pressed=true;
					}
					else
					if ( pressed == true &&  sem == false){
						b1.setVisibility(View.VISIBLE);
						scrj--;
						t.setText(""+scrj);
						b1.setImageResource(R.drawable.bad);
					}
			   }
		 });
		Button P2 = (Button) findViewById(R.id.butonsus);
		P2.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			      // TODO Auto-generated method stub
					TextView t = (TextView) findViewById(R.id.scorsus);
					if ( pressed == false ){
						b2.setVisibility(View.VISIBLE);
						if ( sem == true ){
							scrs++;
							t.setText(""+scrs);
							b2.setImageResource(R.drawable.good);
						}
						if ( sem == false ){
							scrs--;
							t.setText(""+scrs);
							b2.setImageResource(R.drawable.bad);
						}
						pressed=true;
					}
					else
					if ( pressed == true &&  sem == false){
						b2.setVisibility(View.VISIBLE);
						scrs--;
						t.setText(""+scrs);
						b2.setImageResource(R.drawable.bad);
					}
			   }
			  });
		CountDownTimer waitTimer;
		sec = 1000+(Math.random() * (3000));
		B = (RelativeLayout) findViewById(R.id.fond);
		waitTimer = new CountDownTimer(58000,1) {
			public void onTick(long millisUntilFinished) {
				
				if (millisUntilFinished <= 54010 && millisUntilFinished >=53990){
					B.setBackgroundResource(R.drawable.backgroundgame1start3);
				}
				if (millisUntilFinished <= 53010 && millisUntilFinished > 52990){
					B.setBackgroundResource(R.drawable.backgroundgame1start2);
				}
				if (millisUntilFinished <= 52010 && millisUntilFinished > 51990){
					B.setBackgroundResource(R.drawable.backgroundgame1star1);
				}
				if (millisUntilFinished <= 51010 && millisUntilFinished > 50990){
					B.setBackgroundResource(R.drawable.backgroundgame1stargo);
				}
				if (millisUntilFinished <= 49010 && millisUntilFinished > 48990){
					B.setBackgroundResource(R.drawable.backgroundgame1);
					W.setVisibility(View.INVISIBLE);
					W.setImageResource(R.drawable.white);
					sem = false; pressed = false;
				}
				if (millisUntilFinished >  48000*in/12 - sec && millisUntilFinished < 48000*in/12){
						W.setVisibility(View.INVISIBLE);
				}
				if (millisUntilFinished <= 48000*in/12 - sec + 10 && millisUntilFinished >= 48000*in/12 - sec - 10){
					sem=true;
					pressed=false;
				}
				if (millisUntilFinished <  48000*in/12 - sec && millisUntilFinished >  48000*in/12 - 4000){
						W.setVisibility(View.VISIBLE);
				}
				if (millisUntilFinished >= 48000*in/12 - 4010 && millisUntilFinished <= 48000*in/12 - 3990){
					in--;
					pressed=false;
					sec = 1000+(Math.random() * (3000));
					sem=false;
				}
			}
			public void onFinish() {
				sem = true;
				b1.setVisibility(View.INVISIBLE);
				b2.setVisibility(View.INVISIBLE);
				W.setVisibility(View.INVISIBLE);
				pressed = true;
				String scor1 = "" + scrj, scor2 = "" + scrs;
				Intent intent=new Intent(Game.this, Game2.class);
				intent.putExtra("scor1", scor1);
				intent.putExtra("scor2", scor2);
				startActivity(intent);
				finish();
			}	
		}.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

}
