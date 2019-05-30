package com.example.buttonclickeventsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnOK);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText txtA = findViewById(R.id.txtA);
        EditText txtB = findViewById(R.id.txtB);
        EditText txtC = findViewById(R.id.txtC);
        double a= Double.parseDouble(txtA.getText().toString());
        double b= Double.parseDouble(txtB.getText().toString());
        double c= Double.parseDouble(txtC.getText().toString());
        double r = b*b - 4*a*c;
        r = Math.sqrt(r);

       DecimalFormat formater = new DecimalFormat("0.00");//格式化數字的字串

        TextView lblResult = findViewById(R.id.lblResult);
        lblResult.setText(
               "答案: x=" + formater.format( (-b+r)/(2*a) ) +"或者" +  formater.format( (-b-r)/(2*a) )
       );


    }
}
