package com.example.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputValue;
    private Spinner unitTypeSpinner;
    private Button convertButton;
    private TextView resultTextView;
    private Converter unitConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValue = findViewById(R.id.inputValue);
        unitTypeSpinner = findViewById(R.id.unitTypeSpinner);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);
        unitConverter = new Converter();

        // Set up the spinner with conversion types
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.unit_types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitTypeSpinner.setAdapter(adapter);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertUnit();
            }
        });
    }

    private void convertUnit() {
        String inputText = inputValue.getText().toString();
        if (!inputText.isEmpty()) {
            double input = Double.parseDouble(inputText);
            String selectedUnit = unitTypeSpinner.getSelectedItem().toString();
            double result = 0;

            switch (selectedUnit) {
                case "Celsius to Fahrenheit":
                    result = unitConverter.celsiusToFahrenheit(input);
                    break;
                case "Fahrenheit to Celsius":
                    result = unitConverter.fahrenheitToCelsius(input);
                    break;
                case "Kilometers to Miles":
                    result = unitConverter.kilometersToMiles(input);
                    break;
                case "Miles to Kilometers":
                    result = unitConverter.milesToKilometers(input);
                    break;
                case "Kilograms to Pounds":
                    result = unitConverter.kilogramsToPounds(input);
                    break;
                case "Pounds to Kilograms":
                    result = unitConverter.poundsToKilograms(input);
                    break;
            }

            resultTextView.setText("Result: " + result);
        }
    }
}
