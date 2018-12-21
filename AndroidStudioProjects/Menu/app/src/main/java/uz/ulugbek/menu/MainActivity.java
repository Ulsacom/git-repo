package uz.ulugbek.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button = findViewById(R.id.button);
//
//button.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        Intent intent = new Intent("Main2Activity");
//        startActivity(intent);
//    }
//});
//    }
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//       getMenuInflater().inflate(R.menu.menu_items, menu);
//       return true;
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//int id =item.getItemId();
//
//
//switch (id){
//    case R.id.settings:
//        Toast toast= Toast.makeText(MainActivity.this,"menu bosildi", Toast.LENGTH_LONG );
//        toast.show();
//    case R.id.setting1s2:
//        Toast toas1t= Toast.makeText(MainActivity.this,"setting1s2 bosildi", Toast.LENGTH_LONG );
//        toas1t.show();
//    case R.id.setting1s3:
//
//        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
//
//
//
//}
//
//
//        return super.onOptionsItemSelected(item);
//    }

}}


