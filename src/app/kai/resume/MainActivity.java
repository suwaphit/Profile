package app.kai.resume;

import android.R.string;
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
	private TextView tx1,a1,a2,a3,a4,a5,a6,a7,c1,c2,c3,c4,c5,c6,c7;
	private Button b1,b2;
	private string p1,p2,p3,p4,p5,p6,p7;

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
		
		c1 = (TextView) findViewById(R.id.n1);
		c2 = (TextView) findViewById(R.id.n2);
		c3 = (TextView) findViewById(R.id.n3);
		c4 = (TextView) findViewById(R.id.n4);
		c5 = (TextView) findViewById(R.id.n5);
		c6 = (TextView) findViewById(R.id.n6);
		c7 = (TextView) findViewById(R.id.n7);
		
		
		b1 = (Button) findViewById(R.id.ed);
		b2 = (Button) findViewById(R.id.ima);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		
		c1.setText("NAME   : ");
		c2.setText("NICKNAME   : ");
		c3.setText("CODE   : ");
		c4.setText("SUB   : ");
		c5.setText("TEL   : ");
		c6.setText("E-MAIL   : ");
		c7.setText("BUU   : ");
		
		String p1 = getIntent().getStringExtra("dd1");
		String p2 = getIntent().getStringExtra("dd2");
		String p3 = getIntent().getStringExtra("dd3");
		String p4 = getIntent().getStringExtra("dd4");
		String p5 = getIntent().getStringExtra("dd5");
		String p6 = getIntent().getStringExtra("dd6");
		String p7 = getIntent().getStringExtra("dd7");
		
		
		if(tx1!=null){
			tx1.setText("SUWAPHIT    KETKUN");
			a1.setText(" Suwaphit  Ketkun");
			a2.setText(" Kai");
			a3.setText(" 55410595");
			a4.setText(" Information Technology");
			a5.setText(" 088-5283660");
			a6.setText(" pdan-gai@hotmail.com");
			a7.setText(" Burapha University ");
		}
		if(p1!=null){
			a1.setText(p1);
			a2.setText(p2);
			a3.setText(p3);
			a4.setText(p4);
			a5.setText(p5);
			a6.setText(p6);
			a7.setText(p7);

		}
		
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.ed:
			Intent d = new Intent(MainActivity.this,Edit.class);
			startActivity(d);
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

