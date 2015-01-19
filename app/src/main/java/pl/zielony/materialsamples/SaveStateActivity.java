package pl.zielony.materialsamples;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import pl.zielony.material.SaveState;

/**
 * Created by Marcin on 2015-01-17.
 */
public class SaveStateActivity extends pl.zielony.material.SaveStateActivity {

    public void setMyText(String myText) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(myText);
    }

    @SaveState
    public String getMyText() {
        EditText et = (EditText) findViewById(R.id.editText);
        return et.getText().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savestate);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyText(getMyText());
            }
        });
    }
}
