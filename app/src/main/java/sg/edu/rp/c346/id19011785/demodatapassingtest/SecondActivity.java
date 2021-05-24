package sg.edu.rp.c346.id19011785.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Step 1
    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAns = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        char character = intentReceived.getCharExtra("character", 'z');
        double db = intentReceived.getDoubleExtra("db", 0.0);
        tvAns.setText("Integer value received is: " + value
                        + "\nCharacter value received is: " + character
                        + "\n Double value received is: " + db);

    }
}