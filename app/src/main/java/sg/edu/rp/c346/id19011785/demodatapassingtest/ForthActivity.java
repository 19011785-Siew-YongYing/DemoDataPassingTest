package sg.edu.rp.c346.id19011785.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForthActivity extends AppCompatActivity {

    TextView textV4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        textV4 = findViewById(R.id.textV4);
        Intent intReceived = getIntent();
        double db = intReceived.getDoubleExtra("db", 99.99);
        textV4.setText("Double value received is " + db);
    }
}