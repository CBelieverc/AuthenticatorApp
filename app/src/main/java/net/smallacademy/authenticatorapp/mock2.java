package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class mock2 extends AppCompatActivity {
    Button button;
    TextView textView,score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock2);
        getWindow().setStatusBarColor(ContextCompat.getColor(mock2.this,R.color.colorPrimaryDark));
        int Prev_score;
        int Prev_score1;
        button = findViewById(R.id.button5);
        textView=findViewById(R.id.subject);
        String url2 = getIntent().getStringExtra("subject");
        textView.setText("Subject : " + url2);
        score=findViewById(R.id.score);
        int Correct=getIntent().getIntExtra("score",0);
        if(Correct!=0) {
            Prev_score = Correct;
            Prev_score1 = Correct;
            score.setText("Marks Scored : " + Prev_score + "/60");
        }


        ImageView back13 =findViewById(R.id.back_mock);
        back13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), mocksubjects.class);
                startActivity(intent1);
                finish();
            }
        });




    }
    public void openactivity1(View view) {
        String url1 = getIntent().getStringExtra("pdf_url1");
        Intent intent = new Intent(this, mocksplash.class);
        intent.putExtra("pdf_url11",url1);
        startActivity(intent);
    }

}