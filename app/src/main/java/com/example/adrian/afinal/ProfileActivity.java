package com.example.adrian.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //BUTTON TO SEE PROFILE
        back = (Button) findViewById(R.id.backbutton);

        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent newPage = new Intent(ProfileActivity.this, phone.class);
                startActivity(newPage);

            }
        });


    }
}
