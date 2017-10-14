package com.example.vishnu.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=0;
    int totalPrice=0;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        totalPrice=quantity*5;
        String message="Total Price: $"+totalPrice+"\nThank you!";
        displayprice(message);
    }

    public void increment(View view){
        quantity++;
        display(quantity);

    }

    public void decrement(View view){
        quantity--;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
       TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the price value on the screen.
     */
    private void displayprice(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
       /* priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));*/
        priceTextView.setText(message);
    }

}
