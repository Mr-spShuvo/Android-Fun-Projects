package com.droidgig.funnyfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private FactsBook mFactbook = new FactsBook();
    private ColorBook mColorbook = new ColorBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View Variables
        final TextView factLabel = (TextView) findViewById(R.id.Facts);
        Button nxtFactButton = (Button) findViewById(R.id.button);
        final RelativeLayout relLayout = (RelativeLayout) findViewById(R.id.activity_main);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactbook.getFact();
                factLabel.setText(fact);

                int color = mColorbook.getColor();
                relLayout.setBackgroundColor(color);

            }
        };
        nxtFactButton.setOnClickListener(listener);
    }
}
