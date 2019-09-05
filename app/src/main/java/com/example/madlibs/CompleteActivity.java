package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CompleteActivity extends AppCompatActivity {


    public static final String MY_NAME = "name";
    public static final String MY_ADJ = "adjective";
    public static final String MY_NOUN= "noun";
    public static final String MY_VERB = "verb";
    public static final String MY_NUM = "number";
    public static final String MY_PLACE = "place";
    public static final String MY_ANIMAL= "animal";
    public static final String MY_VERB2 = "verb2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MY_NAME);
        String myAdj = intent.getStringExtra(MY_ADJ);
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myNum = intent.getStringExtra(MY_NUM);
        String myPlace = intent.getStringExtra(MY_PLACE);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myVerb2 = intent.getStringExtra(MY_VERB2);



        String strToDisplay = "One day a " + myAdj + " " + myNoun + " named " + myName + " built a time machine. " + myName + " decided to go to the year " +
        myNum + " at the best place, " + myPlace + ". When " + myName + " got to " + myPlace + ", a " + myAnimal + " " + myVerb + " and " + myName
                + " became more " + myAdj + ". " + myName + " " + myVerb2 + " and decided that going back in time was scary.";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);

    }


}
