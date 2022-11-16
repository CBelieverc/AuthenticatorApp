package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class videotopics2 extends AppCompatActivity {

    TextView textView, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttone1, buttone2, buttone3,buttone12,buttone5, buttone6, buttone7,buttone8, buttone9, buttone10,buttone11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videotopics2);
        getWindow().setStatusBarColor(ContextCompat.getColor(videotopics2.this, R.color.colorPrimaryDark));
        ImageView back = findViewById(R.id.back11);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });


        textView = findViewById(R.id.heading);
        button1 = findViewById(R.id.button_p1);
        button2 = findViewById(R.id.button_p2);
        button3 = findViewById(R.id.button_p3);
        button4 = findViewById(R.id.button_p4);
        button5 = findViewById(R.id.button_p5);
        button6 = findViewById(R.id.button_p6);
        button7 = findViewById(R.id.button_p7);
        button8 = findViewById(R.id.button_p8);
        button9 = findViewById(R.id.button_p9);
        button10 = findViewById(R.id.button_p10);
        button11 = findViewById(R.id.button_p11);
        button12 = findViewById(R.id.button_p12);
        buttone1 = findViewById(R.id.button_ep1);
        buttone2 = findViewById(R.id.button_ep2);
        buttone3 = findViewById(R.id.button_ep3);
        buttone5 = findViewById(R.id.button_ep5);
        buttone6 = findViewById(R.id.button_ep6);
        buttone7 = findViewById(R.id.button_ep7);
        buttone8 = findViewById(R.id.button_ep8);
        buttone9 = findViewById(R.id.button_ep9);
        buttone10 = findViewById(R.id.button_ep10);
        buttone11 = findViewById(R.id.button_ep11);
        buttone12 = findViewById(R.id.button_ep12);
        String h1 = getIntent().getStringExtra("heading11");
        textView.setText(h1);
        String p1 = getIntent().getStringExtra("video1");
        button1.setText(p1);
        String p2 = getIntent().getStringExtra("video2");
        button2.setText(p2);
        String p3 = getIntent().getStringExtra("video3");
        button3.setText(p3);
        String p4 = getIntent().getStringExtra("video4");
        button4.setText(p4);
        String p5 = getIntent().getStringExtra("video5");
        button5.setText(p5);
        String p6 = getIntent().getStringExtra("video6");
        button6.setText(p6);
        String p7 = getIntent().getStringExtra("video7");
        button7.setText(p7);
        String p8 = getIntent().getStringExtra("video8");
        button8.setText(p8);
        String p9 = getIntent().getStringExtra("video9");
        button9.setText(p9);
        String p10 = getIntent().getStringExtra("video10");
        button10.setText(p10);
        String p11 = getIntent().getStringExtra("video11");
        button11.setText(p11);
        String p12 = getIntent().getStringExtra("video12");
        button12.setText(p12);


        if (p3.contentEquals("")) {
            buttone1.setText("");
        }
        if (p4.contentEquals("")) {
            buttone2.setText("");
        }
        if (p2.contentEquals("")) {
            buttone3.setText("");
        }
        if (p5.contentEquals("")) {
            buttone5.setText("");
        }
        if (p6.contentEquals("")) {
            buttone6.setText("");
        }
        if (p7.contentEquals("")) {
            buttone7.setText("");
        }
        if (p8.contentEquals("")) {
            buttone8.setText("");
        }
        if (p9.contentEquals("")) {
            buttone9.setText("");
        }
        if (p10.contentEquals("")) {
            buttone10.setText("");
        }
        if (p11.contentEquals("")) {
            buttone11.setText("");
        }
        if (p12.contentEquals("")) {
            buttone12.setText("");
        }







        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                //complete course
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                //crash course
                if (m11.contentEquals("Physics_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SKOO3jzwO00");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WVQv0Qy48y0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yVHi4QDVvks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wwEirisQXQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "mTDByRXac0A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Y2L_boS80oE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qDxJeZ203vg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ut_IvRfbFLg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "t0NcU0PYBeE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "h_dvq_ES1Nw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9TDSrZw8p34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FOpg2iZfoOM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "A1PqVadbOO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jhLV5JsFQmg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lhIFMKTWiTg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ynNMj7trw9A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "7eo-Lw5L45k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Nb8ho47pLDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WaLMuoGES_4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-EYLTcbXWgQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qsj4B7F22DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jCH8BVVaNFA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k-f57hJodkM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k65jZ8q64dE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "L3n9HQZy9lc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5zXvfDLDyD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FRfOiVsCOaw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "CLlY_u3pDMY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oE4QeOQUzV0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qFfBzA26H1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "24WmjQzPNhE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oGidL6iv27g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Physics_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zaUfQ5mykQI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uWCT-P1cjqU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oh4SxHHlUYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H12e3IHgKco");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sBjAi7exFwI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cTW8s8fptiw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vwb788p5QrI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sEhI-j3Okv4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "VinwDca8HO4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nBm18K4rDLQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WdwCnZuxdsU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "k2c9uKelD6s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bGYlKheC0ds");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NpXm5ucXgPA");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Sclahj2uP10");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "HxQqleS-iDM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rKX06jot1x8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "n5V-OGmlmBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RSByy4SzngM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nWgqrm8HhRU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "aZ4Ab5bERcA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R6gDGP0-jeo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IZrmEcPWlbE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "_wl7FrFagno");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nwgktpWVSeI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "fvJsAa5wXms");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iC5HbEBTyyI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pGCQ1fvV4aU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-V-Nr-iUt9g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6lHL4l_765w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gfjTBaMF8pY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a4Q_FGVnQYg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1vmFNwrlQ7Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j0BN8RfeqD0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qRVAJwllEMQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kL9DHJLpLXk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "R07g6aFnnlo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "zPvN1CcUd6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_12_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_13_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_14_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_15_c")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
            }
        });








    }

    @Override
    public void onBackPressed() {
        finish();

    }
}

