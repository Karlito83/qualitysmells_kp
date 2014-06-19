package org.emftext.refactoring.languages.java.smell.android.test;

 
import java.io.FileNotFoundException;
import java.io.InputStream;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.R;
import android.provider.MediaStore;
import android.net.Uri;

public class UnnecessaryPermission_ extends Activity {
 
 
           		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
 				
 	
 		public void sendSMS(View v) {
 
        String _messageNumber= "017612345678";
        String messageText = "Hi , Just SMSed to say hello";
 
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:"+_messageNumber));
        sendIntent.putExtra("sms_body", messageText);
        startActivity(sendIntent);
    	}
}
  


