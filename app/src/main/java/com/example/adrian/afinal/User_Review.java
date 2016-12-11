package com.example.adrian.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class User_Review extends AppCompatActivity
{

    RatingBar ratingBarOne;
    RatingBar ratingBarTwo;
    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__review);

        ratingBarOne = (RatingBar)findViewById(R.id.ratingbar_one);
        ratingBarTwo = (RatingBar)findViewById(R.id.ratingbar_two);

        submit_btn = (Button)findViewById(R.id.submit_butt);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating_one = String.valueOf(ratingBarOne.getRating());
                String rating_two = String.valueOf(ratingBarTwo.getRating());

                Toast.makeText(User_Review.this,"Thank you! Your answers have been recorded",Toast.LENGTH_LONG).show();

                Intent newPage = new Intent(User_Review.this, MainActivity.class);
                startActivity(newPage);
            }
        });


    }
}
