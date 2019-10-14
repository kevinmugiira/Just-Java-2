package com.example.android.justjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int amount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     *This method is called when the increament button is clicked
     */

    public void increase(View view){

        amount = amount + 1;
        displayAm(amount);
    }

    /**
     * This will be called when the minus button is clicked
     */

    public void decrease(View view){
        amount = amount - 1;
        displayAm(amount);
    }

    /**
     * This method will be called when the submit button is clicked
     */

    public void oderSubmit(View view){
        int price = amount * 70;
        String message = (": " + price );
        String pMessage = message + "\n come again!";
        displayPrices(pMessage);


    }


    /**
     * Calculates the price of the order.
     *
     * @paramis the number of cups of coffee ordered
     */



    public void displayAm(int number) {
        TextView tv = (TextView) findViewById(R.id.quantity_tv);
        tv.setText("" + number);
    }

    public void displayPrice(int number) {
        TextView textv = (TextView) findViewById(R.id.price_titlev);
        textv.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void displayPrices(String message){
        TextView ttv = (TextView) findViewById(R.id.price_tv);
        ttv.setText(message);
    }
}
