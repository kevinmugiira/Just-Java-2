package com.example.android.justjava2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        //int price = amount * 70;


        createOrderOfSummary(8);



    }


    /**This method creates a summary of
     *
     *
     */

    private String createOrderOfSummary(int price){
        int number = amount * 50;
        return "Name:kaptain kunal \n" +  amount + "\nTotal: " + price + "\nThank you!"  ;

    }


    /**  private String createWeatherMessage(int temperature, String cityName){
          return"Wlecome to " + cityName + "where the temperature today is " + temperature + "degrees";
      }
  **/

    /**
     * Calculates the price of the order.
     **/

   /** private int calculatePrice() {
        int price = amount * 5 ;
        return price;
    }
**/

    public void displayAm(int number) {
        TextView tv = (TextView) findViewById(R.id.quantity_tv);
        tv.setText("" + number);
    }

    //public void displayPrice(int number) {
      //  TextView textv = (TextView) findViewById(R.id.price_titlev);
      //  textv.setText(NumberFormat.getCurrencyInstance().format(number));
   // }

    public void displayPrices(String message){
        TextView ttv = (TextView) findViewById(R.id.price_tv);
        ttv.setText(message);
    }
}
