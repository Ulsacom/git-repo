package com.ulsa.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> phones = new ArrayList<>();
    ArrayAdapter<String> adapter;

    ArrayList<String> ArraryList = new ArrayList<>();
    ListView phonesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        phonesList =  findViewById(R.id.phonesList);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, phones);
        phonesList.setAdapter(adapter);

        // обработка установки и снятия отметки в списке
        phonesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                // получаем нажатый элемент
                String phone = adapter.getItem(position);
                if(phonesList.isItemChecked(position)){
                    ArraryList.add(phone);
                }
                else{
                    ArraryList.remove(phone);
                }
            }
        });
    }

    public void add(View view){

        EditText phoneEditText = findViewById(R.id.phone);
        String phone = phoneEditText.getText().toString();
        if(!phone.isEmpty() && !phones.contains(phone)){
            adapter.add(phone);
            phoneEditText.setText("");
            adapter.notifyDataSetChanged();
        }
    }
    public void remove(View view){
        // получаем и удаляем выделенные элементы
        for(int i=0; i< ArraryList.size();i++){
            adapter.remove(ArraryList.get(i));
        }
        // снимаем все ранее установленные отметки
        phonesList.clearChoices();
        // очищаем массив выбраных объектов
        ArraryList.clear();

        adapter.notifyDataSetChanged();
    }
}



