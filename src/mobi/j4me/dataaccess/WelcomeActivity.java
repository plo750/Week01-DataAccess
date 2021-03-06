package mobi.j4me.dataaccess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class WelcomeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		Intent intent = getIntent();
		
		String userID = intent.getStringExtra("userID");
		
		EditText edT = (EditText) findViewById( R.id.editText1);
		edT.setText( userID);
		
		//Get the id of the button
		
		Button btn = (Button) findViewById( R.id.btn_submit);
		btn.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				Spinner sp = (Spinner) findViewById( R.id.sp_category_id);
				String selectedTask = (String) sp.getSelectedItem();
				
				
				Intent intentWelcome = new Intent(  WelcomeActivity.this, DetailActivity.class);
				intentWelcome.putExtra("task", selectedTask);
				startActivity(intentWelcome);
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
