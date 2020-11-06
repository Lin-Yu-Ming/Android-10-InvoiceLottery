package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b_page();
    }
    //上一頁
    public void back(View v){
        finish();
    }
    private void b_page(){
        int Number;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            String month = bundle.getString("Month");
            Number = Integer.parseInt(bundle.getString("NumberMonth"));
            TextView Month = (TextView)findViewById(R.id.month);
            Month.setText(month);

            //傳值記述數字代表的中獎號碼
            if (Number== 1){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("000" + "\n" + "001" + "\n" + "002" + "\n" + "003" + "\n" + "004");
            }
            else if (Number == 2){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("100" + "\n" + "101" + "\n" + "102" + "\n" + "103" + "\n" + "104");
            }
            else if (Number == 3){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("200" + "\n" + "201" + "\n" + "202" + "\n" + "203" + "\n" + "204");
            }
            else if (Number == 4){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("300" + "\n" + "301" + "\n" + "302" + "\n" + "303" + "\n" + "304");
            }
            else if (Number == 5){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("400" + "\n" + "401" + "\n" + "402" + "\n" + "403" + "\n" + "404");
            }
            else if (Number == 6){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("500" + "\n" + "501" + "\n" + "502" + "\n" + "503" + "\n" + "504");
            }
        }
    }
    public void click_BtoC(View v){
        EditText Input_Number = (EditText)findViewById(R.id.InputNumber);
        Intent intent = new Intent(this, ThirdActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("WinNumber", Input_Number.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}