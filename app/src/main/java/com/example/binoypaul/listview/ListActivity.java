package com.example.binoypaul.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        String []family = {"Binoy", "Binita", "Paul", "Sheela", "Jaji", "Shalin", "Cousins","Binoy", "Binita", "Paul", "Sheela", "Jaji"};
       // ListAdapter familyList = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, family);
        ListAdapter familyList = new CustomAdapter(this, family);
        ListView familyView = (ListView) findViewById(R.id.BinoListView);
        familyView.setAdapter(familyList);

        familyView.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String family = String.valueOf( parent.getItemAtPosition(position) );
                        Log.i("bTest", family);
                    }
                }
        );


    }
}
