package mobi.j4me.dataaccess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void userLogin( View view) {
		Toast.makeText( this, "You have clicked the button", Toast.LENGTH_SHORT).show();
		
		EditText edUserID 	= (EditText) findViewById( R.id.if_user_id);
		EditText edPassword 	= (EditText) findViewById( R.id.if_password);
		
		String userID = edUserID.getText().toString();
		String password = edPassword.getText().toString();
				
		if( userID != null && userID.length() > 0 && password != null && password.length() > 0) {
			Toast.makeText( this, "Hello " + userID, Toast.LENGTH_SHORT).show();
			// Open windows
			Log.i(this.getClass().getName(), "Open welcome windows");
			Intent intentWelcome = new Intent( this, WelcomeActivity.class);
			intentWelcome.putExtra("userID", userID);
			startActivity(intentWelcome);
		} else {
			Toast.makeText( this, "Try again", Toast.LENGTH_SHORT).show();
		}
	} 
	
}
