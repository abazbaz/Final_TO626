package com.example.adrian.afinal;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TimeFormatException;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeDateActivity extends AppCompatActivity
{

    DateFormat formatDateTime = DateFormat.getDateTimeInstance();
//    DateFormat df = new
    Button TimeButt;
    Button DateButt;
    Button CallButt;
    Integer a;
    String new_date;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm aa");
    TextView text;
    Calendar dateTime = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_date);
        a=0;

        text = (TextView) findViewById(R.id.date_time_text);

        //BUTTON TO SET TIME
        TimeButt = (Button) findViewById(R.id.time_button);
        TimeButt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                updateTime();
                a=1;
            }
        });


        //BUTTON TO SET DATE
        DateButt = (Button) findViewById(R.id.date_button);
        DateButt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                updateDate();
                a=1;
            }
        });


        //BUTTON TO GO TO 'PHONE' ACTIVITY (SHOULD ADD IF STATEMENT FOR WHEN USER HAS NOT INPUT ITS DATE)
        CallButt = (Button) findViewById(R.id.call_butt);
        CallButt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent newPage = new Intent(TimeDateActivity.this, phone.class);
                startActivity(newPage);
            }
        });


        if (a.equals(1))
        {
            updateTextLabel();
        }
    }




    /////////////////////////////////////
    // CREATE DIALOG FOR PICKING DATES //
    /////////////////////////////////////

    private void updateDate()
    {
        new DatePickerDialog(this, d, dateTime.get(Calendar.YEAR),dateTime.get(Calendar.MONTH),dateTime.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener()
    {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
        {
            dateTime.set(Calendar.YEAR, year);
            dateTime.set(Calendar.MONTH, month);
            dateTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateTextLabel();
        }
    };


    ///////////////////////////////////
    // CREATE DIALOG FOR PICKING TIME //
    ///////////////////////////////////

    private void updateTime()
    {
        new TimePickerDialog(this, t, dateTime.get(Calendar.HOUR_OF_DAY), dateTime.get(Calendar.MINUTE),true).show();
    }

    TimePickerDialog.OnTimeSetListener t= new TimePickerDialog.OnTimeSetListener()
    {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute)
        {
        dateTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
        dateTime.set(Calendar.MINUTE, minute);
        updateTextLabel();
        }

    };


    // UPDATE TEXT EVERYTIME USER PICS A TIME & DATE
    private void updateTextLabel()
    {
        new_date = formatDateTime.format(dateTime.getTime());

        text.setText(formatDateTime.format(dateTime.getTime()));

    }




}
