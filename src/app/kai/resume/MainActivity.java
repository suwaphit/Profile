package app.kai.resume;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Profile;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
	private TextView tx1,a1,a2,a3,a4,a5,a6,a7;
	private Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewMatching();
    }

	private void ViewMatching() {
		// TODO Auto-generated method stub
		
		tx1 = (TextView) findViewById(R.id.k1);
		a1 = (TextView) findViewById(R.id.t1);
		a2 = (TextView) findViewById(R.id.t2);
		a3 = (TextView) findViewById(R.id.t3);
		a4 = (TextView) findViewById(R.id.t4);
		a5 = (TextView) findViewById(R.id.t5);
		a6 = (TextView) findViewById(R.id.t6);
		a7 = (TextView) findViewById(R.id.t7);
		tx1.setText("SUWAPHIT    KETKUN");
		a1.setText(" Name	: Suwaphit  Ketkun");
		a2.setText(" Nickname	: Kai");
		a3.setText(" Student code	: 55410595");
		a4.setText(" Major	: Information Technology");
		a5.setText(" Tel	: 088-5283660");
		a6.setText(" E-mail	: pdan-gai@hotmail.com");
		a7.setText(" University: Burapha University ");
		
		b1 = (Button) findViewById(R.id.ed);
		b2 = (Button) findViewById(R.id.ima);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.ed:
			
			break;
		case R.id.ima:
			Intent m = new Intent(MainActivity.this,Fi.class);
			startActivity(m);
			break;
			
			default:
				break;
			
		}
			
	}	
    
}

