package net.zdome.cs371.epp.nameclassdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Color;

public class MainActivity extends Activity {

private TextView advise;
private Button panicButton;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        advise = (TextView)findViewById(R.id.advise);
        panicButton  = (Button)findViewById(R.id.PanicButton);
        panicButton.setOnClickListener(new PanicButtonListener());
        /*
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {}
        });
        */
    }

    private class PanicButtonListener implements View.OnClickListener{
        public void onClick(View v)
        {
            advise.setTextColor(Color.RED);
        }
    }

}
