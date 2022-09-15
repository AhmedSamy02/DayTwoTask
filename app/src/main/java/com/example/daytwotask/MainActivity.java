package com.example.daytwotask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView theFlame = (ImageView) findViewById(R.id.flame);
        theFlame.setVisibility(View.INVISIBLE);
        TextView Counter = (TextView) findViewById(R.id.likeCounter);
        TextView firstName = (TextView) findViewById(R.id.firstName);
        TextView lastName = (TextView) findViewById(R.id.LastName);

        Button button = (Button) findViewById(R.id.LikeButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                x++;
                Counter.setText(Integer.toString(x));
                if (x == 15) {
                    x = -1;
                    theFlame.setVisibility(View.VISIBLE);
                }
                else if (x == 0) {
                    theFlame.setVisibility(View.INVISIBLE);
                    firstName.setText("Ahmed");
                    lastName.setText("Samy");
                }
            }
        });
    }
}