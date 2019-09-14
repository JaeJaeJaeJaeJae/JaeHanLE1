package jae.han.com.jaehanle1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Placess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);
    }
   // public void btn1(View v) {
     //   Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
       // Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        //startActivity(intent);
    //}
   public void place1(View view) {
       Intent i = null;
       if (view.getId() == R.id.btn1) {
           i = new Intent(this, place1.class);
           startActivity(i);
       }
   }
    public void place2(View view) {
        Intent i = null;
        if (view.getId() == R.id.btn2) {
            i = new Intent(this, place2.class);
            startActivity(i);
        }
    }
    public void place3(View view) {
        Intent i = null;
        if (view.getId() == R.id.btn3) {
            i = new Intent(this, place3.class);
            startActivity(i);
        }
    }
    public void place4(View view) {
        Intent i = null;
        if (view.getId() == R.id.btn4) {
            i = new Intent(this, place4.class);
            startActivity(i);
        }
    }
    public void back(View view) {
        Intent i = null;
        if (view.getId() == R.id.back) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
