package com.fasminelee;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class MainActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //addContentView(R.layout.activity_main);
        addPreferencesFromResource(R.xml.preference);
    }

}
