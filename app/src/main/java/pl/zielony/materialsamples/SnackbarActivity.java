package pl.zielony.materialsamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nineoldandroids.animation.Animator;

/**
 * Created by Marcin on 2014-12-15.
 */
public class SnackbarActivity extends Activity {
    private boolean invisible = false;
    private Animator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        final View snackbar = findViewById(R.id.snackbar);
        snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.setVisibility(View.INVISIBLE);
            }
        });
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.setVisibility(View.VISIBLE);
            }
        });
    }
}
