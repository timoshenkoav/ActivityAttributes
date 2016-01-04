package com.tunebrains.activityattributes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.text);
        TypedValue lTypedText = new TypedValue();

        getTheme().resolveAttribute(R.attr.TitleText, lTypedText, true);
        //check if we have value set
        if (lTypedText.resourceId != 0) {
            String title = getResources().getString(lTypedText.resourceId);
            text.setText(title);
        }
    }
}
