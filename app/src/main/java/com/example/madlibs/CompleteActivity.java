package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CompleteActivity extends AppCompatActivity {

    public static final String MY_ADJ = "adjective";
    public static final String MY_NOUN= "noun";
    public static final String MY_VERB = "verb";
    public static final String MY_NUM = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        Intent intent = getIntent();
        String myAdjStr = intent.getStringExtra(MY_ADJ);
        String myNounStr = intent.getStringExtra(MY_NOUN);
        String myVerbStr = intent.getStringExtra(MY_VERB);
        String myNumStr = intent.getStringExtra(MY_NUM);

        String strToDisplay = "I love " + myAdjStr + " " + myNounStr +
                " because it " + myVerbStr + " for " + myNumStr + " hours.";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);

    }


}
