package com.silho.ideo.clockwidget.settings;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;


import com.silho.ideo.clockwidget.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        if(toolbar != null){
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    NavUtils.navigateUpFromSameTask(SettingsActivity.this);
                }
            });
        }

        SettingsFragment settingsFragment = new SettingsFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container_frag, settingsFragment).commit();
    }

}
