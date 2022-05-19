package me.tux.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.textView);

        display.setOnClickListener(v -> {
            if (getString(R.string.display).equals(display.getText().toString())) {
                display.setText(null);
            }
        });
    }


    public void zeroButton(View view) {
    }

    public void oneButton(View view) {
    }

    public void twoButton(View view) {
    }

    public void threeButton(View view) {
    }

    public void fourButton(View view) {
    }

    public void fiveButton(View view) {
    }

    public void sixButton(View view) {
    }

    public void sevenButton(View view) {
    }

    public void eightButton(View view) {
    }

    public void nineButton(View view) {
    }

    public void multiplyButton(View view) {
    }

    public void divideButton(View view) {
    }

    public void addButton(View view) {
    }

    public void subtractButton(View view) {
    }

    public void percentageButton(View view) {
    }

    public void parenthesesButton(View view) {
    }

    public void plusMinusButton(View view) {
    }

    public void bracketButton(View view) {
    }

    public void clearButton(View view) {
    }

    public void decimalButton(View view) {
    }

    public void backButton(View view) {
    }

    public void equalsButton(View view) {
    }

}