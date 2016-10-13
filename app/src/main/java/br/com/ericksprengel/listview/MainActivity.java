package br.com.ericksprengel.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_activity_array_adapter_button).setOnClickListener(this);
        findViewById(R.id.main_activity_base_adapter_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.main_activity_array_adapter_button:
                // abrir array adapter
                intent = new Intent(this, ArrayAdapterActivity.class);
                startActivity(intent);
                break;
            case R.id.main_activity_base_adapter_button:
                // abrir base adapter
                intent = new Intent(this, BaseAdapterActivity.class);
                startActivity(intent);
                break;
        }
    }
}