package comp.yukkina.myapplication;


import android.preference.PreferenceActivity;

import android.os.Bundle;

public class ActivityTwo extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // загружаем предпочтения из ресурсов
        addPreferencesFromResource(R.xml.preference);
    }


}
