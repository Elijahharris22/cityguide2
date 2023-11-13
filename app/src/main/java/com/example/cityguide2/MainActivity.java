package com.example.cityguide2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] attraction = new String[]{"Art Institute of Chicago", "Magnificent Mile", "Willis Tower", "Chicago Bean", "Water Tower"};
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, attraction);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu")));
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://themagnificentmile.com")));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, Willis.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, Bean.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, Water.class));
                        break;
                }
            }
        });
    }
}
