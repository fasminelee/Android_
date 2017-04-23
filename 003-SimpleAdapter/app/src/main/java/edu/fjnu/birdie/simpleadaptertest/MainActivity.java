package edu.fjnu.birdie.simpleadaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String[] names = new String[]{
            "Lion","Cat","Dog","Elephant","Monkey","Tiger"
    };
    private int[] imageIds = new int[]{
            R.drawable.lion ,R.drawable.cat ,R.drawable.dog,
            R.drawable.elephant ,R.drawable.monkey ,R.drawable.tiger
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();

        for(int i=0 ;i<names.length ; i++){
            Map<String,Object> listItem = new HashMap<String,Object>();
            listItem.put("name",names[i]);
            listItem.put("image",imageIds[i]);
            listItems.add(listItem);
            Log.d("listItem",i+"");
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this ,listItems ,R.layout.simple_item,
                new String[] {"name","image"},new int[] {R.id.name,R.id.image});
        ListView list = (ListView) findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);
        Log.d("Adapter","done");

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                {
                    Toast.makeText(getApplicationContext(), names[position],
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
