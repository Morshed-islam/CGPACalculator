package com.genius.thirdeye_lll.sgpacalculator.CalculatorOfCgpa;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.genius.thirdeye_lll.sgpacalculator.R;

import java.text.DecimalFormat;

public class CalSubPage extends AppCompatActivity {
   ImageView back;
    Button calculate,reset;
    double cr1;
    double cr2;
    double cr3;
    double cr4;
    double cr5;
    double cr6;
    double cr7;
    double cr8;

    Spinner credit_1;
    Spinner credit_2;
    Spinner credit_3;
    Spinner credit_4;
    Spinner credit_5;
    Spinner credit_6;
    Spinner credit_7;
    Spinner credit_8;


    boolean flag;

    double gPoint;
    Spinner grade_1;
    Spinner grade_2;
    Spinner grade_3;
    Spinner grade_4;
    Spinner grade_5;
    Spinner grade_6;
    Spinner grade_7;
    Spinner grade_8;

    String nCourses;
    double r;

    TextView result;
    double s1;
    double s2;
    double s3;
    double s4;
    double s5;
    double s6;
    double s7;
    double s8;
    double s9;
    EditText sValue_1;
    EditText sValue_2;
    EditText sValue_3;
    EditText sValue_4;
    EditText sValue_5;
    EditText sValue_6;
    EditText sValue_7;
    EditText sValue_8;

    double tCredit;

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     // setContentView(R.layout.activity_cal_sub_page);

        creation();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
        addListenerOnButton_1();



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CalMAin.class));
            }
        });
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalSubPage.this.credit_1.setSelection(0, false);
                CalSubPage.this.credit_2.setSelection(0, false);
                CalSubPage.this.credit_3.setSelection(0, false);
                CalSubPage.this.credit_4.setSelection(0, false);
                CalSubPage.this.credit_5.setSelection(0, false);
                CalSubPage.this.credit_6.setSelection(0, false);
                CalSubPage.this.credit_7.setSelection(0, false);
                CalSubPage.this.credit_8.setSelection(0, false);

                CalSubPage.this.grade_1.setSelection(0, false);
                CalSubPage.this.grade_2.setSelection(0, false);
                CalSubPage.this.grade_3.setSelection(0, false);
                CalSubPage.this.grade_4.setSelection(0, false);
                CalSubPage.this.grade_5.setSelection(0, false);
                CalSubPage.this.grade_6.setSelection(0, false);
                CalSubPage.this.grade_7.setSelection(0, false);
                CalSubPage.this.grade_8.setSelection(0, false);

                CalSubPage.this.sValue_1.setText("");
                CalSubPage.this.sValue_1.setEnabled(false);
                CalSubPage.this.sValue_2.setText("");
                CalSubPage.this.sValue_2.setEnabled(false);
                CalSubPage.this.sValue_3.setText("");
                CalSubPage.this.sValue_3.setEnabled(false);
                CalSubPage.this.sValue_4.setText("");
                CalSubPage.this.sValue_4.setEnabled(false);
                CalSubPage.this.sValue_5.setText("");
                CalSubPage.this.sValue_5.setEnabled(false);
                CalSubPage.this.sValue_6.setText("");
                CalSubPage.this.sValue_6.setEnabled(false);
                CalSubPage.this.sValue_7.setText("");
                CalSubPage.this.sValue_7.setEnabled(false);
                CalSubPage.this.sValue_8.setText("");
                CalSubPage.this.sValue_8.setEnabled(false);

                CalSubPage.this.r = 0.0d;
                CalSubPage.this.flag = false;
                CalSubPage.this.result.setText("");
                CalSubPage.this.gPoint = 0.0d;
                CalSubPage.this.tCredit = 0.0d;
            }
        });

    }

    private void addListenerOnButton_1() {

        final Builder alert = new Builder(this);
        final Builder alert1 = new Builder(this);
        this.calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                CalSubPage.this.result.setText("");
                try {
                    if (CalSubPage.this.nCourses.equals("1")) {
                        CalSubPage.this.cr1 = Double.parseDouble(CalSubPage.this.credit_1.getSelectedItem().toString());
                        CalSubPage.this.cr2 = 0.0d;
                        CalSubPage.this.cr3 = 0.0d;
                        CalSubPage.this.cr4 = 0.0d;
                        CalSubPage.this.cr5 = 0.0d;
                        CalSubPage.this.cr6 = 0.0d;
                        CalSubPage.this.cr7 = 0.0d;
                        CalSubPage.this.cr8 = 0.0d;
                        CalSubPage.this.s1 = Double.parseDouble(CalSubPage.this.sValue_1.getText().toString());
                        CalSubPage.this.s2 = 0.0d;
                        CalSubPage.this.s3 = 0.0d;
                        CalSubPage.this.s4 = 0.0d;
                        CalSubPage.this.s5 = 0.0d;
                        CalSubPage.this.s6 = 0.0d;
                        CalSubPage.this.s7 = 0.0d;
                        CalSubPage.this.s8 = 0.0d;
                        CalSubPage.this.s9 = 0.0d;
                    } else if (CalSubPage.this.nCourses.equals("2")) {
                        CalSubPage.this.cr1 = Double.parseDouble(CalSubPage.this.credit_1.getSelectedItem().toString());
                        CalSubPage.this.cr2 = Double.parseDouble(CalSubPage.this.credit_2.getSelectedItem().toString());
                        CalSubPage.this.cr3 = 0.0d;
                        CalSubPage.this.cr4 = 0.0d;
                        CalSubPage.this.cr5 = 0.0d;
                        CalSubPage.this.cr6 = 0.0d;
                        CalSubPage.this.cr7 = 0.0d;
                        CalSubPage.this.cr8 = 0.0d;
                        CalSubPage.this.s1 = Double.parseDouble(CalSubPage.this.sValue_1.getText().toString());
                        CalSubPage.this.s2 = Double.parseDouble(CalSubPage.this.sValue_2.getText().toString());
                        CalSubPage.this.s3 = 0.0d;
                        CalSubPage.this.s4 = 0.0d;
                        CalSubPage.this.s5 = 0.0d;
                        CalSubPage.this.s6 = 0.0d;
                        CalSubPage.this.s7 = 0.0d;
                        CalSubPage.this.s8 = 0.0d;
                    } else if (CalSubPage.this.nCourses.equals("3")) {
                        CalSubPage.this.cr1 = Double.parseDouble(CalSubPage.this.credit_1.getSelectedItem().toString());
                        CalSubPage.this.cr2 = Double.parseDouble(CalSubPage.this.credit_2.getSelectedItem().toString());
                        CalSubPage.this.cr3 = Double.parseDouble(CalSubPage.this.credit_3.getSelectedItem().toString());
                        CalSubPage.this.cr4 = 0.0d;
                        CalSubPage.this.cr5 = 0.0d;
                        CalSubPage.this.cr6 = 0.0d;
                        CalSubPage.this.cr7 = 0.0d;
                        CalSubPage.this.cr8 = 0.0d;
                        CalSubPage.this.s1 = Double.parseDouble(CalSubPage.this.sValue_1.getText().toString());
                        CalSubPage.this.s2 = Double.parseDouble(CalSubPage.this.sValue_2.getText().toString());
                        CalSubPage.this.s3 = Double.parseDouble(CalSubPage.this.sValue_3.getText().toString());
                        CalSubPage.this.s4 = 0.0d;
                        CalSubPage.this.s5 = 0.0d;
                        CalSubPage.this.s6 = 0.0d;
                        CalSubPage.this.s7 = 0.0d;
                        CalSubPage.this.s8 = 0.0d;
                    } else if (CalSubPage.this.nCourses.equals("4")) {
                        CalSubPage.this.cr1 = Double.parseDouble(CalSubPage.this.credit_1.getSelectedItem().toString());
                        CalSubPage.this.cr2 = Double.parseDouble(CalSubPage.this.credit_2.getSelectedItem().toString());
                        CalSubPage.this.cr3 = Double.parseDouble(CalSubPage.this.credit_3.getSelectedItem().toString());
                        CalSubPage.this.cr4 = Double.parseDouble(CalSubPage.this.credit_4.getSelectedItem().toString());
                        CalSubPage.this.cr5 = 0.0d;
                        CalSubPage.this.cr6 = 0.0d;
                        CalSubPage.this.cr7 = 0.0d;
                        CalSubPage.this.cr8 = 0.0d;
                        CalSubPage.this.s1 = Double.parseDouble(CalSubPage.this.sValue_1.getText().toString());
                        CalSubPage.this.s2 = Double.parseDouble(CalSubPage.this.sValue_2.getText().toString());
                        CalSubPage.this.s3 = Double.parseDouble(CalSubPage.this.sValue_3.getText().toString());
                        CalSubPage.this.s4 = Double.parseDouble(CalSubPage.this.sValue_4.getText().toString());
                        CalSubPage.this.s5 = 0.0d;
                        CalSubPage.this.s6 = 0.0d;
                        CalSubPage.this.s7 = 0.0d;
                        CalSubPage.this.s8 = 0.0d;

                    } else if (CalSubPage.this.nCourses.equals("5")) {
                        CalSubPage.this.cr1 = Double.parseDouble(CalSubPage.this.credit_1.getSelectedItem().toString());
                        CalSubPage.this.cr2 = Double.parseDouble(CalSubPage.this.credit_2.getSelectedItem().toString());
                        CalSubPage.this.cr3 = Double.parseDouble(CalSubPage.this.credit_3.getSelectedItem().toString());
                        CalSubPage.this.cr4 = Double.parseDouble(CalSubPage.this.credit_4.getSelectedItem().toString());
                        CalSubPage.this.cr5 = Double.parseDouble(CalSubPage.this.credit_5.getSelectedItem().toString());
                        CalSubPage.this.cr6 = 0.0d;
                        CalSubPage.this.cr7 = 0.0d;
                        CalSubPage.this.cr8 = 0.0d;

                        CalSubPage.this.s1 = Double.parseDouble(CalSubPage.this.sValue_1.getText().toString());
                        CalSubPage.this.s2 = Double.parseDouble(CalSubPage.this.sValue_2.getText().toString());
                        CalSubPage.this.s3 = Double.parseDouble(CalSubPage.this.sValue_3.getText().toString());
                        CalSubPage.this.s4 = Double.parseDouble(CalSubPage.this.sValue_4.getText().toString());
                        CalSubPage.this.s5 = Double.parseDouble(CalSubPage.this.sValue_5.getText().toString());
                        CalSubPage.this.s6 = 0.0d;
                        CalSubPage.this.s7 = 0.0d;
                        CalSubPage.this.s8 = 0.0d;

                    } else if (CalSubPage.this.nCourses.equals("6")) {
                        CalSubPage.this.cr1 = Double.parseDouble(CalSubPage.this.credit_1.getSelectedItem().toString());
                        CalSubPage.this.cr2 = Double.parseDouble(CalSubPage.this.credit_2.getSelectedItem().toString());
                        CalSubPage.this.cr3 = Double.parseDouble(CalSubPage.this.credit_3.getSelectedItem().toString());
                        CalSubPage.this.cr4 = Double.parseDouble(CalSubPage.this.credit_4.getSelectedItem().toString());
                        CalSubPage.this.cr5 = Double.parseDouble(CalSubPage.this.credit_5.getSelectedItem().toString());
                        CalSubPage.this.cr6 = Double.parseDouble(CalSubPage.this.credit_6.getSelectedItem().toString());
                        CalSubPage.this.cr7 = 0.0d;
                        CalSubPage.this.cr8 = 0.0d;
                        CalSubPage.this.s1 = Double.parseDouble(CalSubPage.this.sValue_1.getText().toString());
                        CalSubPage.this.s2 = Double.parseDouble(CalSubPage.this.sValue_2.getText().toString());
                        CalSubPage.this.s3 = Double.parseDouble(CalSubPage.this.sValue_3.getText().toString());
                        CalSubPage.this.s4 = Double.parseDouble(CalSubPage.this.sValue_4.getText().toString());
                        CalSubPage.this.s5 = Double.parseDouble(CalSubPage.this.sValue_5.getText().toString());
                        CalSubPage.this.s6 = Double.parseDouble(CalSubPage.this.sValue_6.getText().toString());
                        CalSubPage.this.s7 = 0.0d;
                        CalSubPage.this.s8 = 0.0d;
                    } else if (CalSubPage.this.nCourses.equals("7")) {
                        CalSubPage.this.cr1 = Double.parseDouble(CalSubPage.this.credit_1.getSelectedItem().toString());
                        CalSubPage.this.cr2 = Double.parseDouble(CalSubPage.this.credit_2.getSelectedItem().toString());
                        CalSubPage.this.cr3 = Double.parseDouble(CalSubPage.this.credit_3.getSelectedItem().toString());
                   /*     CalSubPage.this.cr4 = Double.parseDouble(CalSubPage.this.credit_4.getSelectedItem().toString());
                        CalSubPage.this.cr5 = Double.parseDouble(CalSubPage.this.credit_5.getSelectedItem().toString());
                        CalSubPage.this.cr6 = Double.parseDouble(CalSubPage.this.credit_6.getSelectedItem().toString());
                        CalSubPage.this.cr7 = Double.parseDouble(CalSubPage.this.credit_7.getSelectedItem().toString());
                        CalSubPage.this.cr8 = 0.0d;*/
                        CalSubPage.this.s1 = Double.parseDouble(CalSubPage.this.sValue_1.getText().toString());
                        CalSubPage.this.s2 = Double.parseDouble(CalSubPage.this.sValue_2.getText().toString());
                        CalSubPage.this.s3 = Double.parseDouble(CalSubPage.this.sValue_3.getText().toString());
                     /*   CalSubPage.this.s4 = Double.parseDouble(CalSubPage.this.sValue_4.getText().toString());
                        CalSubPage.this.s5 = Double.parseDouble(CalSubPage.this.sValue_5.getText().toString());
                        CalSubPage.this.s6 = Double.parseDouble(CalSubPage.this.sValue_6.getText().toString());
                        CalSubPage.this.s7 = Double.parseDouble(CalSubPage.this.sValue_7.getText().toString());
                        CalSubPage.this.s8 = 0.0d;*/
                    } else if (CalSubPage.this.nCourses.equals("8")) {
                        CalSubPage.this.cr1 = Double.parseDouble(CalSubPage.this.credit_1.getSelectedItem().toString());
                        CalSubPage.this.cr2 = Double.parseDouble(CalSubPage.this.credit_2.getSelectedItem().toString());
                        CalSubPage.this.cr3 = Double.parseDouble(CalSubPage.this.credit_3.getSelectedItem().toString());
                        CalSubPage.this.cr4 = Double.parseDouble(CalSubPage.this.credit_4.getSelectedItem().toString());
                        CalSubPage.this.cr5 = Double.parseDouble(CalSubPage.this.credit_5.getSelectedItem().toString());
                        CalSubPage.this.cr6 = Double.parseDouble(CalSubPage.this.credit_6.getSelectedItem().toString());
                        CalSubPage.this.cr7 = Double.parseDouble(CalSubPage.this.credit_7.getSelectedItem().toString());
                        CalSubPage.this.cr8 = Double.parseDouble(CalSubPage.this.credit_8.getSelectedItem().toString());
                        CalSubPage.this.s1 = Double.parseDouble(CalSubPage.this.sValue_1.getText().toString());
                        CalSubPage.this.s2 = Double.parseDouble(CalSubPage.this.sValue_2.getText().toString());
                        CalSubPage.this.s3 = Double.parseDouble(CalSubPage.this.sValue_3.getText().toString());
                        CalSubPage.this.s4 = Double.parseDouble(CalSubPage.this.sValue_4.getText().toString());
                        CalSubPage.this.s5 = Double.parseDouble(CalSubPage.this.sValue_5.getText().toString());
                        CalSubPage.this.s6 = Double.parseDouble(CalSubPage.this.sValue_6.getText().toString());
                        CalSubPage.this.s7 = Double.parseDouble(CalSubPage.this.sValue_7.getText().toString());
                        CalSubPage.this.s8 = Double.parseDouble(CalSubPage.this.sValue_8.getText().toString());
                    }
                } catch (RuntimeException e) {
                    alert.setTitle("Fill the Empty Fields");
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            CalSubPage.this.result.setText("");
                            CalSubPage.this.flag = true;
                        }
                    });
                    alert.show();
                }
                if (CalSubPage.this.flag) {
                    CalSubPage.this.flag = false;
                    return;
                }
                CalSubPage.this.gPoint = ((((((((CalSubPage.this.cr1 * CalSubPage.this.s1) + (CalSubPage.this.cr2 * CalSubPage.this.s2)) + (CalSubPage.this.cr3 * CalSubPage.this.s3)) + (CalSubPage.this.cr4 * CalSubPage.this.s4)) + (CalSubPage.this.cr5 * CalSubPage.this.s5)) + (CalSubPage.this.cr6 * CalSubPage.this.s6)) + (CalSubPage.this.cr7 * CalSubPage.this.s7)) + (CalSubPage.this.cr8 * CalSubPage.this.s8));
                CalSubPage.this.tCredit = (((((((CalSubPage.this.cr1 + CalSubPage.this.cr2) + CalSubPage.this.cr3) + CalSubPage.this.cr4) + CalSubPage.this.cr5) + CalSubPage.this.cr6) + CalSubPage.this.cr7) + CalSubPage.this.cr8);
                CalSubPage.this.r = CalSubPage.this.gPoint / CalSubPage.this.tCredit;
                alert1.setMessage("You Got " + CalSubPage.this.r + " SGPA");
                alert1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        result.setText(new DecimalFormat("##.##").format(r));
                    }
                });
                alert1.show();
            }
        });
    }

    private void addListenerOnButton() {
        //this.nCourses = getIntent().getExtras().getString("data");
        tv = (TextView) findViewById(R.id.tv);
        tv.setText(getIntent().getStringExtra("data"));
        nCourses = String.valueOf(tv.getText().toString());

        if (this.nCourses.equals("1")) {

            this.credit_1.setVisibility(View.VISIBLE);
            this.grade_1.setVisibility(View.VISIBLE);
            this.sValue_1.setVisibility(View.VISIBLE);
            this.sValue_1.setEnabled(false);

            this.credit_2.setVisibility(View.INVISIBLE);
            this.grade_2.setVisibility(View.INVISIBLE);
            this.sValue_2.setVisibility(View.INVISIBLE);

            this.credit_3.setVisibility(View.INVISIBLE);
            this.grade_3.setVisibility(View.INVISIBLE);
            this.sValue_3.setVisibility(View.INVISIBLE);

            this.credit_4.setVisibility(View.INVISIBLE);
            this.grade_4.setVisibility(View.INVISIBLE);
            this.sValue_4.setVisibility(View.INVISIBLE);

            this.credit_5.setVisibility(View.INVISIBLE);
            this.grade_5.setVisibility(View.INVISIBLE);
            this.sValue_5.setVisibility(View.INVISIBLE);

            this.credit_6.setVisibility(View.INVISIBLE);
            this.grade_6.setVisibility(View.INVISIBLE);
            this.sValue_6.setVisibility(View.INVISIBLE);

            this.credit_7.setVisibility(View.INVISIBLE);
            this.grade_7.setVisibility(View.INVISIBLE);
            this.sValue_7.setVisibility(View.INVISIBLE);

            this.credit_8.setVisibility(View.INVISIBLE);
            this.grade_8.setVisibility(View.INVISIBLE);
            this.sValue_8.setVisibility(View.INVISIBLE);


        } else if (this.nCourses.equals("2")) {
            this.credit_1.setVisibility(View.VISIBLE);
            this.grade_1.setVisibility(View.VISIBLE);
            this.sValue_1.setVisibility(View.VISIBLE);
            this.sValue_1.setEnabled(false);

            this.credit_2.setVisibility(View.VISIBLE);
            this.grade_2.setVisibility(View.VISIBLE);
            this.sValue_2.setVisibility(View.VISIBLE);
            this.sValue_2.setEnabled(false);

            this.credit_3.setVisibility(View.INVISIBLE);
            this.grade_3.setVisibility(View.INVISIBLE);
            this.sValue_3.setVisibility(View.INVISIBLE);

            this.credit_4.setVisibility(View.INVISIBLE);
            this.grade_4.setVisibility(View.INVISIBLE);
            this.sValue_4.setVisibility(View.INVISIBLE);

            this.credit_5.setVisibility(View.INVISIBLE);
            this.grade_5.setVisibility(View.INVISIBLE);
            this.sValue_5.setVisibility(View.INVISIBLE);

            this.credit_6.setVisibility(View.INVISIBLE);
            this.grade_6.setVisibility(View.INVISIBLE);
            this.sValue_6.setVisibility(View.INVISIBLE);

            this.credit_7.setVisibility(View.INVISIBLE);
            this.grade_7.setVisibility(View.INVISIBLE);
            this.sValue_7.setVisibility(View.INVISIBLE);

            this.credit_8.setVisibility(View.INVISIBLE);
            this.grade_8.setVisibility(View.INVISIBLE);
            this.sValue_8.setVisibility(View.INVISIBLE);

        } else if (this.nCourses.equals("3")) {
            this.credit_1.setVisibility(View.VISIBLE);
            this.grade_1.setVisibility(View.VISIBLE);
            this.sValue_1.setVisibility(View.VISIBLE);
            this.sValue_1.setEnabled(false);

            this.credit_2.setVisibility(View.VISIBLE);
            this.grade_2.setVisibility(View.VISIBLE);
            this.sValue_2.setVisibility(View.VISIBLE);
            this.sValue_2.setEnabled(false);

            this.credit_3.setVisibility(View.VISIBLE);
            this.grade_3.setVisibility(View.VISIBLE);
            this.sValue_3.setVisibility(View.VISIBLE);
            this.sValue_3.setEnabled(false);

            this.credit_4.setVisibility(View.INVISIBLE);
            this.grade_4.setVisibility(View.INVISIBLE);
            this.sValue_4.setVisibility(View.INVISIBLE);

            this.credit_5.setVisibility(View.INVISIBLE);
            this.grade_5.setVisibility(View.INVISIBLE);
            this.sValue_5.setVisibility(View.INVISIBLE);

            this.credit_6.setVisibility(View.INVISIBLE);
            this.grade_6.setVisibility(View.INVISIBLE);
            this.sValue_6.setVisibility(View.INVISIBLE);

            this.credit_7.setVisibility(View.INVISIBLE);
            this.grade_7.setVisibility(View.INVISIBLE);
            this.sValue_7.setVisibility(View.INVISIBLE);

            this.credit_8.setVisibility(View.INVISIBLE);
            this.grade_8.setVisibility(View.INVISIBLE);
            this.sValue_8.setVisibility(View.INVISIBLE);


        } else if (this.nCourses.equals("4")) {
            this.credit_1.setVisibility(View.VISIBLE);
            this.grade_1.setVisibility(View.VISIBLE);
            this.sValue_1.setVisibility(View.VISIBLE);
            this.sValue_1.setEnabled(false);

            this.credit_2.setVisibility(View.VISIBLE);
            this.grade_2.setVisibility(View.VISIBLE);
            this.sValue_2.setVisibility(View.VISIBLE);
            this.sValue_2.setEnabled(false);

            this.credit_3.setVisibility(View.VISIBLE);
            this.grade_3.setVisibility(View.VISIBLE);
            this.sValue_3.setVisibility(View.VISIBLE);
            this.sValue_3.setEnabled(false);

            this.credit_4.setVisibility(View.VISIBLE);
            this.grade_4.setVisibility(View.VISIBLE);
            this.sValue_4.setVisibility(View.VISIBLE);
            this.sValue_4.setEnabled(false);

            this.credit_5.setVisibility(View.INVISIBLE);
            this.grade_5.setVisibility(View.INVISIBLE);
            this.sValue_5.setVisibility(View.INVISIBLE);

            this.credit_6.setVisibility(View.INVISIBLE);
            this.grade_6.setVisibility(View.INVISIBLE);
            this.sValue_6.setVisibility(View.INVISIBLE);

            this.credit_7.setVisibility(View.INVISIBLE);
            this.grade_7.setVisibility(View.INVISIBLE);
            this.sValue_7.setVisibility(View.INVISIBLE);

            this.credit_8.setVisibility(View.INVISIBLE);
            this.grade_8.setVisibility(View.INVISIBLE);
            this.sValue_8.setVisibility(View.INVISIBLE);


        } else if (this.nCourses.equals("5")) {
            this.credit_1.setVisibility(View.VISIBLE);
            this.grade_1.setVisibility(View.VISIBLE);
            this.sValue_1.setVisibility(View.VISIBLE);
            this.sValue_1.setEnabled(false);

            this.credit_2.setVisibility(View.VISIBLE);
            this.grade_2.setVisibility(View.VISIBLE);
            this.sValue_2.setVisibility(View.VISIBLE);
            this.sValue_2.setEnabled(false);

            this.credit_3.setVisibility(View.VISIBLE);
            this.grade_3.setVisibility(View.VISIBLE);
            this.sValue_3.setVisibility(View.VISIBLE);
            this.sValue_3.setEnabled(false);

            this.credit_4.setVisibility(View.VISIBLE);
            this.grade_4.setVisibility(View.VISIBLE);
            this.sValue_4.setVisibility(View.VISIBLE);
            this.sValue_4.setEnabled(false);

            this.credit_5.setVisibility(View.VISIBLE);
            this.grade_5.setVisibility(View.VISIBLE);
            this.sValue_5.setVisibility(View.VISIBLE);
            this.sValue_5.setEnabled(false);

            this.credit_6.setVisibility(View.INVISIBLE);
            this.grade_6.setVisibility(View.INVISIBLE);
            this.sValue_6.setVisibility(View.INVISIBLE);

            this.credit_7.setVisibility(View.INVISIBLE);
            this.grade_7.setVisibility(View.INVISIBLE);
            this.sValue_7.setVisibility(View.INVISIBLE);

            this.credit_8.setVisibility(View.INVISIBLE);
            this.grade_8.setVisibility(View.INVISIBLE);
            this.sValue_8.setVisibility(View.INVISIBLE);


        } else if (this.nCourses.equals("6")) {
            this.credit_1.setVisibility(View.VISIBLE);
            this.grade_1.setVisibility(View.VISIBLE);
            this.sValue_1.setVisibility(View.VISIBLE);
            this.sValue_1.setEnabled(false);

            this.credit_2.setVisibility(View.VISIBLE);
            this.grade_2.setVisibility(View.VISIBLE);
            this.sValue_2.setVisibility(View.VISIBLE);
            this.sValue_2.setEnabled(false);

            this.credit_3.setVisibility(View.VISIBLE);
            this.grade_3.setVisibility(View.VISIBLE);
            this.sValue_3.setVisibility(View.VISIBLE);
            this.sValue_3.setEnabled(false);

            this.credit_4.setVisibility(View.VISIBLE);
            this.grade_4.setVisibility(View.VISIBLE);
            this.sValue_4.setVisibility(View.VISIBLE);
            this.sValue_4.setEnabled(false);

            this.credit_5.setVisibility(View.VISIBLE);
            this.grade_5.setVisibility(View.VISIBLE);
            this.sValue_5.setVisibility(View.VISIBLE);
            this.sValue_5.setEnabled(false);

            this.credit_6.setVisibility(View.VISIBLE);
            this.grade_6.setVisibility(View.VISIBLE);
            this.sValue_6.setVisibility(View.VISIBLE);
            this.sValue_6.setEnabled(false);

            this.credit_7.setVisibility(View.INVISIBLE);
            this.grade_7.setVisibility(View.INVISIBLE);
            this.sValue_7.setVisibility(View.INVISIBLE);

            this.credit_8.setVisibility(View.INVISIBLE);
            this.grade_8.setVisibility(View.INVISIBLE);
            this.sValue_8.setVisibility(View.INVISIBLE);


        } else if (this.nCourses.equals("7")) {
            this.credit_1.setVisibility(View.VISIBLE);
            this.grade_1.setVisibility(View.VISIBLE);
            this.sValue_1.setVisibility(View.VISIBLE);
            this.sValue_1.setEnabled(false);

            this.credit_2.setVisibility(View.VISIBLE);
            this.grade_2.setVisibility(View.VISIBLE);
            this.sValue_2.setVisibility(View.VISIBLE);
            this.sValue_2.setEnabled(false);

            this.credit_3.setVisibility(View.VISIBLE);
            this.grade_3.setVisibility(View.VISIBLE);
            this.sValue_3.setVisibility(View.VISIBLE);
            this.sValue_3.setEnabled(false);

            this.credit_4.setVisibility(View.VISIBLE);
            this.grade_4.setVisibility(View.VISIBLE);
            this.sValue_4.setVisibility(View.VISIBLE);
            this.sValue_4.setEnabled(false);

            this.credit_5.setVisibility(View.VISIBLE);
            this.grade_5.setVisibility(View.VISIBLE);
            this.sValue_5.setVisibility(View.VISIBLE);
            this.sValue_5.setEnabled(false);

            this.credit_6.setVisibility(View.VISIBLE);
            this.grade_6.setVisibility(View.VISIBLE);
            this.sValue_6.setVisibility(View.VISIBLE);
            this.sValue_6.setEnabled(false);

            this.credit_7.setVisibility(View.VISIBLE);
            this.grade_7.setVisibility(View.VISIBLE);
            this.sValue_7.setVisibility(View.VISIBLE);
            this.sValue_7.setEnabled(false);

            this.credit_8.setVisibility(View.INVISIBLE);
            this.grade_8.setVisibility(View.INVISIBLE);
            this.sValue_8.setVisibility(View.INVISIBLE);


        } else if (this.nCourses.equals("8")) {
            this.credit_1.setVisibility(View.VISIBLE);
            this.grade_1.setVisibility(View.VISIBLE);
            this.sValue_1.setVisibility(View.VISIBLE);
            this.sValue_1.setEnabled(false);

            this.credit_2.setVisibility(View.VISIBLE);
            this.grade_2.setVisibility(View.VISIBLE);
            this.sValue_2.setVisibility(View.VISIBLE);
            this.sValue_2.setEnabled(false);

            this.credit_3.setVisibility(View.VISIBLE);
            this.grade_3.setVisibility(View.VISIBLE);
            this.sValue_3.setVisibility(View.VISIBLE);
            this.sValue_3.setEnabled(false);

            this.credit_4.setVisibility(View.VISIBLE);
            this.grade_4.setVisibility(View.VISIBLE);
            this.sValue_4.setEnabled(false);
            this.sValue_4.setVisibility(View.VISIBLE);

            this.credit_5.setVisibility(View.VISIBLE);
            this.grade_5.setVisibility(View.VISIBLE);
            this.sValue_5.setVisibility(View.VISIBLE);
            this.sValue_5.setEnabled(false);

            this.credit_6.setVisibility(View.VISIBLE);
            this.grade_6.setVisibility(View.VISIBLE);
            this.sValue_6.setVisibility(View.VISIBLE);
            this.sValue_6.setEnabled(false);

            this.credit_7.setVisibility(View.VISIBLE);
            this.grade_7.setVisibility(View.VISIBLE);
            this.sValue_7.setVisibility(View.VISIBLE);
            this.sValue_7.setEnabled(false);

            this.credit_8.setVisibility(View.VISIBLE);
            this.grade_8.setVisibility(View.VISIBLE);
            this.sValue_8.setVisibility(View.VISIBLE);
            this.sValue_8.setEnabled(false);


        }
    }

    public void addListenerOnSpinnerItemSelection() {
        this.grade_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String temp = arg0.getItemAtPosition(arg2).toString();
                if (temp.equals("A+ or 4.0")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("4.0");
                } else if (temp.equals("A or 3.75")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("3.75");
                } else if (temp.equals("A- or 3.50")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("3.5");
                } else if (temp.equals("B+ or 3.25")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("3.25");
                } else if (temp.equals("B or 3.0")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("3.0");
                } else if (temp.equals("B- or 2.75")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("2.75");
                } else if (temp.equals("C+ or 2.50")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("2.5");
                } else if (temp.equals("C or 2.25")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("2.25");
                } else if (temp.equals("C- or 2.0")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("2.0");
                } else if (temp.equals("F")) {
                    CalSubPage.this.sValue_1.setEnabled(true);
                    CalSubPage.this.sValue_1.setText("0");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.grade_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String temp = arg0.getItemAtPosition(arg2).toString();
                if (temp.equals("A+ or 4.0")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("4.0");
                } else if (temp.equals("A or 3.75")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("3.75");
                } else if (temp.equals("A- or 3.50")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("3.5");
                } else if (temp.equals("B+ or 3.25")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("3.25");
                } else if (temp.equals("B or 3.0")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("3.0");
                } else if (temp.equals("B- or 2.75")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("2.75");
                } else if (temp.equals("C+ or 2.50")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("2.5");
                } else if (temp.equals("C or 2.25")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("2.25");
                } else if (temp.equals("C- or 2.0")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("2.0");
                } else if (temp.equals("F")) {
                    CalSubPage.this.sValue_2.setEnabled(true);
                    CalSubPage.this.sValue_2.setText("0");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.grade_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String temp = arg0.getItemAtPosition(arg2).toString();
                if (temp.equals("A+ or 4.0")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("4.0");
                } else if (temp.equals("A or 3.75")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("3.75");
                } else if (temp.equals("A- or 3.50")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("3.5");
                } else if (temp.equals("B+ or 3.25")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("3.25");
                } else if (temp.equals("B or 3.0")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("3.0");
                } else if (temp.equals("B- or 2.75")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("2.75");
                } else if (temp.equals("C+ or 2.50")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("2.5");
                } else if (temp.equals("C or 2.25")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("2.25");
                } else if (temp.equals("C- or 2.0")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("2.0");
                } else if (temp.equals("F")) {
                    CalSubPage.this.sValue_3.setEnabled(true);
                    CalSubPage.this.sValue_3.setText("0");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.grade_4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String temp = arg0.getItemAtPosition(arg2).toString();
                if (temp.equals("A+ or 4.0")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("4.0");
                } else if (temp.equals("A or 3.75")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("3.75");
                } else if (temp.equals("A- or 3.50")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("3.5");
                } else if (temp.equals("B+ or 3.25")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("3.25");
                } else if (temp.equals("B or 3.0")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("3.0");
                } else if (temp.equals("B- or 2.75")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("2.75");
                } else if (temp.equals("C+ or 2.50")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("2.5");
                } else if (temp.equals("C or 2.25")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("2.25");
                } else if (temp.equals("C- or 2.0")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("2.0");
                } else if (temp.equals("F")) {
                    CalSubPage.this.sValue_4.setEnabled(true);
                    CalSubPage.this.sValue_4.setText("0");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.grade_5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String temp = arg0.getItemAtPosition(arg2).toString();
                if (temp.equals("A+ or 4.0")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("4.0");
                } else if (temp.equals("A or 3.75")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("3.75");
                } else if (temp.equals("A- or 3.50")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("3.5");
                } else if (temp.equals("B+ or 3.25")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("3.25");
                } else if (temp.equals("B or 3.0")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("3.0");
                } else if (temp.equals("B- or 2.75")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("2.75");
                } else if (temp.equals("C+ or 2.50")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("2.5");
                } else if (temp.equals("C or 2.25")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("2.25");
                } else if (temp.equals("C- or 2.0")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("2.0");
                } else if (temp.equals("F")) {
                    CalSubPage.this.sValue_5.setEnabled(true);
                    CalSubPage.this.sValue_5.setText("0");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.grade_6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String temp = arg0.getItemAtPosition(arg2).toString();
                if (temp.equals("A+ or 4.0")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("4.0");
                } else if (temp.equals("A or 3.75")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("3.75");
                } else if (temp.equals("A- or 3.50")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("3.5");
                } else if (temp.equals("B+ or 3.25")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("3.25");
                } else if (temp.equals("B or 3.0")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("3.0");
                } else if (temp.equals("B- or 2.75")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("2.75");
                } else if (temp.equals("C+ or 2.50")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("2.5");
                } else if (temp.equals("C or 2.25")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("2.25");
                } else if (temp.equals("C- or 2.0")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("2.0");
                } else if (temp.equals("F")) {
                    CalSubPage.this.sValue_6.setEnabled(true);
                    CalSubPage.this.sValue_6.setText("0");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.grade_7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String temp = arg0.getItemAtPosition(arg2).toString();
                if (temp.equals("A+ or 4.0")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("4.0");
                } else if (temp.equals("A or 3.75")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("3.75");
                } else if (temp.equals("A- or 3.50")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("3.5");
                } else if (temp.equals("B+ or 3.25")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("3.25");
                } else if (temp.equals("B or 3.0")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("3.0");
                } else if (temp.equals("B- or 2.75")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("2.75");
                } else if (temp.equals("C+ or 2.50")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("2.5");
                } else if (temp.equals("C or 2.25")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("2.25");
                } else if (temp.equals("C- or 2.0")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("2.0");
                } else if (temp.equals("F")) {
                    CalSubPage.this.sValue_7.setEnabled(true);
                    CalSubPage.this.sValue_7.setText("0");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.grade_8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String temp = arg0.getItemAtPosition(arg2).toString();
                if (temp.equals("A+ or 4.0")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("4.0");
                } else if (temp.equals("A or 3.75")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("3.75");
                } else if (temp.equals("A- or 3.50")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("3.5");
                } else if (temp.equals("B+ or 3.25")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("3.25");
                } else if (temp.equals("B or 3.0")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("3.0");
                } else if (temp.equals("B- or 2.75")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("2.75");
                } else if (temp.equals("C+ or 2.50")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("2.5");
                } else if (temp.equals("C or 2.25")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("2.25");
                } else if (temp.equals("C- or 2.0")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("2.0");
                } else if (temp.equals("F")) {
                    CalSubPage.this.sValue_8.setEnabled(true);
                    CalSubPage.this.sValue_8.setText("0");
                }
            }



            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void creation() {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().addFlags(128);
        int width = getWindowManager().getDefaultDisplay().getWidth();
        if (width >= 300) {
            setContentView(R.layout.activity_cal_sub_page);
        }
        //this.mp = MediaPlayer.create(this, R.raw.btsound);
        this.sValue_1 = (EditText) findViewById(R.id.edTx1);
        this.sValue_2 = (EditText) findViewById(R.id.edTx2);
        this.sValue_3 = (EditText) findViewById(R.id.edTx3);
        this.sValue_4 = (EditText) findViewById(R.id.edTx4);
        this.sValue_5 = (EditText) findViewById(R.id.edTx5);
        this.sValue_6 = (EditText) findViewById(R.id.edTx6);
        this.sValue_7 = (EditText) findViewById(R.id.edTx7);
        this.sValue_8 = (EditText) findViewById(R.id.edTx8);

        this.credit_1 = (Spinner) findViewById(R.id.spinner2);
        this.credit_2 = (Spinner) findViewById(R.id.spinner4);
        this.credit_3 = (Spinner) findViewById(R.id.spinner6);
        this.credit_4 = (Spinner) findViewById(R.id.spinner8);
        this.credit_5 = (Spinner) findViewById(R.id.spinner10);
        this.credit_6 = (Spinner) findViewById(R.id.spinner12);
        this.credit_7 = (Spinner) findViewById(R.id.spinner14);
        this.credit_8 = (Spinner) findViewById(R.id.spinner16);

        this.grade_1 = (Spinner) findViewById(R.id.spinner3);
        this.grade_2 = (Spinner) findViewById(R.id.spinner5);
        this.grade_3 = (Spinner) findViewById(R.id.spinner7);
        this.grade_4 = (Spinner) findViewById(R.id.spinner9);
        this.grade_5 = (Spinner) findViewById(R.id.spinner11);
        this.grade_6 = (Spinner) findViewById(R.id.spinner13);
        this.grade_7 = (Spinner) findViewById(R.id.spinner15);
        this.grade_8 = (Spinner) findViewById(R.id.spinner17);


        this.calculate = (Button) findViewById(R.id.calculate);
        this.result = (TextView) findViewById(R.id.result);
        this.back = (ImageView) findViewById(R.id.back);

        this.reset = (Button) findViewById(R.id.reset);
        this.credit_1.setVisibility(View.VISIBLE);
        this.grade_1.setVisibility(View.VISIBLE);
        this.sValue_1.setVisibility(View.VISIBLE);

        this.credit_2.setVisibility(View.VISIBLE);
        this.grade_2.setVisibility(View.VISIBLE);
        this.sValue_2.setVisibility(View.VISIBLE);

        this.credit_3.setVisibility(View.VISIBLE);
        this.grade_3.setVisibility(View.VISIBLE);
        this.sValue_3.setVisibility(View.VISIBLE);

        this.credit_4.setVisibility(View.VISIBLE);
        this.grade_4.setVisibility(View.VISIBLE);
        this.sValue_4.setVisibility(View.VISIBLE);

        this.credit_5.setVisibility(View.VISIBLE);
        this.grade_5.setVisibility(View.VISIBLE);
        this.sValue_5.setVisibility(View.VISIBLE);

        this.credit_6.setVisibility(View.VISIBLE);
        this.grade_6.setVisibility(View.VISIBLE);
        this.sValue_6.setVisibility(View.VISIBLE);

        this.credit_7.setVisibility(View.VISIBLE);
        this.grade_7.setVisibility(View.VISIBLE);
        this.sValue_7.setVisibility(View.VISIBLE);

        this.credit_8.setVisibility(View.VISIBLE);
        this.grade_8.setVisibility(View.VISIBLE);
        this.sValue_8.setVisibility(View.VISIBLE);


    }

}
