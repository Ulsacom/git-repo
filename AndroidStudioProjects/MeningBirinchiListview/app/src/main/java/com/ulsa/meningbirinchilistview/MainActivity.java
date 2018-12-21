package com.ulsa.meningbirinchilistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public ListView lv;
    String [] nameinlv = {"Ulugbek",
            "hp",
            "asus",
            "samsung",
            "echoapp",
            "iphone",
            "google.com",
            "apple",
            "Ulugbek",
            "Ulugbek",

    };
    Integer [] imginlv = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        final CusotmAdapter cusotmAdapter = new CusotmAdapter(this, nameinlv,imginlv );
        lv.setAdapter(cusotmAdapter);





        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String theneShow = cusotmAdapter.getItem(position).toString();
                Toast.makeText(MainActivity.this, theneShow, Toast.LENGTH_SHORT).show();
                
            }
        });
    }
}
