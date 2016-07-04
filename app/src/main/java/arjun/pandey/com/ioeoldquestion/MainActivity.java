package arjun.pandey.com.ioeoldquestion;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] name = {"Civil","Electronics and Communication", "Computer","Architecture","CSIT"};
        int icons[] = {R.mipmap.civil,R.mipmap.electronics,R.mipmap.computer,R.mipmap.architecture,R.mipmap.csit};
        List<Faculty> facultyList = new ArrayList<>();
        for(int i = 0; i<name.length; i++){
            facultyList.add(new Faculty(name[i], icons[i]));
        }
        ListAdapter nameadapter = new ChooseFaculty(this,facultyList);
        ListView nameview = (ListView) findViewById(R.id.listview);
        nameview.setAdapter(nameadapter);

        nameview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String names = String.valueOf(parent.getItemAtPosition(position));

                switch (position){
                    case 0:
                        startActivity(new Intent(MainActivity.this,CivilEngineering.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,ElectronicsEngineering.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,ComputerEngineering.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,Architecture.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this,CSIT.class));
                        break;
                    default:
                        break;


                }

            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Search Subject", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Toast.makeText(MainActivity.this,"This app is in underdevelopment",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_gallery) {
            Toast.makeText(MainActivity.this,"This app is in underdevelopment",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_slideshow) {
            Toast.makeText(MainActivity.this,"This app is in underdevelopment",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_manage) {
            Toast.makeText(MainActivity.this,"This app is in underdevelopment",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_share) {
            Toast.makeText(MainActivity.this,"This app is in underdevelopment",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_send) {
            Toast.makeText(MainActivity.this,"This app is in underdevelopment",Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.about) {
            Toast.makeText(MainActivity.this,"I am arjun Pandey. I am developing this app",Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
