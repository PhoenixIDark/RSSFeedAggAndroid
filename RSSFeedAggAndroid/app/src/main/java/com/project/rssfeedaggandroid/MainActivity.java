package com.project.rssfeedaggandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.SubMenu;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        SubMenu subMenu = navigationView.getMenu().findItem(R.id.navl_all).getSubMenu();
        subMenu.add("All");
        subMenu.add("Item 1");
        subMenu.add("Item 2");
        subMenu.add("Item 3");

        navigationView.setNavigationItemSelectedListener(this);


        //display the right navigation drawer
        displayRightNavigation();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if(drawer.isDrawerOpen(GravityCompat.END)){
            drawer.closeDrawer(GravityCompat.END);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id == R.id.action_settings) {
            drawer.openDrawer(GravityCompat.END);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.navl_today) {
            // Handle the camera action
        } else if (id == R.id.navl_readLater) {

        } else if (id == R.id.navl_explore) {

        } else if (id == R.id.navl_all) {

        } else if (id == R.id.navl_settings) {

        } else if (id == R.id.navl_log) {
            Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(MainActivity.this, "Handle from navigation left", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * this method used for displaying the right navigation drawer
     */
    private void displayRightNavigation(){
        final NavigationView navigationViewRight = (NavigationView) findViewById(R.id.nav_view_right);
        navigationViewRight.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.navr_explore) {

                } else if (id == R.id.navr_tech) {

                } else if (id == R.id.navr_gaming) {

                } else if (id == R.id.navr_film) {

                } else if (id == R.id.navr_cars) {

                } else if (id == R.id.navr_motos) {

                } else if (id == R.id.navr_anime) {

                } else if (id == R.id.navr_mangas) {

                } else if (id == R.id.navr_business) {

                } else if (id == R.id.navr_news) {

                } else if (id == R.id.navr_finance) {

                } else if (id == R.id.navr_education) {

                } else if (id == R.id.navr_culture) {

                } else if (id == R.id.navr_beauty) {

                } else if (id == R.id.navr_log) {
                    Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, "Handle from navigation right", Toast.LENGTH_SHORT).show();
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.END);
                return true;

            }
        });
    }
}
