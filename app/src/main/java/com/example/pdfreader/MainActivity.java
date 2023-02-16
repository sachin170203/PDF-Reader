package com.example.pdfreader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.myPDFList);

        String[] PDFlist= {"Description", "Sppu", "Task Allocation Document","Theroy Of Computation","Data Structure"
        ,"DBMS","Human Computer Interaction","Machine Learning","Materials for engineering","Object-Oriented","Offer Letter",
        "Operating System","Software Engineering","android_tutorial","Business","tcp_ip","deep learning"};



        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,PDFlist){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view=super.getView(position, convertView, parent);
                TextView myText=(TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String item=listView.getItemAtPosition(position).toString();
                Intent start=new Intent(getApplicationContext(),PDFOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
                listView.setSelection(R.color.teal_700);
            }
        });

    }
}