package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button_Jun_Feb_invoice = (Button)findViewById(R.id.Jun_Feb_Invoice);
        Button_Jun_Feb_invoice.setOnClickListener(Button_Jun_Feb_Invoice);

        Button Button_March_April_invoice = (Button)findViewById(R.id.March_April_Invoice);
        Button_March_April_invoice.setOnClickListener(Button_March_April_Invoice);

        Button Button_May_June_invoice = (Button)findViewById(R.id.May_June_Invoice);
        Button_May_June_invoice.setOnClickListener(Button_May_June_Invoice);

        Button Button_July_August_invoice = (Button)findViewById(R.id.July_August_Invoice);
        Button_July_August_invoice.setOnClickListener(Button_July_August_Invoice);

        Button Button_Set_Oct_invoice = (Button)findViewById(R.id.Set_Oct_Invoice);
        Button_Set_Oct_invoice.setOnClickListener(Button_Set_Oct_Invoice);

        Button Button_Nov_Dec_invoice = (Button)findViewById(R.id.Nov_Dec_Invoice);
        Button_Nov_Dec_invoice.setOnClickListener(Button_Nov_Dec_Invoice);
    }
    private View.OnClickListener Button_Jun_Feb_Invoice = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView Jun_Feb_Invoice = (TextView)findViewById(R.id.Click);
            TextView Narrate_Number = (TextView)findViewById(R.id.number);
            Jun_Feb_Invoice.setText("2018/Jun.Feb.Invoice");
            Narrate_Number.setText("1");//月份記述數字

        }
    };
    private View.OnClickListener Button_March_April_Invoice = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView March_April_Invoice = (TextView)findViewById(R.id.Click);
            TextView Narrate_Number = (TextView)findViewById(R.id.number);
            March_April_Invoice.setText("2018/March.April.Invoice");
            Narrate_Number.setText("2");//月份記述數字
        }
    };
    private View.OnClickListener Button_May_June_Invoice = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView May_June_Invoice = (TextView)findViewById(R.id.Click);
            TextView Narrate_Number = (TextView)findViewById(R.id.number);
            May_June_Invoice.setText("2018/May.June.Invoice");
            Narrate_Number.setText("3");//月份記述數字
        }
    };
    private View.OnClickListener Button_July_August_Invoice = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView July_August_Invoice = (TextView)findViewById(R.id.Click);
            TextView Narrate_Number = (TextView)findViewById(R.id.number);
            July_August_Invoice.setText("2018/July.August.Invoice");
            Narrate_Number.setText("4");//月份記述數字
        }
    };
    private View.OnClickListener Button_Set_Oct_Invoice = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView Set_Oct_Invoice = (TextView)findViewById(R.id.Click);
            TextView Narrate_Number = (TextView)findViewById(R.id.number);
            Set_Oct_Invoice.setText("2018/Set.Oct.Invoice");
            Narrate_Number.setText("5");//月份記述數字
        }
    };
    private View.OnClickListener Button_Nov_Dec_Invoice = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView Nov_Dec_Invoice = (TextView)findViewById(R.id.Click);
            TextView Narrate_Number = (TextView)findViewById(R.id.number);
            Nov_Dec_Invoice.setText("2018/Nov.Dec.Invoice");
            Narrate_Number.setText("6");//月份記述數字
        }
    };

    public void click_AtoB(View v){

        TextView Click_Button = (TextView)findViewById(R.id.Click);
        TextView Narrate_Number = (TextView)findViewById(R.id.number);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("Month", Click_Button.getText().toString());
        bundle.putString("NumberMonth", Narrate_Number.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}