package com.demo.expandablelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lvItems = (ListView) findViewById(R.id.lv_items);
        ExpandableAdapter adapter = getAdapter();

        lvItems.setAdapter(adapter);
        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ExpandableAdapter adapter = (ExpandableAdapter) parent.getAdapter();

                Item item = (Item) adapter.getItem(position);
                if(item != null){
                    if(item.isExpanded){
                        item.isExpanded = false;

                    }else{
                        item.isExpanded = true;
                    }
                }

                adapter.notifyDataSetChanged();
            }
        });
    }


    private ExpandableAdapter getAdapter(){

        List<Item> items = new ArrayList<>();
        Item item;
        for(int i = 0; i < 50; i++){
             item = new Item();
            item.title = "项目描述 " + i;
            item.description = "今天天气很好今天天气很好今天天气很好天气很好今天天气今天天气很好今天天气" +
                    "很好今天天气很好今天天气很好今天天气很好今天天气很天气很好今天天气很好今天好今天天气" +
                    "今天天气很好今天天气很好今天天很好今天天气很好今天天气很好今天天气很好今天天气很好"+ i;
            item.isExpanded = false;

            items.add(item);
        }

        return new ExpandableAdapter(this, items);
    }
}
