package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    private String result="";

    public void para1(View view){
        result=result+"(";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void para2(View view){
        result=result+")";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void power(View view){
        result=result+"^";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void sqrt(View view){
        result=result+"sqrt(";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void factorial(View view){
        result=result+"!";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void seven(View view){
        result=result+"7";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void eight(View view){
        result=result+"8";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void nine(View view){
        result=result+"9";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void four(View view){
        result=result+"4";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void five(View view){
        result=result+"5";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void six(View view){
        result=result+"6";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void one(View view){
        result=result+"1";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void two(View view){
        result=result+"2";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void three(View view){
        result=result+"3";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void zero(View view){
        result=result+"0";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void plus(View view){
        if(result.length()!=0) {
                result = result + "+";
                TextView dikha = findViewById(R.id.main);
                dikha.setText("" + result);

        }
    }
    public void minus(View view){
        if(result.length()!=0) {
            result = result + "-";
            TextView dikha = findViewById(R.id.main);
            dikha.setText("" + result);
        }
    }
    public void divide(View view){
        if(result.length()!=0) {
            result = result + "/";
            TextView dikha = findViewById(R.id.main);
            dikha.setText("" + result);
        }
    }
    public void multiply(View view){
        if(result.length()!=0) {
            result = result + "*";
            TextView dikha = findViewById(R.id.main);
            dikha.setText("" + result);
        }
    }
    public void point(View view){
        if(result.length()!=0) {
            result = result + ".";
            TextView dikha = findViewById(R.id.main);
            dikha.setText("" + result);
        }
    }
    public void change(View view){
        replaceFragement(new MyCal());
        
    }
    public void clear(View view){
        result="";
        TextView dikha=findViewById(R.id.main);
        dikha.setText(""+result);
    }
    public void equals(View view){
        if(result.length()!=0) {
            TextView loco = findViewById(R.id.main);
            String expression = loco.getText().toString();
            Expression e = new Expression(expression);
            loco.setText("" + String.valueOf(e.calculate()));
            result = "";
        }
        else{
            TextView dikha=findViewById(R.id.main);
            dikha.setText(""+result);
        }
    }
    public void delete(View view){
        if(result.length()!=0) {
            result = result.substring(0, result.length() - 1);
            TextView dikha = findViewById(R.id.main);
            dikha.setText("" + result);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void replaceFragement(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main2,fragment);
        fragmentTransaction.commit();
    }
}
