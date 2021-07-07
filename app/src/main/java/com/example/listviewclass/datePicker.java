package com.example.listviewclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class datePicker extends AppCompatActivity {
    TextView textView;
    DatePicker datePicker;
    Button datebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView);
        datebtn=findViewById(R.id.datebtn);
        datePicker=findViewById(R.id.datePicker);

        datebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Changed Date "+ dateFunction());
            }
        });

    }

    public String dateFunction(){
        String getDate= datePicker.getDayOfMonth()+"/"+datePicker.getMonth()+"/"+datePicker.getYear();
        return getDate;
    }
}