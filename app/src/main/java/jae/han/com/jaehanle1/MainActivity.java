package jae.han.com.jaehanle1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callSecondActivity(View view) {
        Intent i = null;
        if (view.getId() == R.id.places) {
            i = new Intent(this, Placess.class);
            startActivity(i);
        }
    }

        public void callCustomService(View view){
            Intent intent = null;
            intent = new Intent(this, CustomService.class);
            startActivity(intent);

        }
}
