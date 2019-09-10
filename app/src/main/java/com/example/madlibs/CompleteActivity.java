package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
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
        /* I got the fading from https://developer.android.com/studio/write/vector-asset-studio */
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



        String strToDisplay = "One day, a person named " + myName + " built a time machine. " + myName + " decided to go " +
        myNum + " years into the future at the best place, " + myPlace + ". When " + myName + " arrived at " + myPlace + ", a " + myAnimal + " appeared and said 'It's about to happen!"
                + " You should get out of here!' " + myName + " " + myVerb + " and felt " + myAdj + ". " + myName + " decided to ignore the " + myAnimal + " and went to go explore. After " + myNum +
                 " minutes,  a "  + myNoun + " came out of nowhere and hit " + myName + " in the face. It began to rain " + myNoun + "s! " + myName + " started " + myVerb2 + "ing and saw the " +
                myAnimal + " standing inside a building. " + myName + " walked up to the " + myAnimal + " and asked him how he knew that " + myNoun + "s were going to fall from the sky. The " + myAnimal
                + " said that he was from the future!";
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



        String myMessage = "One day, a person named " + myName + " built a time machine. " + myName + " decided to go " +
                myNum + " years into the future at the best place, " + myPlace + ". When " + myName + " arrived at " + myPlace + ", a " + myAnimal + " appeared and said 'It's about to happen!"
                + " You should get out of here!' " + myName + " " + myVerb + " and felt " + myAdj + ". " + myName + " decided to ignore the " + myAnimal + " and went to go explore. After " + myNum +
                " minutes,  a "  + myNoun + " came out of nowhere and hit " + myName + " in the face. It began to rain " + myNoun + "s! " + myName + " started " + myVerb2 + "ing and saw the " +
                myAnimal + " standing inside a building. " + myName + " walked up to the " + myAnimal + " and asked him how he knew that " + myNoun + "s were going to fall from the sky. The " + myAnimal
                + " said that he was from the future!";


        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);

        String chooserTitle = getString(R.string.chooser);

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);

    }



}
