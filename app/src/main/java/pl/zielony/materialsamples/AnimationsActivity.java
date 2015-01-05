package pl.zielony.materialsamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nineoldandroids.animation.Animator;

import pl.zielony.material.animation.AnimUtils;
import pl.zielony.material.animation.DefaultAnimatorListener;

/**
 * Created by Marcin on 2014-12-15.
 */
public class AnimationsActivity extends Activity {
    private boolean invisible = false;
    private Animator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

        final View fabLayout = (View) findViewById(R.id.fabLayout);
        Button button = (Button) findViewById(R.id.animateButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(animator!=null)
                    animator.cancel();
                if(invisible){
                    animator = AnimUtils.popIn(fabLayout, new DefaultAnimatorListener() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            invisible = false;
                            animator = null;
                        }
                    });
                }else {
                    animator = AnimUtils.popOut(fabLayout, new DefaultAnimatorListener() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            invisible = true;
                            animator = null;
                        }
                    });
                }
            }
        });
    }
}
