package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class videotopics2 extends AppCompatActivity {

    TextView textView, button1, button2, button3, button4, buttone1, buttone2, buttone3;

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
        buttone1 = findViewById(R.id.button_ep1);
        buttone2 = findViewById(R.id.button_ep2);
        buttone3 = findViewById(R.id.button_ep3);
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

        if (p3.contentEquals("")) {
            buttone1.setText("");
        }
        if (p4.contentEquals("")) {
            buttone2.setText("");
        }
        if (p2.contentEquals("")) {
            buttone3.setText("");
        }



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                if (m11.contentEquals("Maths_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "imjwU1-RtC0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FjbHqOq6JOc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "TYQ35Ex5N_c");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Gg-PZyE8xw0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RwH2-CdvYuY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "sO6UmCL9Ar4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "JCjArZ-DxBI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yjJTy29Z_k0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "oYpI2TVThTw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gMsBUqCfHGY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vpPfYqAjFVE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-tRLnT4HhL0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "KnVNAvXOeus");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "BQW6vXLHT4Y");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rOSoP7wllZs");
                    startActivity(intent1);
                    finish();
                }
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
                if (m11.contentEquals("Maths_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "LLqukgbaerI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "50Fw58pbcks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "DZhUHF2RbQY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "xNqv2_sYkto");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "s9C_5RczK6A");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kT3co4EJNPA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "BEGkCy5UO6M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "c05eAtqB2mw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "YhAZLkROduw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5g4Pm9ArHoc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "D-2D4GdQ470");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "S-YfhAJYigs");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rOSoP7wllZs");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_15")) {
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
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                if (m11.contentEquals("Maths_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "b5Cq37MS1Kw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "OXkTE4twFgo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "o-x5NjJmD48");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ZH7thuXWXsg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RwH2-CdvYuY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Eahv2qN0tBc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "IwMYBoZd6tk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uDnBc_DC-VE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Edns2KYa91M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "U3u2B8Jw_Rc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "KBtZaQtD0Tg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "o-x5NjJmD48");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "m76h_s7ewpo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Of4_oLxCfBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NqEx9-UqBIE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6giWEvTgNbk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "H-alJqUeOIo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6muGI6apl1w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bhQs5m-c9eE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "DOGGYZb9Qwo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-QMAk6Kxiik");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "e6bXwGvhzmc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "M7x6sFlS4OU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SCLlV2CowFQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "MIvrg2d-Lyk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "KeqBwm0ns4E");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nYZxwhSLUs4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nYZxwhSLUs4");
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
                    intent1.putExtra("video_id", "Sb1qhke35ow");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Ev2Ss62PBXQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Wa5PPaHA4Vo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "hanDYWU8jQk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "O4lzlIIMkhk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yxSQu444lnk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9SsvWvM-xvY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "1pg7Y5U_D8I");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "UTGNq3K2ZiI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Oopeou5B8l8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yc3Ae2lVo08");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gNp9BIlTOBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uUVAQ6DomvI");
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
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "gn_lO69yiwM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NVA1hsYUk5Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Aw-n8vP5qN4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ED1ibW6vc3s");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "x14K8DWsjo0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ug1juN3n9P8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
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
                if (m11.contentEquals("Maths_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "KNMDxGL7OwE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ZApjkZVAOR0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Zu9fHYYPrNU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bmZhk4MR5CA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "AmyIGV4TC60");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "V9FKlVTfgWo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bDAjxnrsGT0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "jw5rM5Fxpbw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "LiaPL5XXDzY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Tan6Jo2mabE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "U3u2B8Jw_Rc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RwH2-CdvYuY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iMQrfbX-h-8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "apf3EhGVyfg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5b5n_2cQJus");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9KpF_4jSE2M");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "b2FkL0PtiQ4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "6I_AQn_7Uzk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vu3JOsDPbfI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pYDKGKnp4wg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "obNOr36ySd8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "LS45b2wXHVA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "pDFCVqoXt_E");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Jpi4TjSmDOg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "E5TS-f2lwPQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ncg8zDH2GZo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "SwMdi4FxPaY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NTxpWifyOUk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "8RSLVLMkyKE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "nSZcxPe7X80");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "JDyru73rkWk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "777ISsGB-jg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "78OVW-hgMU4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uVuwzCAs-Ks");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "rnaQlzewhbA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "iUWwxL-MOus");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kPv5Pa6Fk9c");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "kPv5Pa6Fk9c");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "y_HBxNmVz5w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "y_HBxNmVz5w");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "OCaorKmjUnM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "y_J4CCgdHMI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "a2ONFAkR8DY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "LqPlSotbL2I");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "hCvYjATWShE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "uXsV93VvJn0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "cDSImoF4Pyo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "QotmNGLKYoA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wbF--8A9CGM");
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

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                if (m11.contentEquals("Maths_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "wZeGuag4Ifo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "tgdNqvtAbS4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9YtA7qbAGEA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "AOdwWJpXNqI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "NwPFsSIgjKE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "YcTpv-fQvu4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "5GlbdkRSBQc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "2m_akNNZ9yQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "ZFEKoXmzaBk");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "3S0jCuyEHyQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "tU-M936spgM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "u-vq9UVW70E");
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
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "WjJ_fQHcrEw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lLYaPCVnCJQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "KeqBwm0ns4E");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
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
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "0akd3yXp22g");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
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
                if (m11.contentEquals("Maths_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "XyWvnR8hqLU");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "714wY8yZ22k");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "tPFCW1RaoFY");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Cnmts2qcN90");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Lb0caVCJ3FM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "qLOW-IP-NKo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "q0g_AR_QKKc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "9nAe2f3sGBg");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "JsCkcqJb2gw");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "RwjK-zY5yi8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j5awRmF-F34");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "u5DBaM6wXLM");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "o6O7sNli8cA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "38gz4nD9zXo");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "bnL0P7YIdGE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "Xs3W1wpiJlA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "-9zg0-EUciA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "b3oiwySAlIQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FzGrtLZP8BI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "FzGrtLZP8BI");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lumSC-owyfQ");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "y_J4CCgdHMI");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "N5GiTPUg_gs");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
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


            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m11 = getIntent().getStringExtra("heading");
                if (m11.contentEquals("Maths_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_1_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "yRrhlbS9kH8");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "34TqXE-Y5q0");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_1_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
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
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "8YTEUnEdiq4");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_1_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
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
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_1_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
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
                if (m11.contentEquals("Maths_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "lK5nXIj8k4Q");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "OUvr2mEd9ng");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "vNBk1gJSepA");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "j4X8uKyDSvE");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Maths_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }

                if (m11.contentEquals("Physics_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "V5zHhBNjfwc");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Physics_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Chemistry_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_12")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_13")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_14")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Chemistry_2_15")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }


                if (m11.contentEquals("Biology_2_1")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_2")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_3")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_4")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_5")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_6")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_7")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_8")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_9")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_10")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
                    startActivity(intent1);
                    finish();
                }
                if (m11.contentEquals("Biology_2_11")) {
                    Intent intent1 = new Intent(getApplicationContext(), YoutubePlayer.class);
                    intent1.putExtra("video_id", "");
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


            }
        });





    }

    @Override
    public void onBackPressed() {
        finish();

    }
    }

