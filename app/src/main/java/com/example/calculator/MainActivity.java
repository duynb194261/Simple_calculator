

//                     Thưa thầy ứng dụng của em bị lỗi vừa vào nhập số rồi nhấn dấu thì nó bị hiển thị trên phép tính thành số 0 nhưng
//                 nhấn C thì nó lại tính được bình thường mà em chưa biết sửa nên thầy có kiểm thử thì nhấn C rồi tính nha thầy 



package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {

    private Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but0;
    private Button butsum, butsub, butmul, butdiv;
    private Button butC, butCE, butDel, butResult;
    private TextView Resultview, Inputview;
    private String input, symbol;
    boolean checkequal=false;
    double num1, num2, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        anhxa();

        butC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inputview.setText("");
                Resultview.setText("");
                input="";
                symbol="";
                checkequal=false;

            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"0");
                }
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"1");
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"2");
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"3");
                }
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"4");
                }
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"5");
                }
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"6");
                }
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"7");
                }
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"8");
                }
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"9");
                }
            }
        });



        butsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(checkequal||symbol!=""){
                        solve();
                        symbol="+";
                        Inputview.setText(answer+"+");
                        num1= answer;
                        checkequal=false;
                    }
                    else if(Resultview.getText()==""){
                        Inputview.setText("");
                    }
                    else{
                        num1= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Resultview.getText().toString()+"+");
                        Resultview.setText("");
                        input="";
                        symbol="+";
                        checkequal=false;
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        butsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(checkequal||symbol!=""){
                        solve();
                        symbol="-";
                        Inputview.setText(answer+"-");
                        num1= answer;
                        checkequal=false;
                    }
                    else if(Resultview.getText()==""){
                        Inputview.setText("");

                    }
                    else{
                        num1= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Resultview.getText().toString()+"-");
                        Resultview.setText("");
                        input="";
                        symbol="-";
                        checkequal=false;
                    }
                }catch (Exception ex){

                }
            }
        });

        butmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(checkequal||symbol!=""){
                        solve();
                        symbol="×";
                        Inputview.setText(answer+"×");
                        num1= answer;
                        checkequal=false;
                    }
                    else if(Resultview.getText()==""){
                        Inputview.setText("");
                    }
                    else{
                        num1= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Resultview.getText().toString()+"×");
                        Resultview.setText("");
                        input="";
                        symbol="×";
                        checkequal=false;
                    }
                }catch (Exception ex){

                }
            }
        });

        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(checkequal||symbol!=""){
                        solve();
                        symbol="×";
                        Inputview.setText(answer+"×");
                        num1= answer;
                        checkequal=false;
                    }
                    else if(Resultview.getText()==""){
                        Inputview.setText("");
                    }
                    else{
                        num1= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Resultview.getText().toString()+"÷");
                        Resultview.setText("");
                        input="";
                        symbol="÷";
                        checkequal=false;
                    }
                }catch (Exception ex){

                }
            }
        });

        butResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    try{
                    input=Resultview.getText().toString();
                    num2= Double.parseDouble(Resultview.getText()+"");
                    Inputview.setText(Inputview.getText().toString()+Resultview.getText().toString()+"");
                    Resultview.setText("");
                    if(symbol=="+")
                        answer=num1+num2;
                    else if(symbol=="-")
                        answer=num1-num2;
                    else if(symbol=="×")
                        answer=num1*num2;
                    else if(symbol=="÷")
                        answer=num1/num2;
                    checkequal=true;
                    Resultview.setText(answer+"");

                }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
                symbol="";
            }
        });

        butCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultview .setText("");
            }
        });

    }

    public void solve(){
        input=Resultview.getText().toString();
        num2= Double.parseDouble(Resultview.getText()+"");
        Resultview.setText("");
        if(symbol=="+")
            answer=num1+num2;
        else if(symbol=="-")
            answer=num1-num2;
        else if(symbol=="×")
            answer=num1*num2;
        else if(symbol=="÷")
            answer=num1/num2;
    }


    public void butdelclick(View view){
        input=Resultview.getText().toString();
        if(input.length()>0){
            String newtext= input.substring(0, input.length()-1);
            input = newtext;
        }
        Resultview.setText(input+"");
    }
    public void anhxa(){
        but0 = findViewById(R.id.butt_0);
        but1 = findViewById(R.id.butt_1);
        but2 = findViewById(R.id.butt_2);
        but3 = findViewById(R.id.butt_3);
        but4 = findViewById(R.id.butt_4);
        but5 = findViewById(R.id.butt_5);
        but6 = findViewById(R.id.butt_6);
        but7 = findViewById(R.id.butt_7);
        but8 = findViewById(R.id.butt_8);
        but9 = findViewById(R.id.butt_9);
        butsum = findViewById(R.id.butt_add);
        butsub = findViewById(R.id.butt_sub);
        butmul = findViewById(R.id.butt_multiply);
        butdiv = findViewById(R.id.butt_divide);
        butC = findViewById(R.id.butt_C);
        butCE = findViewById(R.id.butt_CE);
        butResult = findViewById(R.id.butt_result);
        Inputview = findViewById(R.id.text_operation);
        Resultview = findViewById(R.id.text_result);

    }
}