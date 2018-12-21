
package com.ulsa.aalertdialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Alert(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder
                .setCancelable(false)
                .setTitle("APK")
                .setMessage("Вы уверень закрыть приложения")
                .setNegativeButton("ДА", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      finish();
                        System.exit(1);
                    }
                })
                .setPositiveButton("НЕТ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        AlertDialog alertDialog =builder.create();
        alertDialog.show();

    }

}




