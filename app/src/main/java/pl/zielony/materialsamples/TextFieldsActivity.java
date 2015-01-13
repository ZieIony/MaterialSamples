package pl.zielony.materialsamples;

import android.app.Activity;
import android.os.Bundle;

import pl.zielony.material.widget.OnValidateListener;
import pl.zielony.material.widget.ValidatedTextView;

/**
 * Created by Marcin on 2014-12-15.
 */
public class TextFieldsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textfields);

        ValidatedTextView textView = (ValidatedTextView) findViewById(R.id.longText);
        textView.setError("Text too short");
        textView.setOnValidateListener(new OnValidateListener() {
            @Override
            public boolean onValidate(String s) {
                if (s.length() < 10)
                    return false;
                return true;
            }
        });
    }
}
