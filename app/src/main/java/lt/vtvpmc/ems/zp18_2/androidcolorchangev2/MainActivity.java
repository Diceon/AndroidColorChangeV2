package lt.vtvpmc.ems.zp18_2.androidcolorchangev2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGreen;
    Button btnRed;
    Button btnBlue;
    Button btnYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGreen = (Button) findViewById(R.id.buttonColorGreen);
        btnRed = (Button) findViewById(R.id.buttonColorRed);
        btnBlue = (Button) findViewById(R.id.buttonColorBlue);
        btnYellow = (Button) findViewById(R.id.buttonColorYellow);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.colorGreenLayout).setBackgroundColor(getResources().getColor(R.color.colorGreen));
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.colorRedLayout).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.colorBlueLayout).setBackgroundColor(getResources().getColor(R.color.colorBlue));
            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.colorYellowLayout).setBackgroundColor(getResources().getColor(R.color.colorYellow));
            }
        });

    }
}
