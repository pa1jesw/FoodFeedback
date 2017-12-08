package com.pa1.foodfeedback;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgFood;
    RadioButton btPizza,btDosa,btBurger;
    RatingBar rabrew;
    Button btnSubmit;




    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("kya apko sachi me jana h  ?? :-|");
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }
        );


        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });

        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });


        builder.show();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgFood=(RadioGroup)findViewById(R.id.rgFood);
        rabrew=(RatingBar)findViewById(R.id.rabRew);
        btPizza=(RadioButton)findViewById(R.id.rbPizza);
        btBurger=(RadioButton)findViewById(R.id.rbBurger);
        btDosa=(RadioButton)findViewById(R.id.rbDosa);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sel=rgFood.getCheckedRadioButtonId();
                RadioButton rbsel= (RadioButton) findViewById(sel);
                String str1=rbsel.getText().toString();
                String str2=String.valueOf(rabrew.getRating()).toString();
                Toast.makeText(getApplicationContext(),str1+" : "+str2,Toast.LENGTH_SHORT).show();


            }
        });

    }
}
