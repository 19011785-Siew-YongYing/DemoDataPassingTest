package sg.edu.rp.c346.id19011785.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textVAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textVAns = findViewById(R.id.tView2);
        Intent intentReceived = getIntent();
        char character = intentReceived.getCharExtra("character", 'a');
        textVAns.setText("Character value received is: " + character);
    }
}