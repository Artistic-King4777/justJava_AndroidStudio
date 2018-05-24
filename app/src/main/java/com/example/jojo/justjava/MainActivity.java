package com.example.jojo.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {

    private static Double quantity = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // TODO This method is called when the plus button is clicked.
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    // TODO This method is called when the minus button is clicked.
    public void decrement(View view) {
        if (quantity <= 0) {
            quantity = 0.00;
        } else {
            quantity = quantity - 1;
        }
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     * coffee is $3.50
     */
    public void submitOrder(View view) {
        display(quantity);
        displayPrice(quantity * 3.50);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(Double number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    // TODO - This method displays the given quantity value on the screen
    private void displayPrice(Double number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


} // End of class
