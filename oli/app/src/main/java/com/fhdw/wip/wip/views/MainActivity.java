package com.fhdw.wip.wip.views;

import android.app.ActionBar;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.fhdw.wip.wip.R;
import java.util.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.addAll;

public class MainActivity extends AppCompatActivity {

    ListView foodlist;
    ArrayAdapter<String> adapter;
    TextView date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = (TextView) findViewById(R.id.date);

        date.setText( DateFormat.getDateInstance().format(new Date()) );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search, menu);
        MenuItem item = menu.findItem(R.id.list);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.searchbar));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newtext) {
                adapter.getFilter().filter(newtext);
                return false;



            }


        }
        );
        return super.onCreateOptionsMenu(menu);
    }
    }

