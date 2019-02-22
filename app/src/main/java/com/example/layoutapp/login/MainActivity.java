package com.example.layoutapp.login;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.layoutapp.UI.DelivaryActivity;
import com.example.layoutapp.R;
import com.example.layoutapp.UI.SecondActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        findViewById(R.id.main_login_button).setOnClickListener(this);
        findViewById(R.id.main_signup_email_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_login_button:
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                break;

            case R.id.main_signup_email_button:
                startActivity(new Intent(MainActivity.this, DelivaryActivity.class));
        }
    }
}
