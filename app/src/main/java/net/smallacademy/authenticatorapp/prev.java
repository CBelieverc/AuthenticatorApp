package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

public class prev extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev);
        ImageView back2 =findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);

                finish();

            }
        });
    }
    //2022 year paper
    public void openactivity22(View view){
        //Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://images.collegedunia.com/public/image/870c68f3dab55d21a65554a65bd626a8.pdf");
        intent.putExtra("pdf_url5","https://images.collegedunia.com/public/image/83c3b7e9965eacf07839a4930125b058.pdf");
        startActivity(intent);
    }
    //2021 year paper
    public void openactivity21(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://images.collegedunia.com/public/image/d05b435a74ba9fcc58d9bb29de77ac5f.pdf");
        intent.putExtra("pdf_url5","https://images.collegedunia.com/public/image/4fbff5e12ef98f1adfc1a29808fc6767.pdf");
        startActivity(intent);
    }

    //2020 year paper
    public void openactivity20(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","http://images.collegedunia.com/public/image/96d1ad38553c29bf6f7fdc3614ec50c7.pdf");
        intent.putExtra("pdf_url5","https://images.collegedunia.com/public/image/83daefc0bf9aff367dc23620269db7e5.pdf");
        startActivity(intent);
    }

    //2019 year paper
    public void openactivity19(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","http://images.collegedunia.com/public/image/ee95a281f2880d61e21f5501220b7e32.pdf");
        intent.putExtra("pdf_url5","http://images.collegedunia.com/public/image/629d93ddc5cb9abb5b389fb22762fe57.pdf");
        startActivity(intent);
    }

    //2018 year paper
    public void openactivity18(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","http://images.collegedunia.com/public/image/0d1112f8d19bc6383701aa0814fbb1b8.pdf");
        intent.putExtra("pdf_url5","https://images.collegedunia.com/public/image/5e01112bf9d36f87bffb1462938f8cc9.pdf");
        startActivity(intent);
    }


    //2017 year paper
    public void openactivity17(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://images.collegedunia.com/public/image/869468a771cc20748b500c205ff8ca2c.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2017.pdf");
        startActivity(intent);
    }

    //2016 year paper
    public void openactivity16(View view){
        //Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://images.collegedunia.com/public/image/933897e0b2f3b18be0f51bec852e6525.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2016.pdf");
        startActivity(intent);
    }

    //2015 year paper
    public void openactivity15(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://images.collegedunia.com/public/image/e36649429c3b669d0a9d64aa5c969e8b.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2015.pdf");
        startActivity(intent);
    }

    //2014 year paper
    public void openactivity14(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://collegedunia.com/news/e-457-neet-2014-question-paper-with-answer-key-pdfs");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2014-407.pdf");
        startActivity(intent);
    }

    //2013 year paper
    public void openactivity13(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://collegedunia.com/news/e-457-neet-2013-question-paper-with-answer-key-pdfs");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2013-406.pdf");
        startActivity(intent);
    }

    //2012 year paper
    public void openactivity12(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://collegedunia.com/news/e-457-neet-2012-question-paper-with-answer-key-pdfs");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2012-405.pdf");
        startActivity(intent);
    }

    //2011 year paper
    public void openactivity11(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://drive.google.com/file/d/0B0I4YfZLhvamOFF6a3plR0xMRmM/view?usp=sharing&resourcekey=0-phDqKg6SrHh3vv5HeOraVQ");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2011-404.pdf");
        startActivity(intent);
    }

    //2010 year paper
    public void openactivity10(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://drive.google.com/file/d/0B0I4YfZLhvamS3JHSFB4X2poTVU/view?usp=sharing&resourcekey=0-7AmkNkZgJrVYbjAsb2-cVA");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2010-403.pdf");
        startActivity(intent);
    }

    //2009 year paper
    public void openactivity09(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://collegedunia.com/news/e-457-neet-2009-question-paper-with-answer-key-pdfs");
        intent.putExtra("pdf_url5","https://cdn.tardigrade.in/file/exam/kcet-2009-answer-key.pdf");
        startActivity(intent);
    }

    //2008 year paper
    public void openactivity08(View view){
        //Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://collegedunia.com/news/e-457-neet-2008-question-paper-with-answer-key-pdfs");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2008-402.pdf");
        startActivity(intent);
    }

    //2007 year paper
    public void openactivity07(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://collegedunia.com/news/e-457-neet-2007-question-paper-with-answer-key-pdfs");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2007-401.pdf");
        startActivity(intent);
    }

    //2006 year paper
    public void openactivity06(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://drive.google.com/file/d/0B0I4YfZLhvamMG5vVk4xTDRWeXc/view?usp=sharing&resourcekey=0-hQN39i8t_LTzWiPuRBHCoA");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2006-400.pdf");
        startActivity(intent);
    }

    //2005 year paper
    public void openactivity05(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://drive.google.com/file/d/0B0I4YfZLhvamZWV0ZHlJN1BlRmc/view?usp=sharing&resourcekey=0-9KqCLvcAnT0ymHMvicwbGg");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2005-399.pdf");
        startActivity(intent);
    }

    //2004 year paper
    public void openactivity04(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2004-371.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2004-398.pdf");
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
        finish();

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
}