package com.example.layoutapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import com.example.layoutapp.R;
import com.example.layoutapp.adapter.SecondAdapter;
import com.example.layoutapp.model.CharacterClass;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setUpToolBar();
        addingRecycleView(mockData());
    }

    private void setUpToolBar() {
        Toolbar secondToolBar = findViewById(R.id.second_toolbar_horizental_constraints);
        setSupportActionBar(secondToolBar);
    }

    private List<CharacterClass> mockData() {
        ArrayList<CharacterClass> characterClasses = new ArrayList<CharacterClass>();
        characterClasses.add(new CharacterClass(R.drawable.ic_launcher_background, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_launcher_background, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_launcher_background, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_launcher_background, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_launcher_background, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_launcher_background, R.string.dummy_date, R.string.dummy_texts));
        return characterClasses;
    }

    private void addingRecycleView(List<CharacterClass> list) {
        RecyclerView secondRecycleView = findViewById(R.id.second_recycle_view);
        secondRecycleView.setLayoutManager(new GridLayoutManager(this, 2));
        SecondAdapter secondAdapter = new SecondAdapter(list);
        secondRecycleView.offsetChildrenVertical(10);
        secondRecycleView.setAdapter(secondAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_menu, menu);
        return true;
    }
}
