package com.example.layoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar secondToolBar = findViewById(R.id.second_toolbar_horizental_constraints);
        //TODO find solution for setSupportActionBar and make it default action bar
        secondToolBar.setTitle("");
        setSupportActionBar(secondToolBar);



        ArrayList<SecondCharacter>   secondCharacters = new ArrayList<SecondCharacter>();
        secondCharacters.add(new SecondCharacter(R.drawable.ic_launcher_background, R.string.second_recycleview_itemdate, R.string.second_recycleview_item1));
        secondCharacters.add(new SecondCharacter(R.drawable.ic_launcher_background, R.string.second_recycleview_itemdate, R.string.second_recycleview_item2));
        secondCharacters.add(new SecondCharacter(R.drawable.ic_launcher_background, R.string.second_recycleview_itemdate, R.string.second_recycleview_item1));
        secondCharacters.add(new SecondCharacter(R.drawable.ic_launcher_background, R.string.second_recycleview_itemdate, R.string.second_recycleview_item2));
        secondCharacters.add(new SecondCharacter(R.drawable.ic_launcher_background, R.string.second_recycleview_itemdate, R.string.second_recycleview_item1));
        secondCharacters.add(new SecondCharacter(R.drawable.ic_launcher_background, R.string.second_recycleview_itemdate, R.string.second_recycleview_item2));
        RecyclerView secondRecycleView = findViewById(R.id.second_recycle_view);
        int secondSpaceInPixel =  getResources().getDimensionPixelSize(R.dimen.secondGridSpacing);
        secondRecycleView.addItemDecoration(new SecondRecycleSpaces(secondSpaceInPixel));
        secondRecycleView.setLayoutManager(new GridLayoutManager(this, 2));
        SecondAdapter secondAdapter = new SecondAdapter(secondCharacters);

        secondRecycleView.setAdapter(secondAdapter);






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.second_menu, menu);
        return true;
    }
}
