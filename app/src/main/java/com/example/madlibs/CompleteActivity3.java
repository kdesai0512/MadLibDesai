package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CompleteActivity3 extends AppCompatActivity {


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
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
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



        String strToDisplay = myNum + " years ago, my parents and I went on a cruise to " + myPlace + ". " +
                "Although I was " + myAdj + " to go at the beginning, we had an amazing time! When we got there, I made a friend" +
                " named " + myName + ". " + myName + " and I did everything together! " + " We " + myVerb + " during lunch and would eat " +
                "dinner together. Once, we looked down into the water and saw a " + myAnimal + "! But the weird thing is, a few months after" +
                " the cruise, my parents and I were " + myVerb2 + "ing and I asked them about " + myName + ". They told me that there was " +
                "never a kid named " + myName + " on the cruise, but there was a story about a " + myNoun + " that lived on a cruise in " + myPlace + ". It turns " +
                "out that I may have been hanging out with a " + myNoun + "! ";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);

    }

    public void shareInfo(View v) {

        Intent intent = new Intent();
        String myName = intent.getStringExtra(MY_NAME);
        String myAdj = intent.getStringExtra(MY_ADJ);
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myNum = intent.getStringExtra(MY_NUM);
        String myPlace = intent.getStringExtra(MY_PLACE);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myVerb2 = intent.getStringExtra(MY_VERB2);



        String myMessage = myNum + " years ago, my parents and I went on a cruise to " + myPlace + ". " +
                "Although I was " + myAdj + " to go at the beginning, we had an amazing time! When we got there, I made a friend" +
                " named " + myName + ". " + myName + " and I did everything together! " + " We " + myVerb + " during lunch and would eat " +
                "dinner together. Once, we looked down into the water and saw a " + myAnimal + "! But the weird thing is, a few months after" +
                " the cruise, my parents and I were " + myVerb2 + "ing and I asked them about " + myName + ". They told me that there was " +
                "never a kid named " + myName + " on the cruise, but there was a story about a " + myNoun + " that lived on a cruise in " + myPlace + ". It turns " +
                "out that I may have been hanging out with a " + myNoun + "! ";


        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);

        String chooserTitle = getString(R.string.chooser);

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);

    }


}
