package xyz.ruoxue.animator;

import android.animation.ObjectAnimator;
import android.view.Menu;
import android.view.MenuItem;

import xyz.ruoxue.animator.customeView.CircleView;

public class MainActivity extends BaseActivity {


    private CircleView cv_home;

    @Override
    protected void initView() {
        cv_home = $(R.id.cv_home);

    }

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_rotation:
                startRotation("rotation");
                break;
            case R.id.menu_rotationx:
                startRotation("rotationX");
                break;
            case R.id.menu_rotationy:
                startRotation("rotationY");
                break;
        }



        return true;
    }

    private void startRotation(String rotation) {
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(cv_home, rotation, 0f, 360f);
        objectAnimator.setDuration(1000);

        objectAnimator.setRepeatCount(-1);
        objectAnimator.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;
    }
}
