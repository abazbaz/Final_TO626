package com.example.adrian.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Schedule extends AppCompatActivity {

    Integer Butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        setupButton();
        Butt = 5;
    }


    //-----------------------------------------------
    //------------  RADIO BUTTON  -------------------
    //-----------------------------------------------

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.option_one:
                if (checked)
                    Butt = 1;
                break;
            case R.id.option_two:
                if (checked)
                    Butt = 2;
                break;
            case R.id.option_three:
                if (checked)
                    Butt = 3;
                break;
            case R.id.option_four:
                if (checked)
                    Butt = 4;
                break;

        }
    }

    //-----------------------------------------------
    //-----------   LOGIN BUTTON  -------------------
    //-----------------------------------------------

    private void setupButton() {
        // 1. Create a reference to the button
        Button scheduleButton = (Button) findViewById(R.id.schedule_butt);

        // 2. Set the click listener to run my code

        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Setup User Name Input Read

                // If the Password is correct the Button will send you to either Settings Screen or

                if (Butt.equals(1)) {
                    Toast toast = Toast.makeText(Schedule.this, "Your Call has Been Scheduled!", Toast.LENGTH_LONG);
                    toast.show();
                    Intent newPage = new Intent(Schedule.this, phone.class);
                    startActivity(newPage);

                }

                if (Butt.equals(2)) {
                    Toast toast = Toast.makeText(Schedule.this, "Your Call has Been Scheduled!", Toast.LENGTH_LONG);
                    toast.show();
                    Intent newPage = new Intent(Schedule.this, phone.class);
                    startActivity(newPage);
                }

                if (Butt.equals(3)) {
                    Toast toast = Toast.makeText(Schedule.this, "Your Call has Been Scheduled!", Toast.LENGTH_LONG);
                    toast.show();
                    Intent newPage = new Intent(Schedule.this, phone.class);
                    startActivity(newPage);
                }

                if (Butt.equals(4)) {
                    Toast toast = Toast.makeText(Schedule.this, "Your Call has Been Schelued!", Toast.LENGTH_LONG);
                    toast.show();
                    Intent newPage = new Intent(Schedule.this, phone.class);
                    startActivity(newPage);
                }

                // If Password is correct, but user did not specify
                if (Butt.equals(5)) {

                    Toast toast = Toast.makeText(Schedule.this, "Please Select one time slot above", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, -100);
                    toast.show();

                }


            }
        });

    }
}
