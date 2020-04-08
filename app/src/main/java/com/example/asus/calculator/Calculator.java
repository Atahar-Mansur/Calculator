package com.example.asus.calculator;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.calculator.R;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    TextView equ, res;
    Button plus, minus, dev, mul, delete, equal;
    Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, dot, clear;
    Button sin, cos, tan, square, root, brac1st, brac2nd;
    Button degRad;
    HorizontalScrollView hsv;
    String Eqn = "", Result;

    boolean ff = true, degRedFlag = true;  // ff = true if no output error; degRedFlag = true if the number in degree else radian
    Integer bracCounter = 0;

    

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
        sin = findViewById(R.id.sineId);
        cos = findViewById(R.id.cosId);
        tan = findViewById(R.id.tanId);
        square = findViewById(R.id.squareId);
        root = findViewById(R.id.rootId);
        brac1st = findViewById(R.id.brac1stId);
        brac2nd = findViewById(R.id.brac2ndId);
        degRad = findViewById(R.id.degreeRadianId);

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
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        square.setOnClickListener(this);
        root.setOnClickListener(this);
        brac1st.setOnClickListener(this);
        brac2nd.setOnClickListener(this);
        degRad.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        hsv.postDelayed(new Runnable() {
            public void run() {
                hsv.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
            }
        }, 10L);

        switch (view.getId()) {
            case R.id.Id0:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '0';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id1:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '1';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id2:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '2';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id3:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '3';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id4:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '4';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id5:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '5';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id6:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '6';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id7:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '7';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id8:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '8';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.Id9:
                if (!ff) ff=true;
                if(Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') Eqn = Eqn + '9';
                equ.setText(Eqn);

                if (!Eqn.isEmpty()) Result = bracket(Eqn);
                else {
                    ff = false;
                    Result = "0";
                }
                res.setText(Result);
                break;
            case R.id.dotId:
                if (!ff) ff=true;

                boolean df=true;
                for(int i = Eqn.length()-1; i>0 && ((Eqn.charAt(i) >= '0' && Eqn.charAt(i) <= '9') || Eqn.charAt(i) <= '.'); i--){
                    if(Eqn.charAt(i) == '.'){
                        df=false;
                        break;
                    }
                }

                if(Eqn.isEmpty()) Eqn = Eqn + "0.";
                else if(df && Eqn.charAt(Eqn.length()-1) != '\u00B2'){
                    if(Eqn.charAt(Eqn.length()-1) >= '0' && Eqn.charAt(Eqn.length()-1) <= '9') Eqn = Eqn + '.';
                    else Eqn = Eqn + "0.";
                }
                equ.setText(Eqn);
                break;
            case R.id.plusId:
                if(ff) Eqn = Eqn + '+';
                equ.setText(Eqn);
                break;
            case R.id.minusId:
                if(ff) Eqn = Eqn + '-';
                equ.setText(Eqn);
                break;
            case R.id.mulId:
                if(ff && Eqn.length()!=0 && ((Eqn.charAt(Eqn.length()-1) >= '0' && Eqn.charAt(Eqn.length()-1) <= '9') || Eqn.charAt(Eqn.length()-1) == ')')) Eqn = Eqn + '\u00D7';
                equ.setText(Eqn);
                break;
            case R.id.devId:
                if(ff && Eqn.length()!=0 && ((Eqn.charAt(Eqn.length()-1) >= '0' && Eqn.charAt(Eqn.length()-1) <= '9') || Eqn.charAt(Eqn.length()-1) == ')')) Eqn = Eqn + '\u00F7';
                equ.setText(Eqn);
                break;
            case R.id.sineId:
                if(ff && (Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') && (Eqn.length()==0 || !(Eqn.charAt(Eqn.length()-1) >= 'a' && Eqn.charAt(Eqn.length()-1) <= 'z'))){
                    Eqn = Eqn + "sin(";
                    bracCounter++;
                }
                equ.setText(Eqn);
                break;
            case R.id.cosId:
                if(ff && (Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') && (Eqn.length()==0 || !(Eqn.charAt(Eqn.length()-1) >= 'a' && Eqn.charAt(Eqn.length()-1) <= 'z'))){
                    Eqn = Eqn + "cos(";
                    bracCounter++;
                }
                equ.setText(Eqn);
                break;
            case R.id.tanId:
                if(ff && (Eqn.length()==0 || Eqn.charAt(Eqn.length()-1) != '\u00B2') && (Eqn.length()==0 || !(Eqn.charAt(Eqn.length()-1) >= 'a' && Eqn.charAt(Eqn.length()-1) <= 'z'))){
                    Eqn = Eqn + "tan(";
                    bracCounter++;
                }
                equ.setText(Eqn);
                break;
            case R.id.rootId:
                if(!ff) ff=true;
                Eqn = Eqn + '\u221A';
                equ.setText(Eqn);
                break;
            case R.id.squareId:
                if(!ff) ff=true;
                if(Eqn.length()!=0 && ((Eqn.charAt(Eqn.length()-1) >= '0' && Eqn.charAt(Eqn.length()-1) <= '9') || Eqn.charAt(Eqn.length()-1) == '\u00B2' || Eqn.charAt(Eqn.length()-1) == ')')){
                    Eqn = Eqn + '\u00B2';
                    equ.setText(Eqn);

                    if (!Eqn.isEmpty()) Result = bracket(Eqn);
                    else {
                        ff = false;
                        Result = "0";
                    }
                    res.setText(Result);
                }

                break;
            case R.id.clearId:
                ff=true;
                Eqn = "";
                Result = "";
                equ.setText(Eqn);
                res.setText("0");
                res.setTextSize(45);
                res.setPadding(dpToPx(20),dpToPx(20),dpToPx(20),dpToPx(20));
                bracCounter = 0;

                break;
            case R.id.deleteId:
                if (Eqn != "")
                {
                    if(Eqn.charAt(Eqn.length()-1) == '(') bracCounter--;
                    if(Eqn.charAt(Eqn.length()-1) == ')') bracCounter++;

                    if(Eqn.charAt(Eqn.length()-1) >= 'a' && Eqn.charAt(Eqn.length()-1) <= 'z')
                    {
                        Eqn = removeChar(Eqn, Eqn.length() - 1);
                        Eqn = removeChar(Eqn, Eqn.length() - 1);
                        Eqn = removeChar(Eqn, Eqn.length() - 1);
                    }
                    else Eqn = removeChar(Eqn, Eqn.length() - 1);
                }
                equ.setText(Eqn);

                if(!Eqn.isEmpty() && ((Eqn.charAt(Eqn.length()-1) >= '0' && Eqn.charAt(Eqn.length()-1) <= '9') || Eqn.charAt(Eqn.length()-1) == '\u00B2' || Eqn.charAt(Eqn.length()-1) == ')')) {
                    ff=true;
                    Result = bracket(Eqn);
                    res.setText(Result);
                }
                else if(Eqn.isEmpty()){
                    Eqn = "";
                    Result = "";
                    equ.setText(Eqn);
                    res.setText("0");
                    res.setTextSize(45);
                    res.setPadding(dpToPx(20),dpToPx(20),dpToPx(20),dpToPx(20));
                }

                break;
            case R.id.equalId:
                if(!ff){
                    ff=true;
                    Eqn = "";
                    Result = "0";
                }
                else if (!Eqn.isEmpty()) Eqn = Result;
                else Result = "0";
                bracCounter=0;

                res.setText(Result);
                equ.setText(Eqn);
                break;
            case R.id.brac1stId:
                if(ff) {
                    Eqn = Eqn + '(';
                    equ.setText(Eqn);
                    bracCounter++;
                }
                break;
            case R.id.brac2ndId:
                if(ff && bracCounter > 0 && ((Eqn.charAt(Eqn.length()-1) >= '0' && Eqn.charAt(Eqn.length()-1) <= '9') || Eqn.charAt(Eqn.length()-1) == '\u00B2' || Eqn.charAt(Eqn.length()-1) == ')')) {
                    Eqn = Eqn + ')';
                    equ.setText(Eqn);
                    bracCounter--;
                }
                break;
            case R.id.degreeRadianId:
                if(degRedFlag){
                    degRedFlag = false;
                    degRad.setText("RAD");
                }
                else{
                    degRedFlag = true;
                    degRad.setText("DEG");
                }

                if(!Eqn.isEmpty() && ((Eqn.charAt(Eqn.length()-1) >= '0' && Eqn.charAt(Eqn.length()-1) <= '9') || Eqn.charAt(Eqn.length()-1) == '\u00B2' || Eqn.charAt(Eqn.length()-1) == ')')) {
                    ff=true;
                    Result = bracket(Eqn);
                    res.setText(Result);
                }
                break;
        }
    }

    public String removeChar(String str, Integer n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    public String addSollution(String str, String r, Integer n, Integer m) {
        String front = str.substring(0, n);
        String back = str.substring(m + 1, str.length());
        return front + r + back;
    }

    private String findLeftNum(String str, Integer n) {
        Integer i;
        for (i = n - 1; ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.') && i > 0; i--) ;
        if (i == 0 || str.charAt(i) == '+' || str.charAt(i) == '-') i--;
        if (str.charAt(0)=='\u221A') i++;
        return str.substring(i + 1, n);
    }

    private String findRightNum(String str, Integer n) {
        Integer i, m=n;
        if(str.charAt(n+1)=='+'||str.charAt(n+1)=='-') m++;
        for (i = m + 1; ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.') && i < str.length() - 1; i++) ;
        if (i == str.length() - 1) i++;
        return str.substring(n + 1, i);
    }

    private String morePlusMinus(String str) {
        for (Integer i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' && i != str.length() - 1) {
                if (str.charAt(i + 1) == '+' || str.charAt(i + 1) == '-') {
                    str = removeChar(str, i);
                    i--;
                }
            } else if (str.charAt(i) == '-' && i != str.length() - 1) {
                if (str.charAt(i + 1) == '+' || str.charAt(i + 1) == '-') {
                    if (str.charAt(i + 1) == '+') str = addSollution(str, "-", i, i + 1);
                    else str = addSollution(str, "+", i, i + 1);
                    i--;
                }
            }
        }
        return str;
    }

    private boolean singleDotCheaking(String str) {
        for (Integer i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                return true;
            }
        }
        return false;
    }

    private boolean eCheaking(String str) {
        for (Integer i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                return true;
            }
        }
        return false;
    }

    private Integer ePosition(String str) {
        for (Integer i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                return i;
            }
        }
        return 0;
    }

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    private String bracket(String str) {

        for(int i=0;i<bracCounter;i++) str = str + ')';

        Integer i, j;

        for(i=0;i<str.length();i++)
        {
            String subResult;

            if(str.charAt(i)==')') {

                for(j=i;str.charAt(j)!='(';j--);

                subResult = solution(str.substring(j+1, i));
                if(!ff) return subResult;
                if(i+1<str.length() && str.charAt(i+1)=='\u00B2' && subResult.charAt(0)=='-') subResult =  subResult.substring(1);
                if(j-1>=0 && (str.charAt(j-1) >= '0' && str.charAt(j-1) <= '9')) subResult ='\u00D7' + subResult;
                if(i+1<str.length() && (str.charAt(i+1) >= '0' && str.charAt(i+1) <= '9')) subResult = subResult + '\u00D7';

                str = addSollution(str, subResult, j, i);
                i=0;
            }
        }
        return solution(str);
    }

    private String funSquareRoot(String str) {
        String leftNum="", rightNum="", r="";

        for (Integer i=0;i<str.length();i++){
            if (str.charAt(i) == '\u00B2'){

                str = morePlusMinus(str);

                leftNum = findLeftNum(str, i);

                double x;
                try{
                    x = Double.parseDouble(leftNum);
                }
                catch (Exception e){
                    ff=false;
                    return "Input Error";
                }

                try {
                    r = Double.toString(x*x);
                }
                catch (Exception e) {
                    ff=false;
                    return "Input Error";
                }
                if(leftNum.charAt(0)=='-') r = '-' + r;

                if (r.charAt(0)!='-') str = addSollution(str,"+"+r,i-leftNum.length(),i);
                else str = addSollution(str,r,i-leftNum.length(),i);

                i=0;
            }
        }

        for (Integer i=str.length()-1;i>=0;i--){
            if (str.charAt(i) == '\u221A'){

                str = morePlusMinus(str);

                rightNum = findRightNum(str, i);
                if(i==0) leftNum = "";
                else leftNum = findLeftNum(str, i);

                double x, y;
                try{
                    x = Double.parseDouble(leftNum);
                }
                catch (Exception e){
                    if(i!=0 && str.charAt(i-1)=='-') x=-1.0;
                    else x=1.0;
                }
                if(rightNum.length()==0)
                {
                    ff=false;
                    return "Input Error";
                }
                else y = Double.parseDouble(rightNum);

                if(y<0){
                    ff=false;
                    return "Complex Number";
                }

                try {
                    r = Double.toString(x*Math.sqrt(y));
                }
                catch (Exception e)
                {
                    ff=false;
                    return "Input Error";
                }

                if (r.charAt(0)!='-') str = addSollution(str,"+"+r,i-leftNum.length(),i+rightNum.length());
                else str = addSollution(str,r,i-leftNum.length(),i+rightNum.length());

                i=str.length()-1;
            }
        }
        return str;
    }

    private String funSinCosTan(String str) {
        String leftNum="", rightNum="", r="";
        Double pi = 3.141592654;

        for (Integer i=0;i<str.length();i++){
            if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')){

                str = morePlusMinus(str);


                rightNum = findRightNum(str, i+2);
                if(i==0) leftNum = "";
                else leftNum = findLeftNum(str, i);

                double x, y;
                try{
                    x = Double.parseDouble(leftNum);
                }
                catch (Exception e){
                    if(i!=0 && str.charAt(i-1)=='-') x=-1.0;
                    else x=1.0;
                }
                if(rightNum.length()==0)
                {
                    ff=false;
                    return "Input Error2";
                }
                else y = Double.parseDouble(rightNum);
                if (str.charAt(i) == 's' && str.charAt(i+1) == 'i' && str.charAt(i+2) == 'n')
                {
                    try {
                        if(degRedFlag) r = Double.toString(x*Math.sin(y*pi/180));
                        else r = Double.toString(x*Math.sin(y));
                    }
                    catch (Exception e)
                    {
                        ff=false;
                        return "Input Error3";
                    }
                }
                else if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 's')
                {
                    try {
                        if(degRedFlag) r = Double.toString(x*Math.cos(y*pi/180));
                        else r = Double.toString(x*Math.cos(y));
                    }
                    catch (Exception e)
                    {
                        ff=false;
                        return "Input Error4";
                    }
                }
                else if (str.charAt(i) == 't' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 'n')
                {
                    try {
                        if(y%90==0 && y%180!=0){
                            ff = false;
                            return "Indefinite";
                        }
                        if(degRedFlag) r = Double.toString(x*Math.tan(y*pi/180));
                        else r = Double.toString(x*Math.tan(y));
                    }
                    catch (Exception e)
                    {
                        ff=false;
                        return "Input Error5";
                    }
                }

                if (r.charAt(0)!='-') str = addSollution(str,"+"+r,i-leftNum.length(),i+2+rightNum.length());
                else str = addSollution(str,r,i-leftNum.length(),i+2+rightNum.length());

                i=0;
            }
        }
        return str;
    }

    private String multiAndDiv(String str) {
        String leftNum = "", rightNum = "", r = "";
        for (Integer i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '\u00D7') || (str.charAt(i) == '\u00F7')) {
                str = morePlusMinus(str);
                if (i != 0 && i != str.length() - 1) {
                    if ((i != str.length() - 1) && ((str.charAt(i + 1) == '\u00D7') || (str.charAt(i + 1) == '\u00F7'))) {
                        ff = false;
                        return "Input Error";
                    } else if (str.charAt(i - 1) == '+' || str.charAt(i - 1) == '-') {
                        ff = false;
                        return "Input Error";
                    } else if ((str.charAt(i + 1) == '+') || (str.charAt(i + 1) == '-')) {
                        if (i == str.length() - 2 || ((str.charAt(i + 2) == '\u00D7') || (str.charAt(i + 2) == '\u00F7'))) {
                            ff = false;
                            return "Input Error";
                        }
                        leftNum = findLeftNum(str, i);
                        if (str.charAt(i + 1) == '+') rightNum = "+" + findRightNum(str, i + 1);
                        else rightNum = "-" + findRightNum(str, i + 1);
                    } else {
                        leftNum = findLeftNum(str, i);
                        rightNum = findRightNum(str, i);
                    }

                    double x = Double.parseDouble(leftNum);
                    double y = Double.parseDouble(rightNum);
                    if (str.charAt(i) == '\u00D7') r = Double.toString(x * y);
                    else {
                        if (y == 0) {
                            ff = false;
                            return "Indefinite";
                        } else r = Double.toString(x / y);
                    }

                    if (r.charAt(0) != '-')
                        str = addSollution(str, "+" + r, i - leftNum.length(), i + rightNum.length());
                    else str = addSollution(str, r, i - leftNum.length(), i + rightNum.length());
                } else {
                    ff = false;
                    return "Input Error";
                }
                i = 0;
            }
        }
        return str;
    }

    private String addAndSub(String str) {
        String leftNum="", rightNum="", r="";

        str = morePlusMinus(str);

        for (Integer i=0;i<str.length();i++){
            if ((str.charAt(i) == '+') || (str.charAt(i) == '-')){
                if(i!=0 && str.charAt(i-1)!='E'){

                    leftNum = findLeftNum(str, i);
                    rightNum = findRightNum(str, i);

                    double x = Double.parseDouble(leftNum);
                    double y = Double.parseDouble(rightNum);
                    if (str.charAt(i) == '+') r = Double.toString(x+y);
                    else r = Double.toString(x-y);

                    if (r.charAt(0)!='-') str = addSollution(str,"+"+r,i-leftNum.length(),i+rightNum.length());
                    else str = addSollution(str,r,i-leftNum.length(),i+rightNum.length());

                    i=0;
                }
            }
        }
        return str;
    }

    private String purifyResult(String str){

        double result;
        result = Double.parseDouble(str) + 0;
        str = Double.toString(result);

        if (str.charAt(0)=='+')  str = removeChar(str,0); // Leading plus sign remover

        if(str.length()>1) {
            if(str.charAt(str.length()-2) == '.' && str.charAt(str.length()-1) == '0'){
                str = removeChar(str,str.length()-1);
                str = removeChar(str,str.length()-1);
            }
        }

        if(str.length() > 12){
            res.setTextSize(25);
            res.setPadding(dpToPx(20),dpToPx(45),dpToPx(20),dpToPx(20));
        }
        else
        {
            res.setTextSize(45);
            res.setPadding(dpToPx(20),dpToPx(20),dpToPx(20),dpToPx(20));
        }

        return str;
    }

    private String solution(String str){

        try{
            str = funSquareRoot(str);
//            if(!ff) return "funSquareRoot";
            if(ff) str = funSinCosTan(str);
//            if(!ff) return "funSinCosTan";
            if(ff) str = multiAndDiv(str);
//            if(!ff) return "multiAndDiv";
            if(ff) str = addAndSub(str);
//            if(!ff) return "addAndSub";
            if(ff) str = purifyResult(str);
//            if(!ff) return "purifyResult";
        }
        catch (Exception e) {
            str = "Output exist";
        }

        return str;
    }
}
