package org.emftext.refactoring.languages.java.smell.android.test;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Untouchable extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
        Button myButton = new Button(this);
        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.addView(myButton);
        setContentView(myLayout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate( R.menu.class, menu);
		
	      RelativeLayout.LayoutParams buttonParams = 
                new RelativeLayout.LayoutParams(20, 60);
	      RelativeLayout.LayoutParams buttonParams2 = 
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);                                           ;
          RelativeLayout.LayoutParams buttonParams3 = 
                new RelativeLayout.LayoutParams(50, 40);      
	      //buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
	      //buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);
	      Integer x=30;

		return true;
	}

}