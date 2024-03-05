package com.example.animation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        ImageView imageView = (ImageView) findViewByID(R.id.imageView);
        imageView.setBackgraundResourse(R.drawable.animation_droid);

        AnimationDrawable animation = (AnimationDrawable) imageView.getBackgraund();

        //animation.start();
       // animation.stop();


        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            @Override
            public void onClick(View view) {
                if (animation.isRunning())
                {
                    animation.stop();
                }
                else
                {
                    animation.start();
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}