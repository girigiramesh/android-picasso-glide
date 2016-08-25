package com.picasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    private ImageView image, imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        picasso();
        glide();

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with Your Own Action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    //==================picasso======================

    private void picasso() {
        image = (ImageView) findViewById(R.id.image);
        String picasso_url = "http://www.cfau-pd.net/images/android-wallpapers-hd/android-wallpapers-hd-4.jpg";

        Picasso.with(image.getContext())
                .load(picasso_url)
                .placeholder(R.drawable.team)
//              .fit()
                .resize(150, 50)//resizing the image
                .centerCrop()
                .into(image);

    }

    //==================glide==========================

    private void glide() {
        imageView = (ImageView) findViewById(R.id.imageView);
        String glide_url = "http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg";

        Glide.with(imageView.getContext())
                .load(glide_url)
                .override(150, 50)//resizing the image
                .into(imageView);
    }
}