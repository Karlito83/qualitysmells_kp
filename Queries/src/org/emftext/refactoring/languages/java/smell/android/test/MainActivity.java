package org.emftext.refactoring.languages.java.smell.android.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Absolute Nonsense :)
		findViewById(TRIM_MEMORY_UI_HIDDEN);
		findViewById(TRIM_MEMORY_UI_HIDDEN);
		findViewById(TRIM_MEMORY_UI_HIDDEN);
		findViewById(TRIM_MEMORY_UI_HIDDEN);
		findViewById(TRIM_MEMORY_UI_HIDDEN);
		findViewById(TRIM_MEMORY_UI_HIDDEN);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		
		
		return false;
	}

}
