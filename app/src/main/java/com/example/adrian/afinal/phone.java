package com.example.adrian.afinal;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class phone extends AppCompatActivity
{
    @Override
    public String toString() {
        return super.toString();
    }

    Button call;
    Button profile;
    String phone_number;
    Integer have_called;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        have_called=0;

        if (have_called.equals(1)){

            Intent newPage = new Intent(phone.this, User_Review.class);
            startActivity(newPage);

        }
        phone_number="tel:7347471547";

        //BUTTON TO MAKE CALL
        call = (Button) findViewById(R.id.callbutton);

        call.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                Toast toast = Toast.makeText(phone.this, "Calling" , Toast.LENGTH_LONG);
//                toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, 450);
//                toast.show();

                if (have_called.equals(1)){

                    Intent newPage = new Intent(phone.this, User_Review.class);
                    startActivity(newPage);

                }

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(phone_number));
                startActivity(callIntent);
                have_called=1;


            }
        });

        if (have_called.equals(1)){

            Intent newPage = new Intent(phone.this, User_Review.class);
            startActivity(newPage);

        }

        //BUTTON TO SEE PROFILE
        profile = (Button) findViewById(R.id.profilebutton);

        profile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//

                Intent newPage = new Intent(phone.this, ProfileActivity.class);
                startActivity(newPage);

            }
        });
    }
}
