package com.example.nguyen_wind7.quizeasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView[] textViews = new TextView[6];
    Button bt1,bt2,bt3,bt4;
    TextView tv7,tv8;
    int i = 0 ;
    int a = 1 ,b = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setID();

        textViews[0].setText(QUIZ_LIST[0][0]);
        textViews[1].setText(QUIZ_LIST[0][1]);
        textViews[2].setText(QUIZ_LIST[0][2]);
        textViews[3].setText(QUIZ_LIST[0][3]);
        textViews[4].setText(QUIZ_LIST[0][4]);
        textViews[5].setText(QUIZ_LIST[0][5]);


    }

    private void setID(){
        for (int i = 0 ;i<6 ;i++){
            String textView = "tv"+i;
            int resID = getResources().getIdentifier(textView,"id",getPackageName());
            textViews[i]=findViewById(resID);
        }
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

        tv7 = (TextView)findViewById(R.id.tv7);
        tv8 = (TextView)findViewById(R.id.tv8);
    }

    private static final String[][] QUIZ_LIST= {
            {"問題１","「ありがとうございました」を英語で書くと?","No problem", "Thank you", "Hello", "No, it is not"},
            {"問題2","「申請する」を英語で書くと?","To Apply", "To Quit", "To Play", "To Stop"},
            {"問題3","「掃除する」を英語で書くと?","To Throw", "To Fly", "To Fill In", "To Clean Up"},
            {"問題4","「食事」を英語で書くと?","Smoking", "A Meal", "Cooker", "A Bowl"},
            {"問題5","「確認する」を英語で書くと?","To Listen", "To Speak", "To Confirm", "To Sing"}
    };
    private static final int[] QUIZ_ANSWER = {2, 1, 4, 2, 3};

    private void changeQuestion(){
        textViews[0].setText(QUIZ_LIST[i][0]);
        textViews[1].setText(QUIZ_LIST[i][1]);
        textViews[2].setText(QUIZ_LIST[i][2]);
        textViews[3].setText(QUIZ_LIST[i][3]);
        textViews[4].setText(QUIZ_LIST[i][4]);
        textViews[5].setText(QUIZ_LIST[i][5]);
    }

    @Override
    public void onClick(View v) {
        try{

            if (((Button) v).getText().toString().equals(QUIZ_ANSWER[i]+"")){
                tv7.setText(a+"");
                a++;
                i++;
                changeQuestion();

            } else {
                tv8.setText(b+"");
                b++;
                i++;
                changeQuestion();

            }

    }catch (Exception e){

        }
}}
