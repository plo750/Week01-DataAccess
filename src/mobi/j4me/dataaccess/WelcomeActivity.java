package mobi.j4me.dataaccess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;

public class WelcomeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		Intent intent = getIntent();
		
		String userID = intent.getStringExtra("userID");
		
		EditText edT = (EditText) findViewById( R.id.editText1);
		edT.setText( userID);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
