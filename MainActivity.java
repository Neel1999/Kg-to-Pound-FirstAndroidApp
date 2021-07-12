package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "The Number has been Entered", Toast.LENGTH_LONG).show();
//                String str = editText.getText().toString();
//                int i = Integer.parseInt(str);
//                double p = 2.20462 * i;
//                textView.setText(String.valueOf(p));
//            }
//        });
    }
    public void calculate (View view){
        String str = editText.getText().toString();
        int i = Integer.parseInt(str);
        double d = 2.20462 * i;
        textView.setText("The required values in Pounds is "+ String.format("%.2f",d));
        Toast.makeText(this, "Thank You For Using the App", Toast.LENGTH_LONG).show();
    }

}
