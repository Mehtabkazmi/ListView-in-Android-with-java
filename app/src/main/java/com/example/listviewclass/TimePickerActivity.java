package com.example.listviewclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {
    TimePicker timePicker;
    TextView timeView;
    Button timebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timePicker=findViewById(R.id.timePicker);
        timeView=findViewById(R.id.timeView);
        timebtn=findViewById(R.id.timebtn);

        timebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeView.setText("Time is:" +timefunction());
            }
        });
    }

    public String timefunction(){
        String getTime=timePicker.getCurrentHour()+" "+"Minutes are:" +timePicker.getCurrentMinute();
        return getTime;
    }
}