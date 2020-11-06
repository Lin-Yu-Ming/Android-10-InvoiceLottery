package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        c_page();
    }
    //回到月份選擇
    public void re_month(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    //上一頁
    public void re_number(View v){
        finish();
    }
    private void c_page(){
        int Number;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            Number = Integer.parseInt(bundle.getString("WinNumber"));
            TextView Money = (TextView)findViewById(R.id.money);
            //中獎金額
            if (Number == 000){
                Money.setText("200000000元");
            }
            else if (Number == 001){
                Money.setText("1000000000元");
            }
            else if (Number == 002){
                Money.setText("3000000000元");
            }
            else if (Number == 003){
                Money.setText("4000000000元");
            }
            else if (Number == 004){
                Money.setText("5000000000元");
            }
            else if (Number == 100){
                Money.setText("6000000000元");
            }
            else if (Number == 101){
                Money.setText("5000000000元");
            }
            else if (Number == 102){
                Money.setText("9999999999元");
            }
            else if (Number == 103){
                Money.setText("00000000000元");
            }
            else if (Number == 104){
                Money.setText("5000000000元");
            }
            else if (Number == 200){
                Money.setText("100000000000000元");
            }
            else if (Number == 201){
                Money.setText("100000000000000元");
            }
            else if (Number == 202){
                Money.setText("6000000000元");
            }
            else if (Number == 203){
                Money.setText("100000000000000元");
            }
            else if (Number == 204){
                Money.setText("100000000000000元");
            }
            else if (Number == 300){
                Money.setText("100000000000000元");
            }
            else if (Number == 301){
                Money.setText("6000000000元");
            }
            else if (Number == 302){
                Money.setText("100000000000000元");
            }
            else if (Number == 303){
                Money.setText("100000000000000元");
            }
            else if (Number == 304){
                Money.setText("100000000000000元");
            }
            else if (Number == 400){
                Money.setText("100000000000000元");
            }
            else if (Number == 401){
                Money.setText("6000000000元");
            }
            else if (Number == 402){
                Money.setText("100000000000000元");
            }
            else if (Number == 403){
                Money.setText("77777777777元");
            }
            else if (Number == 404){
                Money.setText("6666666666元");
            }
            else if (Number == 500){
                Money.setText("6000000000元");
            }
            else if (Number == 501){
                Money.setText("1000000000000000000元");
            }
            else if (Number == 502){
                Money.setText("88888888888888元");
            }
            else if (Number == 503){
                Money.setText("2222222222元");
            }
            else if (Number == 504){
                Money.setText("6000000000元");
            }
            else
                Money.setText("To Continue try!");
        }
    }
}