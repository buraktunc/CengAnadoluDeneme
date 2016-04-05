package com.example.burak.cenganadoludeneme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class CalculateActivity extends AppCompatActivity {

    String str1, str2, str3, str4, c, d, e;

    double x, y, z, t, tt;


    EditText textView1;
    EditText textView2;
    EditText textView3;
    EditText textView4;
    TextView tvYourGPA;


    EditText etCredit1, etCredit2, etCredit3, etCredit4, etCredit5, etCredit6, etCredit7, etCredit8, etCredit9, etCredit10;

    EditText etGrade1, etGrade2, etGrade3, etGrade4, etGrade5, etGrade6, etGrade7, etGrade8, etGrade9, etGrade10;
    TextView tvYourGpa, tvTotalCredit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        /*textView1 = (EditText) findViewById(R.id.textView1);
        textView2 = (EditText) findViewById(R.id.textView2);
        textView3 = (EditText) findViewById(R.id.textView3);
        textView4 = (EditText) findViewById(R.id.textView4);*/


        tvYourGpa = (TextView) findViewById(R.id.tvYourGpa);
        tvTotalCredit1 = (TextView) findViewById(R.id.tvTotalCredit1);


        etCredit1 = (EditText) findViewById(R.id.etCredit1);
        etCredit2 = (EditText) findViewById(R.id.etCredit2);
        etCredit3 = (EditText) findViewById(R.id.etCredit3);
        etCredit4 = (EditText) findViewById(R.id.etCredit4);
        etCredit5 = (EditText) findViewById(R.id.etCredit5);
        etCredit6 = (EditText) findViewById(R.id.etCredit6);
        etCredit7 = (EditText) findViewById(R.id.etCredit7);
        etCredit8 = (EditText) findViewById(R.id.etCredit8);
        etCredit9 = (EditText) findViewById(R.id.etCredit9);
        etCredit10 = (EditText) findViewById(R.id.etCredit10);

        etGrade1 = (EditText) findViewById(R.id.etGrade1);
        etGrade2 = (EditText) findViewById(R.id.etGrade2);
        etGrade3 = (EditText) findViewById(R.id.etGrade3);
        etGrade4 = (EditText) findViewById(R.id.etGrade4);
        etGrade5 = (EditText) findViewById(R.id.etGrade5);
        etGrade6 = (EditText) findViewById(R.id.etGrade6);
        etGrade7 = (EditText) findViewById(R.id.etGrade7);
        etGrade8 = (EditText) findViewById(R.id.etGrade8);
        etGrade9 = (EditText) findViewById(R.id.etGrade9);
        etGrade10 = (EditText) findViewById(R.id.etGrade10);

        //  Grade Harflerini büyük harf notu olarak yazdırdık
        etGrade1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade4.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade5.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade6.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade7.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade8.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade9.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        etGrade10.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        // Grade'e filtre koyduk(2 harf)
        InputFilter[] filterArray = new InputFilter[1];
        filterArray[0] = new InputFilter.LengthFilter(2);
        etGrade1.setFilters(filterArray);
        etGrade2.setFilters(filterArray);
        etGrade3.setFilters(filterArray);
        etGrade4.setFilters(filterArray);
        etGrade5.setFilters(filterArray);
        etGrade6.setFilters(filterArray);
        etGrade7.setFilters(filterArray);
        etGrade8.setFilters(filterArray);
        etGrade9.setFilters(filterArray);
        etGrade10.setFilters(filterArray);


        Button btnCalculateGpa = (Button) findViewById(R.id.btnCalculateGpa);

        btnCalculateGpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   str1= textView1.getText().toString(); // EditText i stringe çevir
                str2 = textView2.getText().toString();
                str3 = textView3.getText().toString();
                str4 = textView4.getText().toString();
                t = lettersToGrade(str2); // Harf botunu string çevir
                tt = lettersToGrade(str4);
                Float f = Float.parseFloat(str1); // String olan krediyi floata çevir
                Float ff = Float.parseFloat(str3);*/

                String credit1 = etCredit1.getText().toString();
                String credit2 = etCredit2.getText().toString();
                String credit3 = etCredit3.getText().toString();
                String credit4 = etCredit4.getText().toString();
                String credit5 = etCredit5.getText().toString();
                String credit6 = etCredit6.getText().toString();
                String credit7 = etCredit7.getText().toString();
                String credit8 = etCredit8.getText().toString();
                String credit9 = etCredit9.getText().toString();
                String credit10 = etCredit10.getText().toString();


                double grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9, grade10;

                grade1 = lettersToGrade(etGrade1.getText().toString());
                grade2 = lettersToGrade(etGrade2.getText().toString());
                grade3 = lettersToGrade(etGrade3.getText().toString());
                grade4 = lettersToGrade(etGrade4.getText().toString());
                grade5 = lettersToGrade(etGrade5.getText().toString());
                grade6 = lettersToGrade(etGrade6.getText().toString());
                grade7 = lettersToGrade(etGrade7.getText().toString());
                grade8 = lettersToGrade(etGrade8.getText().toString());
                grade9 = lettersToGrade(etGrade9.getText().toString());
                grade10 = lettersToGrade(etGrade10.getText().toString());

                double fCredit1 = 0;
                double fCredit2 = 0.0;
                double fCredit3 = 0;
                double fCredit4 = 0;
                double fCredit5 = 0;
                double fCredit6 = 0;
                double fCredit7 = 0;
                double fCredit8 = 0;
                double fCredit9 = 0;
                double fCredit10 = 0;


                try {
                    fCredit1 = Float.parseFloat(credit1);
                    fCredit2 = Float.parseFloat(credit2);
                    fCredit3 = Float.parseFloat(credit3);
                    fCredit4 = Float.parseFloat(credit4);
                    fCredit5 = Float.parseFloat(credit5);
                    fCredit6 = Float.parseFloat(credit6);
                    fCredit7 = Float.parseFloat(credit7);
                    fCredit8 = Float.parseFloat(credit8);
                    fCredit9 = Float.parseFloat(credit9);
                    fCredit10 = Float.parseFloat(credit10);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                double gpa = ((grade1 * fCredit1 + grade2 * fCredit2 + grade3 * fCredit3 + grade4 * fCredit4 +
                        grade5 * fCredit5 + grade6 * fCredit6 + grade7 * fCredit7 + grade8 * fCredit8 + grade9 * fCredit9 + grade10 * fCredit10) /
                        (fCredit1 + fCredit2 + fCredit3 + fCredit4 + fCredit5 + fCredit6 + fCredit7 + fCredit8 + fCredit9 + fCredit10));

                double tCredit = fCredit1 + fCredit2 + fCredit3 + fCredit4 + fCredit5 + fCredit6 + fCredit7 + fCredit8 + fCredit9 + fCredit10;
                String sTotalCredit = Double.toString(tCredit);
                String sGpa = Double.toString(gpa);


                tvYourGpa.setText(sGpa);
                tvTotalCredit1.setText(sTotalCredit);


              /*  double z = (t*f + tt*ff) / (f+ff);
                DecimalFormat df = new DecimalFormat("###0.00");
                df.format(z);
                d= Double.toString(z);

                tvYourGPA.setText(d);*/
            }
        });

        //Not silindi ardından hint eklendi
        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etGrade1.getText().clear();
                etGrade1.setHint("FF");
                etGrade2.getText().clear();
                etGrade2.setHint("FF");
                etGrade3.getText().clear();
                etGrade3.setHint("FF");
                etGrade4.getText().clear();
                etGrade4.setHint("FF");
                etGrade5.getText().clear();
                etGrade5.setHint("FF");
                etGrade6.getText().clear();
                etGrade6.setHint("FF");
                etGrade7.getText().clear();
                etGrade7.setHint("FF");
                etGrade8.getText().clear();
                etGrade8.setHint("FF");
                etGrade9.getText().clear();
                etGrade9.setHint("FF");
                etGrade10.getText().clear();
                etGrade10.setHint("FF");

                etCredit1.getText().clear();
                etCredit1.setHint("0.00");
                etCredit2.getText().clear();
                etCredit2.setHint("0.00");
                etCredit3.getText().clear();
                etCredit3.setHint("0.00");
                etCredit4.getText().clear();
                etCredit4.setHint("0.00");
                etCredit5.getText().clear();
                etCredit5.setHint("0.00");
                etCredit6.getText().clear();
                etCredit6.setHint("0.00");
                etCredit7.getText().clear();
                etCredit7.setHint("0.00");
                etCredit8.getText().clear();
                etCredit8.setHint("0.00");
                etCredit9.getText().clear();
                etCredit9.setHint("0.00");
                etCredit10.getText().clear();
                etCredit10.setHint("0.00");


            }
        });

    }


    public Float lettersToGrade(String grade) {

        float realGrade;


        //grade.equals("AA") çalışmıyor. grade.trim().equals("AA") kullan
        if (grade.trim().equals("AA")) {
            grade = "4.00";
        } else if (grade.trim().equals("AB")) {
            grade = "3.70";
        } else if (grade.trim().equals("BA")) {
            grade = "3.30";
        } else if (grade.trim().equals("BB")) {
            grade = "3.00";
        } else if (grade.trim().equals("BC")) {
            grade = "2.70";
        } else if (grade.trim().equals("CB")) {
            grade = "2.30";
        } else if (grade.trim().equals("CC")) {
            grade = "2.00";
        } else if (grade.trim().equals("CD")) {
            grade = "1.70";
        } else if (grade.trim().equals("DC")) {
            grade = "1.30";
        } else if (grade.trim().equals("DD")) {
            grade = "1.00";
        } else if (grade.trim().equals("FF")) {
            grade = "0.00";}
        else if(grade.trim().equals("DZ")){
            grade = "0.00";
        } else if (grade.trim().equals(""))
            grade = "0.00";



        //realGrade = Double.valueOf(grade.trim()).doubleValue();

        // grade stringini floata çevir
        realGrade = Float.parseFloat(grade);
        return realGrade;
    }

}