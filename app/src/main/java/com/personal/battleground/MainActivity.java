package com.personal.battleground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.personal.battleground.ViewModelT.VMT;

public class MainActivity extends AppCompatActivity {
    Button btt_port, bt_land;
    TextView land, port;
    VMT vmt=new VMT();
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
         vmt = new ViewModelProvider(this).get(VMT.class);
        setTextFn();

        btt_port.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase();
                Toast.makeText(MainActivity.this, "Port", Toast.LENGTH_SHORT).show();
            }
        });


    }
    void increase(){
        vmt.increment();
        setTextFn();
    }

    void setTextFn() {
//        land.setText(vmt.increment());
        port.setText("New Value"+vmt.count);
    }

    void init() {
        btt_port = findViewById(R.id.bt_port);
        port=findViewById(R.id.count_port);
    }
}