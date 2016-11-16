package eu.harmony_dev.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearFields(View v) {
        setContentView(R.layout.activity_main);

    }

    public void switchView(View v){
        startActivity(new Intent(MainActivity.this, ConnectedActivity.class));
    }
}
