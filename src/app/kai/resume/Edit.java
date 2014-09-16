package app.kai.resume;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Edit extends Activity implements OnClickListener{
	 TextView ttv1,ttv2,ttv3,ttv4,ttv5,ttv6,ttv7;
	 Button bbt;
	 EditText ett,ett1,ett2,ett3,ett4,ett5,ett6;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edittext);
	d();
	}


	private void d() {
		// TODO Auto-generated method stub
		ttv1 = (TextView) findViewById(R.id.tvt);
		ttv2 = (TextView) findViewById(R.id.n1);
		ttv3 = (TextView) findViewById(R.id.n2);
		ttv4 = (TextView) findViewById(R.id.n3);
		ttv5 = (TextView) findViewById(R.id.n4);
		ttv6 = (TextView) findViewById(R.id.n5);
		ttv7 = (TextView) findViewById(R.id.n6);
		
		bbt = (Button) findViewById(R.id.btt);
		
		
		ett = (EditText) findViewById(R.id.ede);
		ett1 = (EditText) findViewById(R.id.edit1);
		ett2 = (EditText) findViewById(R.id.edit2);
		ett3 = (EditText) findViewById(R.id.edit3);
		ett4 = (EditText) findViewById(R.id.editText4);
		ett5 = (EditText) findViewById(R.id.editText5);
		ett6 = (EditText) findViewById(R.id.editText6);
		
		bbt.setOnClickListener(this);
		
		ttv1.setText(" Name");
		ttv2.setText(" Nickname");
		ttv3.setText(" Student code");
		ttv4.setText(" Major");
		ttv5.setText(" Tel");
		ttv6.setText(" E-mail");
		ttv7.setText(" University");
		
		
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Save();
		switch (v.getId()) {
	case R.id.btt:
		
		Intent a = new Intent(Edit.this,MainActivity.class);
		
		String name = ett.getText().toString();
		String name1 = ett1.getText().toString();
		String name2 = ett2.getText().toString();
		String name3 = ett3.getText().toString();
		String name4 = ett4.getText().toString();
		String name5 = ett5.getText().toString();
		String name6 = ett6.getText().toString();
		
	
		
		a.putExtra("dd1", name);
		a.putExtra("dd2", name1);
		a.putExtra("dd3", name2);
		a.putExtra("dd4", name3);
		a.putExtra("dd5", name4);
		a.putExtra("dd6", name5);
		a.putExtra("dd7", name6);
		
		startActivity(a);
		
		
		break;

	default:
		break;
	}
		
	}

	public boolean Save(){
		final AlertDialog.Builder bb = new AlertDialog.Builder(this);
		AlertDialog cc = bb.create();
		
		if (ett.getText().length()==0) {
			cc.setMessage("Please input Name");
			ett.requestFocus();
			return false;
			
		}
		if (ett1.getText().length()==0) {
			cc.setMessage("Please input Nickname");
			ett1.requestFocus();
			return false;
			
		}
		if (ett2.getText().length()==0) {
			cc.setMessage("Please input Code");
			ett2.requestFocus();
			return false;
			
		}
		if (ett3.getText().length()==0) {
			cc.setMessage("Please input Sub");
			ett3.requestFocus();
			return false;
			
		}
		if (ett4.getText().length()==0) {
			cc.setMessage("Please input Tel");
			ett4.requestFocus();
			return false;
			
		}
		if (ett5.getText().length()==0) {
			cc.setMessage("Please input Email");
			ett5.requestFocus();
			return false;
			
		}
		if (ett6.getText().length()==0) {
			cc.setMessage("Please input Buu");
			ett6.requestFocus();
			return false;
			
		}
		controlinsert dbControlinsert = new controlinsert(this);
		long savedata = dbControlinsert.insertData(ett.getText().toString(), ett1.getText().toString(), ett2.getText().toString(), ett3.getText().toString(), ett4.getText().toString(), 
				ett5.getText().toString(), ett6.getText().toString());
		if (savedata <= 0) {
			cc.setMessage("Erro ??????????");
			cc.show();
			return false;
			
		}
		Toast.makeText(getApplicationContext(), "Add Data Successfully", Toast.LENGTH_SHORT).show();
		return true;
		
	}
	
	
	
}
