package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.security.cert.CertPathBuilder;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class wonactivity extends AppCompatActivity {
    private KonfettiView viewKonfetti;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonactivity);
        getWindow().setStatusBarColor(ContextCompat.getColor(wonactivity.this,R.color.colorPrimaryDark));

        viewKonfetti=findViewById(R.id.viewKonfetti);



        CircularProgressBar circularProgressBar;
        TextView result_text,ic_exit;
        LinearLayout btn_share;
        int Correct,Wrong;


        circularProgressBar = findViewById(R.id.circularProgressBar);
        result_text = findViewById(R.id.result_text);
        btn_share = findViewById(R.id.btn_share);
        ic_exit=findViewById(R.id.ic_exit);

        Correct=getIntent().getIntExtra("Correct",0);
        Wrong=getIntent().getIntExtra("Wrong",0);

        if (Correct != 0) {
            viewKonfetti.build()
                    .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.RED)
                    .setDirection(0.0, 359.0)
                    .setSpeed(1f, 5f)
                    .setFadeOutEnabled(true)
                    .setTimeToLive(2000L)
                    .addShapes(Shape.RECT, Shape.CIRCLE)
                    .addSizes(new Size(12, 5))
                    .setPosition(-50f, viewKonfetti.getWidth() + 50f, -50f, 50f)
                    .streamFor(550, 5000L);
        }


        circularProgressBar.setProgress(Correct);
        result_text.setText((Correct+"/60"));

        ic_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Correct1=getIntent().getIntExtra("Correct",0);
                Intent intent = new Intent(wonactivity.this,mocksubjects.class);
                intent.putExtra("score",Correct1);
                startActivity(intent);
            }
        });

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My Application Name");
                    String shareMessage = "\nHey!there Check Out This Awesome App for KCET Preparation\n \nPrepare for K-CET with kcet Exam Guide which is a package of study materials, video lectures, colleges list , Mock tests. Predict your rank, free college predictor etc...  In one place\n \n It's ad free,\n \n download the app now";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                }catch(Exception e) {
                    //e.toString();
                }

            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}