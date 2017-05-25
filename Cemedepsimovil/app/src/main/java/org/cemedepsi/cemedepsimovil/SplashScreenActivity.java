package org.cemedepsi.cemedepsimovil;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.cemedepsi.cemedepsimovil.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreenActivity extends Activity {

    @BindView(R.id.imgVwLogoAnimate)
    ImageView imgVwLogoAnimate;
    @BindView(R.id.txtNameAPP)
    TextView txtNameAPP;
    @BindView(R.id.txtVersion)
    TextView txtVersion;

    private Animation rotateImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);
        setLabel();
        startAnimationLogo();
    }

    private void setLabel() {
        txtNameAPP.setText(Constants.APP.NAME_APP);
        txtVersion.setText(String.format(getString(R.string.app_version), Constants.APP.VERSION_APP));
    }

    private void startAnimationLogo() {
        rotateImage = AnimationUtils.loadAnimation(this, R.anim.rotate);
        rotateImage.reset();
        imgVwLogoAnimate.startAnimation(rotateImage);
    }

}
