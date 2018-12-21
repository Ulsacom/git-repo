package uz.idulsa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button clean;
    EditText n1;
    EditText n2;
    TextView textView;
    float number1;
    float number2;
    float ressum;
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button =findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()) ) {
                    return;
                }
                number1 = Integer.parseInt(n1.getText().toString());
                     number2 = Integer.parseInt(n2.getText().toString());
                     ressum = number1 / number2;
                     textView.setText(Double.toString(ressum));
                     }});
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) { if(TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()) ) {
                return;
            }

                    number1 = Integer.parseInt(n1.getText().toString());
                    number2 = Integer.parseInt(n2.getText().toString());
                    ressum = number1 * number2;
                    textView.setText(Double.toString(number1 *number2));

            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()) ) {
                    return;
                }
                    number1 = Integer.parseInt(n1.getText().toString());
                    number2 = Integer.parseInt(n2.getText().toString());
                    ressum = number1 + number2;
                    textView.setText(Double.toString(ressum));
                }

        });
        b4.setOnClickListener(new View.OnClickListener() {


            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {


                if(TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()) ) {
                    return;
                }
                number1 = Integer.parseInt(n1.getText().toString());
                number2 = Integer.parseInt(n2.getText().toString());
                ressum = number1 - number2;
                textView.setText(Double.toString(ressum));
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()) ) {
                    return;
                }
                n1.setText("");
                n2.setText("");
                textView.setText("");
                Toast toast= Toast.makeText(MainActivity.this,"очистка...", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("MainActivity");
                startActivity(intent);
            }
        });
    }
}

