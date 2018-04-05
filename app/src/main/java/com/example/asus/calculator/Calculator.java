package com.example.asus.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.calculator.R;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    TextView equ, res;
    ImageButton plus, minus, dev, mul, equal, delete;
    Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, dot, clear;
    HorizontalScrollView hsv;
    String Eqn="", Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hsv = findViewById(R.id.hsvId);

        equ = findViewById(R.id.equationId);
        res = findViewById(R.id.resultId);
        plus = findViewById(R.id.plusId);
        minus = findViewById(R.id.minusId);
        mul = findViewById(R.id.mulId);
        dev = findViewById(R.id.devId);
        equal = findViewById(R.id.equalId);
        clear = findViewById(R.id.clearId);
        delete = findViewById(R.id.deleteId);
        num0 = findViewById(R.id.Id0);
        num1 = findViewById(R.id.Id1);
        num2 = findViewById(R.id.Id2);
        num3 = findViewById(R.id.Id3);
        num4 = findViewById(R.id.Id4);
        num5 = findViewById(R.id.Id5);
        num6 = findViewById(R.id.Id6);
        num7 = findViewById(R.id.Id7);
        num8 = findViewById(R.id.Id8);
        num9 = findViewById(R.id.Id9);
        dot = findViewById(R.id.dotId);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mul.setOnClickListener(this);
        dev.setOnClickListener(this);
        clear.setOnClickListener(this);
        delete.setOnClickListener(this);
        equal.setOnClickListener(this);
        dot.setOnClickListener(this);
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
    }

    boolean f=true, ff=true;

    @Override
    public void onClick(View view) {

        hsv.postDelayed(new Runnable() {
            public void run() {
                hsv.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
            }
        }, 10L);

        switch (view.getId()) {
            case R.id.Id0:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '0';
                equ.setText(Eqn);
                break;
            case R.id.Id1:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '1';
                equ.setText(Eqn);
                break;
            case R.id.Id2:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '2';
                equ.setText(Eqn);
                break;
            case R.id.Id3:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '3';
                equ.setText(Eqn);
                break;
            case R.id.Id4:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '4';
                equ.setText(Eqn);
                break;
            case R.id.Id5:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '5';
                equ.setText(Eqn);
                break;
            case R.id.Id6:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '6';
                equ.setText(Eqn);
                break;
            case R.id.Id7:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '7';
                equ.setText(Eqn);
                break;
            case R.id.Id8:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '8';
                equ.setText(Eqn);
                break;
            case R.id.Id9:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '9';
                equ.setText(Eqn);
                break;
            case R.id.dotId:
                if (f==false){
                    f=true;
                    ff=true;
                    Eqn="";
                    res.setText("0");
                }
                Eqn = Eqn + '.';
                equ.setText(Eqn);
                break;
            case R.id.plusId:
                if (ff==false){
                    ff=true;
                    f=true;
                    Eqn="";
                    Result="";
                    res.setText("0");
                }
                else if (f==false){
                    f=true;
                    Eqn=Result;
                    res.setText("0");
                }
                Eqn = Eqn + '+';
                equ.setText(Eqn);
                break;
            case R.id.minusId:
                if (ff==false){
                    ff=true;
                    f=true;
                    Eqn="";
                    Result="";
                    res.setText("0");
                }
                else if (f==false){
                    f=true;
                    Eqn=Result;
                    res.setText("0");
                }
                Eqn = Eqn + '-';
                equ.setText(Eqn);
                break;
            case R.id.mulId:
                if (ff==false){
                    ff=true;
                    f=true;
                    Eqn="";
                    Result="";
                    res.setText("0");
                }
                else if (f==false){
                    f=true;
                    Eqn=Result;
                    res.setText("0");
                }
                Eqn = Eqn + '*';
                equ.setText(Eqn);
                break;
            case R.id.devId:
                if (ff==false){
                    ff=true;
                    f=true;
                    Eqn="";
                    Result="";
                    res.setText("0");
                }
                else if (f==false){
                    f=true;
                    Eqn=Result;
                    res.setText("0");
                }
                Eqn = Eqn + '/';
                equ.setText(Eqn);
                break;
            case R.id.clearId:
                Eqn = "";
                Result = "";
                equ.setText(Eqn);
                res.setText("0");
                break;
            case R.id.deleteId:
                if (f==false){
                    f=true;
                    res.setText("0");
                }
                if(Eqn != "") Eqn = removeChar(Eqn,Eqn.length()-1);
                equ.setText(Eqn);
                break;
            case R.id.equalId:
                if (!Eqn.isEmpty()) Result = solution(Eqn);
                else {
                    ff = false;
                    Result="0";
                }
                res.setText(Result);
                f=false;
                hsv.postDelayed(new Runnable() {
                    public void run() {
                        hsv.fullScroll(HorizontalScrollView.FOCUS_LEFT);
                    }
                }, 40L);
                break;
        }
    }
    public String removeChar(String str, Integer n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }
    public String addSollution(String str, String r, Integer n, Integer m) {
        String front = str.substring(0, n);
        String back = str.substring(m+1, str.length());
        return front + r + back;
    }
    private String findLeftNum(String str, Integer n){
        Integer i;
        for (i=n-1;str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/'&&i>0;i--);
        if (i==0||str.charAt(i)=='+'||str.charAt(i)=='-') i--;
        return str.substring(i+1, n);
    }
    private String findRightNum(String str, Integer n){
        Integer i;
        for (i=n+1;str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/'&&i<str.length()-1;i++);
        if (i==str.length()-1) i++;
        return str.substring(n+1, i);
    }
    private String morePlusMinus(String str){
        for (Integer i=0;i<str.length();i++){
            if (str.charAt(i)=='+'&&i!=str.length()-1){
                if (str.charAt(i+1)=='+'||str.charAt(i+1)=='-'){
                    str = removeChar(str,i);
                    i--;
                }
            }
            else if (str.charAt(i)=='-'&&i!=str.length()-1){
                if (str.charAt(i+1)=='+'||str.charAt(i+1)=='-'){
                    if (str.charAt(i+1)=='+') str = addSollution(str,"-",i,i+1);
                    else str = addSollution(str,"+",i,i+1);
                    i--;
                }
            }
        }
        return str;
    }
    private boolean dotCheaking(String str){
        boolean flag=false;
        for (Integer i=0;i<str.length();i++){
            if (str.charAt(i)=='.'){
                if (!flag) flag=true;
                else return true;
            }
        }
        return false;
    }
    private boolean singleDotCheaking(String str){
        for (Integer i=0;i<str.length();i++){
            if (str.charAt(i)=='.'){
                return true;
            }
        }
        return false;
    }
    private boolean eCheaking(String str){
        for (Integer i=0;i<str.length();i++){
            if (str.charAt(i)=='E'){
                return true;
            }
        }
        return false;
    }
    private  Integer ePosition(String str){
        for (Integer i=0;i<str.length();i++){
            if (str.charAt(i)=='E'){
                return i;
            }
        }
        return 0;
    }
    private String solution(String str){
        String leftNum="", rightNum="", r="";
        for (Integer i=0;i<str.length();i++){
            if ((str.charAt(i) == '*') || (str.charAt(i) == '/')){
                str = morePlusMinus(str);
                if(i!=0&&i!=str.length()-1){
                    if ((i!=str.length()-1)&&((str.charAt(i+1) == '*') || (str.charAt(i+1) == '/'))){
                        ff=false;
                        return "Input Error";
                    }
                    else if (str.charAt(i - 1) == '+' || str.charAt(i - 1) == '-'){
                        ff=false;
                        return "Input Error";
                    }
                    else if ((str.charAt(i+1) == '+') || (str.charAt(i+1) == '-')){
                        if (i==str.length()-2||((str.charAt(i+2) == '*') || (str.charAt(i+2) == '/'))){
                            ff=false;
                            return "Input Error";
                        }
                        leftNum = findLeftNum(str, i);
                        if (str.charAt(i+1) == '+') rightNum = "+" + findRightNum(str, i+1);
                        else rightNum = "-" + findRightNum(str, i+1);
                    }
                    else{
                        leftNum = findLeftNum(str, i);
                        rightNum = findRightNum(str, i);
                    }

                    if (dotCheaking(leftNum) || dotCheaking(rightNum)){
                        ff=false;
                        return "Input Error";
                    }

                    double x = Double.parseDouble(leftNum);
                    double y = Double.parseDouble(rightNum);
                    if (str.charAt(i) == '*') r = Double.toString(x*y);
                    else {
                        if (y==0)
                        {
                            ff=false;
                            return "Indefinite";
                        }
                        else r = Double.toString(x/y);
                    }

                    if (r.charAt(0)!='-') str = addSollution(str,"+"+r,i-leftNum.length(),i+rightNum.length());
                    else str = addSollution(str,r,i-leftNum.length(),i+rightNum.length());
                }
                else{
                    ff=false;
                    return "Input Error";
                }
                i=0;
            }
        }
        for (Integer i=0;i<str.length();i++){
            if ((str.charAt(i) == '+') || (str.charAt(i) == '-')){
                str = morePlusMinus(str);
                if(i!=0&&i!=str.length()-1){
                    if ((str.charAt(i+1) == '+') || (str.charAt(i+1) == '-')){
                        ff=false;
                        return "Input Error";
                    }
                    else {
                        leftNum = findLeftNum(str, i);
                        rightNum = findRightNum(str, i);
                    }

                    if (dotCheaking(leftNum) || dotCheaking(rightNum)){
                        ff=false;
                        return "Input Error";
                    }

                    double x = Double.parseDouble(leftNum);
                    double y = Double.parseDouble(rightNum);
                    if (str.charAt(i) == '+') r = Double.toString(x+y);
                    else r = Double.toString(x-y);

                    if (r.charAt(0)!='-') str = addSollution(str,"+"+r,i-leftNum.length(),i+rightNum.length());
                    else str = addSollution(str,r,i-leftNum.length(),i+rightNum.length());
                }
                else if (i==str.length()-1){
                    ff=false;
                    return "Input Error";
                }
                i=0;
            }
        }

        if (dotCheaking(str)){
            ff=false;
            return "Input Error";
        }  // cheaking if number has more than one dot


        for (;str.length()>1&&str.charAt(0)=='0';str = removeChar(str,0)); //Leading zero remover

        if (str.charAt(0)=='+')  str = removeChar(str,0); // Leading plus sign remover

        if (str.charAt(0)=='.'&&str.length()==1) str = "0"; // add zero before dot
        else if (str.charAt(0)=='.') str = "0"+str;

        if (str.length()>2&&str.charAt(str.length()-1)=='0'&&str.charAt(str.length()-2)=='.'){
            str = removeChar(str,str.length()-1);
            str = removeChar(str,str.length()-1);
        }  // remove .0 from result

        if (singleDotCheaking(str)){
            if (eCheaking(str)){
                Integer p = ePosition(str);
                while (str.charAt(p-1)=='0'){
                    str = removeChar(str,p-1);
                    p--;
                }
                if (str.charAt(p-1)=='.') str = removeChar(str,p-1);
            }
            else{
                Integer p = str.length();
                while (str.charAt(p-1)=='0'){
                    str = removeChar(str,p-1);
                    p--;
                }
            }
        }

        if(str.charAt(str.length()-1)=='.') str = removeChar(str,str.length()-1);

        if(str.length()>10) {

            double x = Double.parseDouble(str);
            str = Double.toString(x*1);

            if (singleDotCheaking(str)){
                if (eCheaking(str)){
                    Integer p = ePosition(str);
                    while (str.length()!=10){
                        str = removeChar(str,p-1);
                        p--;
                    }
                    if (str.charAt(p-1)=='.') str = removeChar(str,p-1);
                }
                else{
                    Integer p = str.length();
                    while (str.length()!=10){
                        str = removeChar(str,p-1);
                        p--;
                    }
                    if (str.charAt(p-1)=='.') str = removeChar(str,p-1);
                }
            }
            return str;
        }
        else return str;
    }
}
