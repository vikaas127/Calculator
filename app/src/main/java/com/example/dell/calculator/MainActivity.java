package com.example.dell.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private  static double num1=0;
    private static double num2=0;
    private static double rslt=0;

    private Button btn0, btn1,btn2, btn3,btn4,btn5, btn6,btn7, btn8,btn9,btn11, btn12,btn13, btn14,btn15,btn16,btn17;
private TextView txt;
 private  String action="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.button14);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btn12=(Button)findViewById(R.id.button12);
        btn13=(Button)findViewById(R.id.button13);
        btn14=(Button)findViewById(R.id.button10);
        btn15=(Button)findViewById(R.id.button15);
        btn16=(Button)findViewById(R.id.button16);
        btn17=(Button)findViewById(R.id.button17);
        btn11=(Button)findViewById(R.id.button11);
        txt=(TextView)findViewById(R.id.textView);
btn0.setOnClickListener(this);
btn1.setOnClickListener(this);
btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn17.setOnClickListener(this);








    }

    @Override
    public void onClick(View view) {
        if (view==btn0){
            String stg= txt.getText()+(String) btn0.getText();
            txt.setText(stg);
    }else if(view==btn1){
      String stg= txt.getText()+(String) btn1.getText();
      txt.setText(stg);
        }
        else if(view==btn2){ String stg= txt.getText()+(String) btn2.getText();
            txt.setText(stg);}
        else if(view==btn3){ String stg= txt.getText()+(String) btn3.getText();
            txt.setText(stg);}
        else if(view==btn4){ String stg= txt.getText()+(String) btn4.getText();
            txt.setText(stg);}
        else if(view==btn5){ String stg= txt.getText()+(String) btn5.getText();
            txt.setText(stg);}
        else if(view==btn6){ String stg= txt.getText()+(String) btn6.getText();
            txt.setText(stg);}
        else if(view==btn7){ String stg= txt.getText()+(String) btn7.getText();
            txt.setText(stg);}
        else if(view==btn8){ String stg= txt.getText()+(String) btn8.getText();
            txt.setText(stg);}
        else if(view==btn9){ String stg= txt.getText()+(String) btn9.getText();
            txt.setText(stg);
        }
        else if (view==btn11){
            action="+";
            num1=Double.valueOf((String)txt.getText());
            txt.setText("");

        }
        else if(view==btn12){

            action="-";
            num1=Double.valueOf((String)txt.getText());
            txt.setText("");
        }
        else if(view==btn13){
            String stg= txt.getText()+(String) btn13.getText();
            txt.setText(stg);
        }
        else if(view==btn14){

            action="*";
            num1=Double.valueOf((String)txt.getText());

            txt.setText("");


        }
        else if(view==btn15) {
            num2 = (double) Double.valueOf((String) txt.getText());
            switch (action) {
                case "+":
                    rslt =  num1 + num2;
                    break;
                case "-":
                    rslt = num1 - num2;

                    break;
                case "*":
                    rslt =  num1 * num2;

                    break;
                case "/":
                    rslt =  num1 / num2;
                    break;
            }
            txt.setText(Double.toString(rslt));
        }
        else if(view==btn16){

            action="/";
            num1=Double.valueOf((String) txt.getText());
            txt.setText("");
        }
        else if (view==btn17){
            txt.setText("");
        }





}}
