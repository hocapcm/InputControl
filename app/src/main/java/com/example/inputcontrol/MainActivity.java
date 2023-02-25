package com.example.inputcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.slider.Slider;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edHoten, edSdt;
    Switch swGioitinh;
    Spinner spTrinhdo;
    Slider sbTuoi;
    CheckBox cbThethao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spTrinhdo = (Spinner) findViewById(R.id.spTrinhdo);
        ArrayList<String> mangtrinhdo= new ArrayList<String>();
        mangtrinhdo.add("Đại học");
        mangtrinhdo.add("THPT");
        mangtrinhdo.add("THCS");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,mangtrinhdo);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spTrinhdo.setAdapter(arrayAdapter);
        spTrinhdo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView)parent.getChildAt(0)).setTextColor(Color.BLACK);
                Toast.makeText(MainActivity.this,mangtrinhdo.get(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sbTuoi = (Slider) findViewById(R.id.sbTuoi);







    }
}