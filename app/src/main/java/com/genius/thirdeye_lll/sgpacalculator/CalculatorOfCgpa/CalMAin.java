package com.genius.thirdeye_lll.sgpacalculator.CalculatorOfCgpa;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.genius.thirdeye_lll.sgpacalculator.R;


public class CalMAin extends AppCompatActivity {

    Button btnMain;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_main2);
        //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        sp = (Spinner) findViewById(R.id.spMain);
        btnMain = (Button) findViewById(R.id.btn_enter);



        final Intent i = new Intent(this, CalSubPage.class);
        final Bundle bundle = new Bundle();
        final Builder alert = new Builder(this);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String courses = CalMAin.this.sp.getSelectedItem().toString();
                if(courses.equals("0")){
                    alert.setTitle("Courses Should be Greater than 0");
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    alert.show();
                    return;
                }
               //bundle.putString("data",courses);
                //i.putExtras(bundle);
                i.putExtra("data",courses);
                CalMAin.this.startActivity(i);
            }
        });



    }


}
