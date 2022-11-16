package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

import org.w3c.dom.Text;

public class aboutus extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        ImageView tele =findViewById(R.id.teleIMAge);
        ImageView btnew =findViewById(R.id.sharenew);
        TextView btTEXT =findViewById(R.id.shareTEXT);
        ImageView back = findViewById(R.id.back14);
        TextView telenext =findViewById(R.id.teleTEXt);
        ImageView insta=findViewById(R.id.insata);
        TextView instaTEXT=findViewById(R.id.textView_a2);
        ImageView fackBK=findViewById(R.id.face);
        TextView faceBookTEXT=findViewById(R.id.faceTEXT);

        fackBK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntent());
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });
        faceBookTEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntent());
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });
        instaTEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://instagram.com/kcet_complete_guide?igshid=YmMyMTA2M2Y=");


                Intent i= new Intent(Intent.ACTION_VIEW,uri);

                i.setPackage("com.instagram.android");

                try {
                    startActivity(i);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://instagram.com/kcet_complete_guide?igshid=YmMyMTA2M2Y=")));
                }


            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://instagram.com/kcet_complete_guide?igshid=YmMyMTA2M2Y=");


                Intent i= new Intent(Intent.ACTION_VIEW,uri);

                i.setPackage("com.instagram.android");

                try {
                    startActivity(i);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://instagram.com/kcet_complete_guide?igshid=YmMyMTA2M2Y=")));
                }


            }
        });

        LinearLayout email=findViewById(R.id.emailbtn);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType(ClipDescription.MIMETYPE_TEXT_PLAIN);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"edutech0302@gmail.com"});
                intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"How can we help you?");
                startActivity(Intent.createChooser(intent,"Send Email"));
            }
        });


        telenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getTelegramInt(aboutus.this);
            }
        });


        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getTelegramInt(aboutus.this);
            }
        });


        btTEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "\nHey!there Check Out This Awesome App for NEET Preparation\n \nPrepare for NEET with NEET Exam Guide which is a package of study materials, video lectures, colleges list , Mock tests. Predict your rank, free college predictor etc...  In one place\n \n It's ad free,\n \n download the app now";
                String sub = "Prepare for K-CET with kcet Exam Guide which is a package of study materials, video lectures, colleges list , Mock tests. Predict your rank, free college predictor etc...  In one place It's ad free, download the app now";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });

        btnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "\nHey!there Check Out This Awesome App for KCET Preparation\n \nPrepare for NEET with NEET Exam Guide which is a package of study materials, video lectures, colleges list , Mock tests. Predict your rank, free college predictor etc...  In one place\n \n It's ad free,\n \n download the app now";
                String sub = "Prepare for K-CET with kcet Exam Guide which is a package of study materials, video lectures, colleges list , Mock tests. Predict your rank, free college predictor etc...  In one place It's ad free, download the app now";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fin = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(fin);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });

    }




    private void getTelegramInt(Context context) {

        Intent intent;

        try {
            try {
                context.getPackageManager().getPackageInfo("org.telegram.messenger", 0);
            } catch (PackageManager.NameNotFoundException e) {
                context.getPackageManager().getPackageInfo("org.thunderdog.challegram", 0);
            }
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tg://resolve?domain=+xAWmPUgBE7NmODg9"));
            startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



        } catch (PackageManager.NameNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/+xAWmPUgBE7NmODg9"));
            startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


        }
    }
    public Intent getOpenFacebookIntent() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/100086491630238"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100086491630238"));
        }
    }
    @Override
    protected void onStart() {
        IntentFilter filter =new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeList,filter);

        super.onStart();
    }

    @Override
    protected void onStop() {
        unregisterReceiver(networkChangeList);
        super.onStop();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
        finish();
    }
}