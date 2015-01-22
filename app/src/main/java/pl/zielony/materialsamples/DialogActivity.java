package pl.zielony.materialsamples;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import pl.zielony.material.beta.Window;
import pl.zielony.material.widget.Button;
import pl.zielony.material.widget.TextView;

/**
 * Created by Marcin on 2015-01-20.
 */
public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        Window window = new Window(this);
        TextView textView = new TextView(this);
        textView.setText("Hello, this is my first dialog!");
        window.setContentView(textView);
        window.setTitle("Hello world!");
        window.show();
    }
}
