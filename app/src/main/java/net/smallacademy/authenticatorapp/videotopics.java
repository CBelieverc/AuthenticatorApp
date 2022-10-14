package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class videotopics extends AppCompatActivity {
    TextView textView,buttone1,buttone2,buttone3,buttone4;
    TextView button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videotopics);
        getWindow().setStatusBarColor(ContextCompat.getColor(videotopics.this,R.color.colorPrimaryDark));
        ImageView back11 =findViewById(R.id.back11);
        back11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        textView=findViewById(R.id.heading);
        button1=findViewById(R.id.button_t1);
        button2=findViewById(R.id.button_t2);
        button3=findViewById(R.id.button_t3);
        button4=findViewById(R.id.button_t4);
        button5=findViewById(R.id.button_t5);
        button6=findViewById(R.id.button_t6);
        button7=findViewById(R.id.button_t7);
        button8=findViewById(R.id.button_t8);
        button9=findViewById(R.id.button_t9);
        button10=findViewById(R.id.button_t10);
        button11=findViewById(R.id.button_t11);
        button12=findViewById(R.id.button_t12);
        button13=findViewById(R.id.button_t13);
        button14=findViewById(R.id.button_t14);
        button15=findViewById(R.id.button_t15);
        buttone1=findViewById(R.id.button_e12);
        buttone2=findViewById(R.id.button_e13);
        buttone3=findViewById(R.id.button_e14);
        buttone4=findViewById(R.id.button_e15);


        String h1 = getIntent().getStringExtra("heading1");
        textView.setText(h1);
        String t1 = getIntent().getStringExtra("topic1");
        button1.setText(t1);
        String t2 = getIntent().getStringExtra("topic2");
        button2.setText(t2);
        String t3 = getIntent().getStringExtra("topic3");
        button3.setText(t3);
        String t4 = getIntent().getStringExtra("topic4");
        button4.setText(t4);
        String t5 = getIntent().getStringExtra("topic5");
        button5.setText(t5);
        String t6 = getIntent().getStringExtra("topic6");
        button6.setText(t6);
        String t7 = getIntent().getStringExtra("topic7");
        button7.setText(t7);
        String t8 = getIntent().getStringExtra("topic8");
        button8.setText(t8);
        String t9 = getIntent().getStringExtra("topic9");
        button9.setText(t9);
        String t10 = getIntent().getStringExtra("topic10");
        button10.setText(t10);
        String t11 = getIntent().getStringExtra("topic11");
        button11.setText(t11);
        String t12 = getIntent().getStringExtra("topic12");
        button12.setText(t12);
        String t13 = getIntent().getStringExtra("topic13");
        button13.setText(t13);
        String t14 = getIntent().getStringExtra("topic14");
        button14.setText(t14);
        String t15 = getIntent().getStringExtra("topic15");
        button15.setText(t15);


        if(t12.contentEquals(" ")){
            buttone1.setText("");
        }
        if(t13.contentEquals(" ")){
            buttone2.setText("");
        }
        if(t14.contentEquals(" ")){
            buttone3.setText("");
        }
        if(t15.contentEquals(" ")){
            buttone4.setText("");
        }



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_1");
                    intent1.putExtra("video1","Sets, Relations & Functions - 1");
                    intent1.putExtra("video2","Sets, Relations & Functions - previous year questions");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_1");
                    intent1.putExtra("video1","Physical World");
                    intent1.putExtra("video2","Physical World");
                    intent1.putExtra("video3","Physical World - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_1");
                    intent1.putExtra("video1","Some Basic Concepts of Chemistry");
                    intent1.putExtra("video2","Some Basic Concepts of Chemistry");
                    intent1.putExtra("video3","Some Basic Concepts of Chemistry - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_1");
                    intent1.putExtra("video1","The living world");
                    intent1.putExtra("video2","The living world");
                    intent1.putExtra("video3","The living world - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_1");
                    intent1.putExtra("video1","Relations & Functions");
                    intent1.putExtra("video2","Relations & Functions");
                    intent1.putExtra("video3","Relations & Functions - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_1");
                    intent1.putExtra("video1","Electric Charges and Field");
                    intent1.putExtra("video2","Electric Charges and Field");
                    intent1.putExtra("video3","Electric Charges and Field - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_1");
                    intent1.putExtra("video1","Solid State");
                    intent1.putExtra("video2","Solid State");
                    intent1.putExtra("video3","Solid State - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_1");
                    intent1.putExtra("video1","Animal Kingdom");
                    intent1.putExtra("video2","Animal Kingdom");
                    intent1.putExtra("video3","Animal Kingdom - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_2");
                    intent1.putExtra("video1","Trigonometric Functions");
                    intent1.putExtra("video2","Trigonometric Functions");
                    intent1.putExtra("video3","Trigonometric Functions - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_2");
                    intent1.putExtra("video1","Units and Measurements");
                    intent1.putExtra("video2","Units and Measurements");
                    intent1.putExtra("video3","Units and Measurements - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_2");
                    intent1.putExtra("video1","Structure of Atom");
                    intent1.putExtra("video2","Structure of Atom");
                    intent1.putExtra("video3","Structure of Atom - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_2");
                    intent1.putExtra("video1","Biological classification");
                    intent1.putExtra("video2","Biological classification");
                    intent1.putExtra("video3","Biological classification - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_2");
                    intent1.putExtra("video1","Inverse Trigonometric functions");
                    intent1.putExtra("video2","Inverse Trigonometric functions");
                    intent1.putExtra("video3","Inverse Trigonometric functions - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_2");
                    intent1.putExtra("video1","Electrostatic Potential and Capacitance");
                    intent1.putExtra("video2","Electrostatic Potential and Capacitance");
                    intent1.putExtra("video3","Electrostatic Potential and Capacitance - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_2");
                    intent1.putExtra("video1","Solutions");
                    intent1.putExtra("video2","Solutions");
                    intent1.putExtra("video3","Solutions - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_2");
                    intent1.putExtra("video1","Structural organization in animals");
                    intent1.putExtra("video2","Structural organization in animals");
                    intent1.putExtra("video3","Structural organization in animals - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_3");
                    intent1.putExtra("video1","Principle of Mathematical Induction");
                    intent1.putExtra("video2","Principle of Mathematical Induction");
                    intent1.putExtra("video3","Principle of Mathematical Induction - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_3");
                    intent1.putExtra("video1","Motion in a Straight Line");
                    intent1.putExtra("video2","Motion in a Straight Line");
                    intent1.putExtra("video3","Motion in a Straight Line - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_3");
                    intent1.putExtra("video1","Classification of Elements and Periodicity in Properties");
                    intent1.putExtra("video2","Classification of Elements and Periodicity in Properties");
                    intent1.putExtra("video3","Classification of Elements and Periodicity in Properties - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_3");
                    intent1.putExtra("video1","Plant Kingdom");
                    intent1.putExtra("video2","Plant Kingdom");
                    intent1.putExtra("video3","Plant Kingdom - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_3");
                    intent1.putExtra("video1","Matrices");
                    intent1.putExtra("video2","Matrices");
                    intent1.putExtra("video3","Matrices - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_3");
                    intent1.putExtra("video1","Current Electricity");
                    intent1.putExtra("video2","Current Electricity");
                    intent1.putExtra("video3","Current Electricity - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_3");
                    intent1.putExtra("video1","Electrochemistry");
                    intent1.putExtra("video2","Electrochemistry");
                    intent1.putExtra("video3","Electrochemistry - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_3");
                    intent1.putExtra("video1","Body fluids and circulation");
                    intent1.putExtra("video2","Body fluids and circulation");
                    intent1.putExtra("video3","Body fluids and circulation - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_4");
                    intent1.putExtra("video1","Complex numbers and Quadratic equations");
                    intent1.putExtra("video2","Complex numbers and Quadratic equations");
                    intent1.putExtra("video3","Complex numbers and Quadratic equations - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_4");
                    intent1.putExtra("video1","Motion in a Plane");
                    intent1.putExtra("video2","Motion in a Plane");
                    intent1.putExtra("video3","Motion in a Plane - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_4");
                    intent1.putExtra("video1","Chemical Bonding and Molecular Structure,States of Matter Gases and Liquids");
                    intent1.putExtra("video2","Chemical Bonding and Molecular Structure,States of Matter Gases and Liquids");
                    intent1.putExtra("video3","Chemical Bonding and Molecular Structure,States of Matter Gases and Liquids - previous year questions");
                    intent1.putExtra("video4"," - previous year questions");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_4");
                    intent1.putExtra("video1","Cell cycle and Cell divison");
                    intent1.putExtra("video2","Cell cycle and Cell divison");
                    intent1.putExtra("video3","Cell cycle and Cell divison - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_4");
                    intent1.putExtra("video1","Determinants");
                    intent1.putExtra("video2","Determinants");
                    intent1.putExtra("video3","Determinants - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_4");
                    intent1.putExtra("video1","Moving Charges and Magnetism");
                    intent1.putExtra("video2","Moving Charges and Magnetism");
                    intent1.putExtra("video3","Moving Charges and Magnetism - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_4");
                    intent1.putExtra("video1","Chemical Kinetics, Surface chemistry");
                    intent1.putExtra("video2","Chemical Kinetics, Surface chemistry");
                    intent1.putExtra("video3","Chemical Kinetics, Surface chemistry - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_4");
                    intent1.putExtra("video1","Chemical Coordination and integration");
                    intent1.putExtra("video2","Chemical Coordination and integration");
                    intent1.putExtra("video3","Chemical Coordination and integration - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_5");
                    intent1.putExtra("video1","Linear Inequalities");
                    intent1.putExtra("video2","Linear Inequalities");
                    intent1.putExtra("video3","Linear Inequalities - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_5");
                    intent1.putExtra("video1","Laws of Motion");
                    intent1.putExtra("video2","Laws of Motion");
                    intent1.putExtra("video3","Laws of Motion - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_5");
                    intent1.putExtra("video1","Thermodynamics");
                    intent1.putExtra("video2","Thermodynamics");
                    intent1.putExtra("video3","Thermodynamics - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_5");
                    intent1.putExtra("video1","Morphology of flowering plants");
                    intent1.putExtra("video2","Morphology of flowering plants");
                    intent1.putExtra("video3","Morphology of flowering plants - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_5");
                    intent1.putExtra("video1","Continuity and Differentiability");
                    intent1.putExtra("video2","Continuity and Differentiability");
                    intent1.putExtra("video3","Continuity and Differentiability - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_5");
                    intent1.putExtra("video1","Magnetism and Matter");
                    intent1.putExtra("video2","Magnetism and Matter");
                    intent1.putExtra("video3","Magnetism and Matter - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_5");
                    intent1.putExtra("video1","General Principles and Processes of Isolation of Elements");
                    intent1.putExtra("video2","General Principles and Processes of Isolation of Elements");
                    intent1.putExtra("video3","General Principles and Processes of Isolation of Elements - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_5");
                    intent1.putExtra("video1","Neural control and coordination");
                    intent1.putExtra("video2","Neural control and coordination");
                    intent1.putExtra("video3","Neural control and coordination - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_6");
                    intent1.putExtra("video1","Permutations and Combination");
                    intent1.putExtra("video2","Permutations and Combination");
                    intent1.putExtra("video3","Permutations and Combination - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_6");
                    intent1.putExtra("video1","Work, Energy & Power");
                    intent1.putExtra("video2","Work, Energy & Power");
                    intent1.putExtra("video3","Work, Energy & Power - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_6");
                    intent1.putExtra("video1","Equilibrium");
                    intent1.putExtra("video2","Equilibrium");
                    intent1.putExtra("video3","Equilibrium - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_6");
                    intent1.putExtra("video1","Locomotion and movement");
                    intent1.putExtra("video2","Locomotion and movement");
                    intent1.putExtra("video3","Locomotion and movement - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_6");
                    intent1.putExtra("video1","Application of Derivative");
                    intent1.putExtra("video2","Application of Derivative");
                    intent1.putExtra("video3","Application of Derivative - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_6");
                    intent1.putExtra("video1","Electromagnetic Induction");
                    intent1.putExtra("video2","Electromagnetic Induction");
                    intent1.putExtra("video3","Electromagnetic Induction - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_6");
                    intent1.putExtra("video1","p-Block Elements");
                    intent1.putExtra("video2","p-Block Elements");
                    intent1.putExtra("video3","p-Block Elements - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_6");
                    intent1.putExtra("video1","Breathing and exchange of gases");
                    intent1.putExtra("video2","Breathing and exchange of gases");
                    intent1.putExtra("video3","Breathing and exchange of gases - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_7");
                    intent1.putExtra("video1","Binomial Theorem");
                    intent1.putExtra("video2","Binomial Theorem");
                    intent1.putExtra("video3","Binomial Theorem - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_7");
                    intent1.putExtra("video1","Systems of Particles and Rotational Motion");
                    intent1.putExtra("video2","Systems of Particles and Rotational Motion");
                    intent1.putExtra("video3","Systems of Particles and Rotational Motion - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_7");
                    intent1.putExtra("video1","Redox reactions");
                    intent1.putExtra("video2","Redox reactions");
                    intent1.putExtra("video3","Redox reactions - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading","Biology_1_7");
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("video1","Anatomy of flowering plants");
                    intent1.putExtra("video2","Anatomy of flowering plants");
                    intent1.putExtra("video3","Anatomy of flowering plants - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading","Maths_2_7");
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("video1","Integrals");
                    intent1.putExtra("video2","Integrals");
                    intent1.putExtra("video3","Integrals - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading","Physics_2_7");
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("video1","Alternating Current");
                    intent1.putExtra("video2","Alternating Current");
                    intent1.putExtra("video3","Alternating Current - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading","Chemistry_2_7");
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("video1","d and f Block Elements");
                    intent1.putExtra("video2","d and f Block Elements");
                    intent1.putExtra("video3","d and f Block Elements - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading","Biology_2_7");
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("video1","Mineral nutrition");
                    intent1.putExtra("video2","Mineral nutrition");
                    intent1.putExtra("video3","Mineral nutrition - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_8");
                    intent1.putExtra("video1","Sequence & Series");
                    intent1.putExtra("video2","Sequence & Series");
                    intent1.putExtra("video3","Sequence & Series - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_8");
                    intent1.putExtra("video1","Gravitation");
                    intent1.putExtra("video2","Gravitation");
                    intent1.putExtra("video3","Gravitation - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_8");
                    intent1.putExtra("video1","Hydrogen");
                    intent1.putExtra("video2","Hydrogen");
                    intent1.putExtra("video3","Hydrogen - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_8");
                    intent1.putExtra("video1","Excretory products and their elimination");
                    intent1.putExtra("video2","Excretory products and their elimination");
                    intent1.putExtra("video3","Excretory products and their elimination - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_8");
                    intent1.putExtra("video1","Application of Integrals");
                    intent1.putExtra("video2","Application of Integrals");
                    intent1.putExtra("video3","Application of Integrals - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_8");
                    intent1.putExtra("video1","Electromagnetic Waves");
                    intent1.putExtra("video2","Electromagnetic Waves");
                    intent1.putExtra("video3","Electromagnetic Waves - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_8");
                    intent1.putExtra("video1","Coordination Compounds");
                    intent1.putExtra("video2","Coordination Compounds");
                    intent1.putExtra("video3","Coordination Compounds - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_8");
                    intent1.putExtra("video1","Transport in Plants");
                    intent1.putExtra("video2","Transport in Plants");
                    intent1.putExtra("video3","Transport in Plants - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_9");
                    intent1.putExtra("video1","Straight Lines");
                    intent1.putExtra("video2","Straight Lines");
                    intent1.putExtra("video3","Straight Lines - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_9");
                    intent1.putExtra("video1","Mechanical Properties of Solids");
                    intent1.putExtra("video2","Mechanical Properties of Solids");
                    intent1.putExtra("video3","Mechanical Properties of Solids - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_9");
                    intent1.putExtra("video1","s – Block Elements");
                    intent1.putExtra("video2","s – Block Elements");
                    intent1.putExtra("video3","s – Block Elements - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_9");
                    intent1.putExtra("video1","Cell – The unit of life");
                    intent1.putExtra("video2","Cell – The unit of life");
                    intent1.putExtra("video3","Cell – The unit of life - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_9");
                    intent1.putExtra("video1","Differential Equations");
                    intent1.putExtra("video2","Differential Equations");
                    intent1.putExtra("video3","Differential Equations - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_9");
                    intent1.putExtra("video1","Ray Optics and Optical Instruments");
                    intent1.putExtra("video2","Ray Optics and Optical Instruments");
                    intent1.putExtra("video3","Ray Optics and Optical Instruments - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_9");
                    intent1.putExtra("video1","Haloalkanes and Haloarenes");
                    intent1.putExtra("video2","Haloalkanes and Haloarenes");
                    intent1.putExtra("video3","Haloalkanes and Haloarenes - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_9");
                    intent1.putExtra("video1","Respiration in plants");
                    intent1.putExtra("video2","Respiration in plants");
                    intent1.putExtra("video3","Respiration in plants - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_10");
                    intent1.putExtra("video1","Conic Sections");
                    intent1.putExtra("video2","Conic Sections");
                    intent1.putExtra("video3","Conic Sections - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_10");
                    intent1.putExtra("video1","Mechanical Properties of Fluids");
                    intent1.putExtra("video2","Mechanical Properties of Fluids");
                    intent1.putExtra("video3","Mechanical Properties of Fluids - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_10");
                    intent1.putExtra("video1","Some p – Block Elements");
                    intent1.putExtra("video2","Some p – Block Elements");
                    intent1.putExtra("video3","Some p – Block Elements - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_10");
                    intent1.putExtra("video1","Bio molecules");
                    intent1.putExtra("video2","Bio molecules");
                    intent1.putExtra("video3","Bio molecules - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_10");
                    intent1.putExtra("video1","Vector Algebra");
                    intent1.putExtra("video2","Vector Algebra");
                    intent1.putExtra("video3","Vector Algebra - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_10");
                    intent1.putExtra("video1","Wave Optics");
                    intent1.putExtra("video2","Wave Optics");
                    intent1.putExtra("video3","Wave Optics - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_10");
                    intent1.putExtra("video1","Alcohols");
                    intent1.putExtra("video2","Alcohols");
                    intent1.putExtra("video3","Alcohols - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_10");
                    intent1.putExtra("video1","Digestion and Absorption");
                    intent1.putExtra("video2","Digestion and Absorption");
                    intent1.putExtra("video3","Digestion and Absorption - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_11");
                    intent1.putExtra("video1","introduction to 3D-Geometry");
                    intent1.putExtra("video2","introduction to 3D-Geometry");
                    intent1.putExtra("video3","introduction to 3D-Geometry - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_11");
                    intent1.putExtra("video1","Thermal Properties of Matter");
                    intent1.putExtra("video2","Thermal Properties of Matter");
                    intent1.putExtra("video3","Thermal Properties of Matter - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_11");
                    intent1.putExtra("video1","Organic Chemistry – Some basic principles & Techniques");
                    intent1.putExtra("video2","Organic Chemistry – Some basic principles & Techniques");
                    intent1.putExtra("video3","Organic Chemistry – Some basic principles & Techniques - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_11");
                    intent1.putExtra("video1","Photosynthesis in higher plants");
                    intent1.putExtra("video2","Photosynthesis in higher plants");
                    intent1.putExtra("video3","Photosynthesis in higher plants");
                    intent1.putExtra("video4","Photosynthesis in higher plants - previous year questions");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_11");
                    intent1.putExtra("video1","Three Dimensional Geometry");
                    intent1.putExtra("video2","Three Dimensional Geometry");
                    intent1.putExtra("video3","Three Dimensional Geometry - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_11");
                    intent1.putExtra("video1","Dual Nature of Radiation and Matter");
                    intent1.putExtra("video2","Dual Nature of Radiation and Matter");
                    intent1.putExtra("video3","Dual Nature of Radiation and Matter - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_11");
                    intent1.putExtra("video1","Phenols and Ethers");
                    intent1.putExtra("video2","Phenols and Ethers");
                    intent1.putExtra("video3","Phenols and Ethers - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_11");
                    intent1.putExtra("video1","Plant – Growth and Development");
                    intent1.putExtra("video2","Plant – Growth and Development");
                    intent1.putExtra("video3","Plant – Growth and Development - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_12");
                    intent1.putExtra("video1","Limits & Derivatives");
                    intent1.putExtra("video2","Limits & Derivatives");
                    intent1.putExtra("video3","Limits & Derivatives - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_12");
                    intent1.putExtra("video1","Thermodynamics, Kinetic Theory");
                    intent1.putExtra("video2","Thermodynamics, Kinetic Theory");
                    intent1.putExtra("video3","Thermodynamics, Kinetic Theory - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_12");
                    intent1.putExtra("video1","Hydrocarbons");
                    intent1.putExtra("video2","Hydrocarbons");
                    intent1.putExtra("video3","Hydrocarbons - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_12");
                    intent1.putExtra("video1","Linear Programming");
                    intent1.putExtra("video2","Linear Programming");
                    intent1.putExtra("video3","Linear Programming - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_12");
                    intent1.putExtra("video1","Atoms");
                    intent1.putExtra("video2","Atoms");
                    intent1.putExtra("video3","Atoms - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_12");
                    intent1.putExtra("video1","Aldehydes");
                    intent1.putExtra("video2","Aldehydes");
                    intent1.putExtra("video3","Aldehydes - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_12");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_12");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_13");
                    intent1.putExtra("video1","Mathematical Reasoning");
                    intent1.putExtra("video2","Mathematical Reasoning");
                    intent1.putExtra("video3","Mathematical Reasoning - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_13");
                    intent1.putExtra("video1","Oscillations");
                    intent1.putExtra("video2","Oscillations");
                    intent1.putExtra("video3","Oscillations - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_13");
                    intent1.putExtra("video1","Environmental chemistry");
                    intent1.putExtra("video2","Environmental chemistry");
                    intent1.putExtra("video3","Environmental chemistry - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_13");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_13");
                    intent1.putExtra("video1","Probability");
                    intent1.putExtra("video2","Probability");
                    intent1.putExtra("video3","Probability - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_13");
                    intent1.putExtra("video1","Nuclei");
                    intent1.putExtra("video2","Nuclei");
                    intent1.putExtra("video3","Nuclei - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_13");
                    intent1.putExtra("video1","Ketones and Carboxylic acids");
                    intent1.putExtra("video2","Ketones and Carboxylic acids");
                    intent1.putExtra("video3","Ketones and Carboxylic acids - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_13");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_14");
                    intent1.putExtra("video1","Statistics");
                    intent1.putExtra("video2","Statistics");
                    intent1.putExtra("video3","Statistics - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_14");
                    intent1.putExtra("video1","Waves");
                    intent1.putExtra("video2","Waves");
                    intent1.putExtra("video3","Waves - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_14");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_14");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_14");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_14");
                    intent1.putExtra("video1","Semiconductor Electronics");
                    intent1.putExtra("video2","Semiconductor Electronics");
                    intent1.putExtra("video3","Semiconductor Electronics - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_14");
                    intent1.putExtra("video1","Organic Compounds Containing Nitrogen Biomolecules");
                    intent1.putExtra("video2","Organic Compounds Containing Nitrogen Biomolecules");
                    intent1.putExtra("video3","Organic Compounds Containing Nitrogen Biomolecules - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_14");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }

            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = getIntent().getStringExtra("heading1");
                if(m1.contentEquals("First Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Maths");
                    intent1.putExtra("heading","Maths_1_15");
                    intent1.putExtra("video1","Probability");
                    intent1.putExtra("video2","Probability");
                    intent1.putExtra("video3","Probability - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Physics");
                    intent1.putExtra("heading","Physics_1_15");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_1_15");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("First Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","First Year PUC Biology");
                    intent1.putExtra("heading","Biology_1_15");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Maths")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Maths");
                    intent1.putExtra("heading","Maths_2_15");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Physics")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Physics");
                    intent1.putExtra("heading","Physics_2_15");
                    intent1.putExtra("video1","Communication Systems");
                    intent1.putExtra("video2","Communication Systems");
                    intent1.putExtra("video3","Communication Systems - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Chemistry")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Chemistry");
                    intent1.putExtra("heading","Chemistry_2_15");
                    intent1.putExtra("video1","Chemistry in Everyday Life");
                    intent1.putExtra("video2","Chemistry in Everyday Life");
                    intent1.putExtra("video3","Chemistry in Everyday Life - previous year questions");
                    intent1.putExtra("video4","");
                    startActivity(intent1);
                    finish();
                }
                if(m1.contentEquals("Second Year PUC Biology")){
                    Intent intent1 = new Intent(getApplicationContext(), videotopics2.class);
                    intent1.putExtra("heading11","Second Year PUC Biology");
                    intent1.putExtra("heading","Biology_2_15");
                    intent1.putExtra("video1","");
                    intent1.putExtra("video2","");
                    intent1.putExtra("video3","");
                    intent1.putExtra("video4","");
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