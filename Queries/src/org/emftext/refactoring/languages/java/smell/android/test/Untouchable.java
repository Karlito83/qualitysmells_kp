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
		
	      //RelativeLayout.LayoutParams buttonParams = 
          //      new RelativeLayout.LayoutParams(20, 40);
	      RelativeLayout.LayoutParams buttonParams2 = 
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);                                           ;
                
	      //buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
	      //buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);
	      

		return true;
	}

}