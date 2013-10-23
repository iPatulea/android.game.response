package com.example.response;




import java.util.Random;

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

public class Game2 extends Activity {

	double wh;
	int scrs,scrj,f1=0,f2=0,f3=0,ok=0,i,k;
	RelativeLayout B;
	ImageView I,b12,b22;
	boolean sem = true, pressed = true;
	int images[] = {R.drawable.anglia, R.drawable.australia, R.drawable.nouazeelanda, R.drawable.bosnia, R.drawable.estonia, R.drawable.ghana, R.drawable.sua,
			R.drawable.macedonia, R.drawable.elvetia, R.drawable.italia, R.drawable.russia, R.drawable.franta, R.drawable.spain};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game2);
		b12 = (ImageView) findViewById(R.id.status12);
		b22 = (ImageView) findViewById(R.id.status22);
		
		Bundle b1 = new Bundle();
		b1 = getIntent().getExtras();
		String scor1 = b1.getString("scor1");
		TextView t1 = (TextView) findViewById(R.id.scorjos2);
		t1.setText(scor1);
		
		Bundle b2 = new Bundle();
		b2 = getIntent().getExtras();
		String scor2 = b2.getString("scor2");
		TextView t2 = (TextView) findViewById(R.id.scorsus2);
		t2.setText(scor2);
		
		scrj = Integer.parseInt(scor1);
		scrs = Integer.parseInt(scor2);
		
		
		Button P1 = (Button) findViewById(R.id.butonjos2);
		P1.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			      // TODO Auto-generated method stub
					TextView t = (TextView) findViewById(R.id.scorjos2);
					if ( pressed == false ){
						b12.setVisibility(View.VISIBLE);
						if ( sem == true ){
							scrj++;
							t.setText(""+scrj);
							b12.setImageResource(R.drawable.good);
						}
						if ( sem == false ){
							scrj--;
							t.setText(""+scrj);
							b12.setImageResource(R.drawable.bad);
						}
						pressed=true;
					}
			   }
		 });
		Button P2 = (Button) findViewById(R.id.butonsus2);
		P2.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			      // TODO Auto-generated method stub
					TextView t = (TextView) findViewById(R.id.scorsus2);
					if ( pressed == false ){
						b22.setVisibility(View.VISIBLE);
						if ( sem == true ){
							scrs++;
							t.setText(""+scrs);
							b22.setImageResource(R.drawable.good);
						}
						if ( sem == false ){
							scrs--;
							t.setText(""+scrs);
							b22.setImageResource(R.drawable.bad);
						}
						pressed=true;
					}
			   }
			  });
		
		CountDownTimer waitTimer;
		B = (RelativeLayout) findViewById(R.id.fond2);
		I = (ImageView) findViewById(R.id.steag);
		waitTimer = new CountDownTimer(57000,1000) {
			public void onTick(long millisUntilFinished) {
				if ( millisUntilFinished <= 57000 && millisUntilFinished >=53000){
					B.setBackgroundResource(R.drawable.backgroundgame2start);
				}
				if ( millisUntilFinished <= 53000 && millisUntilFinished >=52000){
					B.setBackgroundResource(R.drawable.backgroundgame1start3);
				}
				if ( millisUntilFinished <= 52000 && millisUntilFinished >=51000){
					B.setBackgroundResource(R.drawable.backgroundgame1start2);
				}
				if ( millisUntilFinished <= 51000 && millisUntilFinished >=50000){
					B.setBackgroundResource(R.drawable.backgroundgame1star1);
				}
				if ( millisUntilFinished <= 50000 && millisUntilFinished >=48000){
					B.setBackgroundResource(R.drawable.backgroundgame1stargo);
				}
				if ( millisUntilFinished <= 48000 && millisUntilFinished >=46000){
					B.setBackgroundResource(R.drawable.backgroundgame2uk);
				}
				if ( millisUntilFinished <= 46000 && millisUntilFinished >45000){
						B.setBackgroundResource(R.drawable.backgroundgame1);
						I.setVisibility(View.VISIBLE);
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						if (i==0){
							sem=true;
						}
						I.setImageResource(images[i]);
						if (i == 1){
							f1=1;
						}
						if (i == 2){
							f2=1;
						}
						if (i == 3){
							f3=1;
						}
				}
				if ( millisUntilFinished <= 45000 && millisUntilFinished > 44000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 44000 && millisUntilFinished >43000){
					I.setVisibility(View.VISIBLE);
					ok=0;
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						I.setImageResource(images[i]);
						if (i == 1 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 2 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 3 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 0 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 43000 && millisUntilFinished > 42000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 42000 && millisUntilFinished >41000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						I.setImageResource(images[i]);
						if (i == 1 && f1 ==0){
							f1=1;ok=1;;
						}
						if (i == 2 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 3 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 0 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 41000 && millisUntilFinished > 40000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 40000 && millisUntilFinished >39000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						I.setImageResource(images[i]);
						if (i == 1 && f1 ==0){
							f1=1;ok=1;;
						}
						if (i == 2 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 3 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 0 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 39000 && millisUntilFinished > 38000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 38000 && millisUntilFinished >37000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						I.setImageResource(images[i]);
						if (i == 1 && f1 ==0){
							f1=1;ok=1;;
						}
						if (i == 2 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 3 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 0 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 37000 && millisUntilFinished > 36000){
					I.setVisibility(View.INVISIBLE);
					b12.setVisibility(View.INVISIBLE);
					b22.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 36000 && millisUntilFinished >34000){
					B.setBackgroundResource(R.drawable.backgroundgame2ghana);
					
					f1=0;
					f2=0;
					f3=0;
				}
				if ( millisUntilFinished <= 34000 && millisUntilFinished > 33000){
						B.setBackgroundResource(R.drawable.backgroundgame1);
						I.setVisibility(View.VISIBLE);
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=3;
						if (i==5){
							sem=true;
						}
						I.setImageResource(images[i]);
						if (i == 3){
							f1=1;
						}
						if (i == 4){
							f2=1;
						}
						if (i == 6){
							f3=1;
						}
				}
				if ( millisUntilFinished <= 33000 && millisUntilFinished > 32000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 32000 && millisUntilFinished > 31000){
					I.setVisibility(View.VISIBLE);
					ok=0;
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=3;
						I.setImageResource(images[i]);
						if (i == 3 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 4 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 6 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 5 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 31000 && millisUntilFinished > 30000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 30000 && millisUntilFinished > 29000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=3;
						I.setImageResource(images[i]);
						if (i == 3 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 4 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 6 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 5 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 29000 && millisUntilFinished > 28000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 28000 && millisUntilFinished > 27000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=3;
						I.setImageResource(images[i]);
						if (i == 3 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 4 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 6 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 5 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 27000 && millisUntilFinished > 26000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 26000 && millisUntilFinished > 25000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=3;
						I.setImageResource(images[i]);
						if (i == 3 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 4 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 6 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 5 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 25000 && millisUntilFinished > 24000){
					I.setVisibility(View.INVISIBLE);
					b12.setVisibility(View.INVISIBLE);
					b22.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 24000 && millisUntilFinished > 23000){
					B.setBackgroundResource(R.drawable.backgroundgame2sw);
					f1=0;
					f2=0;
					f3=0;
				}
				if ( millisUntilFinished <= 23000 && millisUntilFinished > 22000){
						B.setBackgroundResource(R.drawable.backgroundgame1);
						I.setVisibility(View.VISIBLE);
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=6;
						if (i==8){
							sem=true;
						}
						I.setImageResource(images[i]);
						if (i == 6){
							f1=1;
						}
						if (i == 7){
							f2=1;
						}
						if (i == 9){
							f3=1;
						}
				}
				if ( millisUntilFinished <= 22000 && millisUntilFinished > 21000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 21000 && millisUntilFinished > 20000){
					I.setVisibility(View.VISIBLE);
					ok=0;
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=6;
						I.setImageResource(images[i]);
						if (i == 6 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 7 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 9 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 8 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 20000 && millisUntilFinished > 19000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 19000 && millisUntilFinished > 18000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=6;
						I.setImageResource(images[i]);
						if (i == 6 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 7 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 9 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 8 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 18000 && millisUntilFinished > 17000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 17000 && millisUntilFinished > 16000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=6;
						I.setImageResource(images[i]);
						if (i == 6 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 7 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 9 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 8 ){
							ok=1;sem=true;
						}
					}				}
				if ( millisUntilFinished <= 16000 && millisUntilFinished > 15000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 15000 && millisUntilFinished > 14000){
					ok=0;
					I.setVisibility(View.VISIBLE);
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=6;
						I.setImageResource(images[i]);
						if (i == 6 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 7 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 9 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 8 ){
							ok=1;sem=true;
						}
					}			
				}
				if ( millisUntilFinished <= 14000 && millisUntilFinished > 13000){
					I.setVisibility(View.INVISIBLE);
					b12.setVisibility(View.INVISIBLE);
					b22.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 13000 && millisUntilFinished > 12000){
					B.setBackgroundResource(R.drawable.backgroundgame2france);
					f1=0;
					f2=0;
					f3=0;
				}
				if ( millisUntilFinished <= 12000 && millisUntilFinished > 11000){
						B.setBackgroundResource(R.drawable.backgroundgame1);
						I.setVisibility(View.VISIBLE);
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=9;
						if (i==11){
							sem=true;
						}
						I.setImageResource(images[i]);
						if (i == 9){
							f1=1;
						}
						if (i == 10){
							f2=1;
						}
						if (i == 12){
							f3=1;
						}
				}
				if ( millisUntilFinished <= 11000 && millisUntilFinished > 10000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 10000 && millisUntilFinished > 9000){
					I.setVisibility(View.VISIBLE);
					ok=0;
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=9;
						I.setImageResource(images[i]);
						if (i == 9 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 10 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 12 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 11 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 9000 && millisUntilFinished > 8000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 8000 && millisUntilFinished > 7000){
					I.setVisibility(View.VISIBLE);
					ok=0;
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=9;
						I.setImageResource(images[i]);
						if (i == 9 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 10 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 12 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 11 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 7000 && millisUntilFinished > 6000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 6000 && millisUntilFinished > 5000){
					I.setVisibility(View.VISIBLE);
					ok=0;
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=9;
						I.setImageResource(images[i]);
						if (i == 9 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 10 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 12 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 11 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 5000 && millisUntilFinished > 4000){
					I.setVisibility(View.INVISIBLE);
				}
				if ( millisUntilFinished <= 4000 && millisUntilFinished > 3000){
					I.setVisibility(View.VISIBLE);
					ok=0;
					pressed = false;sem=false;
					while(ok==0){
						Random r = new Random();
						pressed = false;sem=false;
						i = r.nextInt(4);
						i+=9;
						I.setImageResource(images[i]);
						if (i == 9 && f1 ==0){
							f1=1;ok=1;
						}
						if (i == 10 && f2 == 0){
							f2=1;ok=1;
						}
						if (i == 12 && f3 == 0){
							f3=1;ok=1;
						}
						if ( i == 11 ){
							ok=1;sem=true;
						}
					}
				}
				if ( millisUntilFinished <= 3000 && millisUntilFinished > 2000){
					I.setVisibility(View.INVISIBLE);
					b12.setVisibility(View.INVISIBLE);
					b22.setVisibility(View.INVISIBLE);
				}
				if (millisUntilFinished <= 2000 ){
					B.setBackgroundResource(R.drawable.backgroundgame2fin);
				}
				
			}
			public void onFinish() {
				String win;
				Intent intent=new Intent(Game2.this, Replay.class);
				if (scrs > scrj ){
					win="Player 2";
					intent.putExtra("final", win);
				}
				if (scrj > scrs ){
					win="Player 1";
					intent.putExtra("final", win);
				}
				if (scrj == scrs ){
					win="Draw";
					intent.putExtra("final", win);
				}
				startActivity(intent);
				finish();
			}	
		}.start();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game2, menu);
		return true;
	}

}
