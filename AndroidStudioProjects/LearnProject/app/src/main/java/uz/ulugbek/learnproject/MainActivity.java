package uz.ulugbek.learnproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public TextView text;
public ImageView image;
    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        image = findViewById(R.id.image);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        text = findViewById(R.id.text);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Вы нажали вверх");
                Toast toast= Toast.makeText(MainActivity.this,"Вы нажали вверх", Toast.LENGTH_LONG );
                toast.show();
                toast.setGravity(Gravity.TOP, 0,0);



                }
                });
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Вы нажали ввниз");
                Toast toast= Toast.makeText(MainActivity.this,"Вы нажали ввниз", Toast.LENGTH_LONG );
                toast.show();
                toast.setGravity(Gravity.TOP, 0,0);

            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Вы нажали лево");
                Toast toast= Toast.makeText(MainActivity.this,"Вы нажали лево", Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.TOP, 0,0);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Вы нажали право");
                Toast toast= Toast.makeText(MainActivity.this,"Вы нажали право", Toast.LENGTH_LONG );
                toast.show();
                toast.setGravity(Gravity.TOP, 0,0);
            }
        });

    }

}
