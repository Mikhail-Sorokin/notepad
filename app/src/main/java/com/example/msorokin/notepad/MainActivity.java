package com.example.msorokin.notepad;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    final String[] catNamesArray = new String[] { "Новый документ"};
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNamesArray);
        setListAdapter(mAdapter);

    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (position == 0){
            Intent intent = new Intent(MainActivity.this, Text_editor.class);
            startActivity(intent);
        }
    }
}
