package com.example.jeanfernandes.meutreino;

import android.graphics.BitmapFactory;
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
import android.widget.ListView;

import com.example.jeanfernandes.meutreino.adapters.MusculosAdapter;
import com.example.jeanfernandes.meutreino.models.Musculos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ListView listMusc;

    private void preencherLista(){
        List<Musculos> list = new ArrayList<Musculos>();
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_abd), "abdomem"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_antebraco), "antebraco"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_biceps), "biceps"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_corpo), "corpo"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_costas), "costas"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_ombros), "ombros"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_panturr), "panturrilha"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_peito), "peito"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_pernas), "pernas"));
        list.add(new Musculos(BitmapFactory.decodeResource(getResources(), R.drawable.icon_triceps), "triceps"));
        MusculosAdapter adapter = new MusculosAdapter(this, list);
        this.listMusc.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        this.listMusc = (ListView)findViewById(R.id.list);
        this.preencherLista();
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

        if (id == R.id.nav_treino) {
            // Handle the camera action
        } else if (id == R.id.nav_treino) {

        } else if (id == R.id.nav_calendar) {

        } else if (id == R.id.nav_grapfi) {

        } else if (id == R.id.nav_hist) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
