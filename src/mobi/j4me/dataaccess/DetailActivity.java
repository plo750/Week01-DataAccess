package mobi.j4me.dataaccess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DetailActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail);
		Intent intent = getIntent();
				
		String task = intent.getStringExtra("task");
		
		EditText edT = (EditText) findViewById( R.id.editText1);
		edT.setText( task);
		
		Button btn = (Button) findViewById( R.id.btn_send_message_id);
		btn.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				String phoneNumber 	= ((EditText) findViewById( R.id.et_phone_number_id)).getText().toString();
				String smsMessage	= ((EditText) findViewById( R.id.et_message_id)).getText().toString();
				
				SmsManager smsMng = SmsManager.getDefault();
				smsMng.sendTextMessage( phoneNumber, null, smsMessage, null, null);
				
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
