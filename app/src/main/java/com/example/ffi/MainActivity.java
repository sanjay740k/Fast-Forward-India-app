package com.example.ffi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;

import com.example.ffi.bloodline.BloodlineActivity;
import com.example.ffi.disha.DishaActivity;
import com.example.ffi.escapejagriti.EscapeJagritiActivity;
import com.example.ffi.ui.about.AboutFragment;
import com.example.ffi.ui.gallery.GalleryFragment;
import com.example.ffi.umeed.UmeedActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ImageView imv_ani;
    Fragment fragment;
    Class fragmentClass;
    Intent intentlogout,intentEvent;



    public void bloodlineon(View view){
        Intent bloodlineintent = new Intent(MainActivity.this, BloodlineActivity.class);
        startActivity(bloodlineintent);
    }
    public void escapejagrition(View view){
        Intent escapeintent = new Intent(MainActivity.this , EscapeJagritiActivity.class);
        startActivity(escapeintent);
    }
    public void dishaon(View view){
        Intent jagratiintent = new Intent(MainActivity.this , DishaActivity.class);
        startActivity(jagratiintent);
    }
    public void umeedon(View view){
        Intent dishaintent = new Intent(MainActivity.this , UmeedActivity.class);
        startActivity(dishaintent);
    }

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentEvent = new Intent(MainActivity.this, Events.class);
                startActivity(intentEvent);
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_about )
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);



        imv_ani = (ImageView)findViewById(R.id.imageViewAni);
        imv_ani.animate().alpha(0.0f).setDuration(2000);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.facebook) {

            Intent fbin = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/FastForwardIndia/"));
            startActivity(fbin);
        }else if(id == R.id.instagram){

            Intent instain = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ffichanginglives/"));
            startActivity(instain);
        }else if(id == R.id.youtube) {

            Intent youtunbein = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC82rG77tucniOFDPA-3Ue0Q"));
            startActivity(youtunbein);
        }else if(id == R.id.logout){
            FirebaseAuth.getInstance().signOut();
            intentlogout = new Intent(getApplicationContext(),LoginActivity.class);
            //intentlogout.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intentlogout);
            finish();
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        fragment = null;
        fragmentClass = null;

        if (id == R.id.nav_home){

        }
        else if (id == R.id.nav_gallery){
            fragmentClass = GalleryFragment.class;
        }
        else if(id == R.id.nav_about){
            fragmentClass = AboutFragment.class;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_main, fragment).commit();


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
