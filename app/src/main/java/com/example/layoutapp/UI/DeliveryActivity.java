package com.example.layoutapp.UI;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.example.layoutapp.R;
import com.example.layoutapp.adapter.DeliveryAdapter;
import com.example.layoutapp.model.CharacterClass;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DeliveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivary);
        addToolBar();
        addRecycleView(dummyContent());
    }

    private void addToolBar() {
        Toolbar secondToolBar = findViewById(R.id.delivery_toolbar);
        setSupportActionBar(secondToolBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private List<CharacterClass> dummyContent() {
        ArrayList<CharacterClass> characterClasses = new ArrayList<CharacterClass>();
        characterClasses.add(new CharacterClass(R.drawable.ic_bluetooth_icon, R.drawable.ic_check_black_icon, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_bluetooth_icon, R.drawable.ic_check_black_icon, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_bluetooth_icon, R.drawable.ic_check_black_icon, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_bluetooth_icon, R.drawable.ic_check_black_icon, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_bluetooth_icon, R.drawable.ic_check_black_icon, R.string.dummy_date, R.string.dummy_texts));
        characterClasses.add(new CharacterClass(R.drawable.ic_bluetooth_icon, R.drawable.ic_check_black_icon, R.string.dummy_date, R.string.dummy_texts));
        return characterClasses;
    }

    private void addRecycleView(List<CharacterClass> dummyContent) {
        RecyclerView deliveryRecycler        = findViewById(R.id.delivery_navigation_recycler);
        deliveryRecycler.setAdapter(new DeliveryAdapter(dummyContent));
        deliveryRecycler.setNestedScrollingEnabled(false);
        deliveryRecycler.setLayoutManager(new LinearLayoutManager(this){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.delivary_menu, menu);
        return true;
    }
}
