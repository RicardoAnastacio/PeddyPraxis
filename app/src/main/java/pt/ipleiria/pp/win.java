package pt.ipleiria.pp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.facebook.shimmer.ShimmerFrameLayout;


public class win extends AppCompatActivity {

    ShimmerFrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_icon);

        Animation animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
        container = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container1);
        container.startAnimation(animRotate);
        container.startShimmer();

        Thread gameOverThread = new Thread() {
            @Override
            public void run() {
                try {
                    super.run();

                    sleep(5000);

                } catch (Exception e) {

                } finally {

        Intent myIntent = new Intent(win.this, MainActivity.class);
        startActivity(myIntent);
        finish();

                }
            }
        };
        gameOverThread.start();


    }

}
