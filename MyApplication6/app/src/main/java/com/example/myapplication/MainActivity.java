package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view){
        EditText edtName=(EditText) findViewById(R.id.edtName);
        TextView textView=(TextView) findViewById(R.id.txvShow);
        String name=edtName.getText().toString();
        txvshow.setText("你的名字:" +name);
    }
}