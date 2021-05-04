package unicauca.edu.co.dulcespopayan;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    ArrayList<listDulces> listDulcesArrayList;
    RecyclerView recyclerView;

    /*private RecyclerView recyclerView;
    private adapterCard adapterCard;
    private List<listDulces> items;*/


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
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_sesion, R.id.nav_register, R.id.nav_dulces,R.id.mapsFragment1)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        /*HomeFragment homeFragment = new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.content,homeFragment).commit();*/

        listDulcesArrayList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerDulces);

        llenarDulces();
        adapterCard adapter = new adapterCard(listDulcesArrayList);
        recyclerView.setAdapter(adapter);
/*
        dulcesList();
        dulcesValues();*/




    }

 /*   private void dulcesList (){
        recyclerView = findViewById(R.id.recyclerDulces);
    }

    private void dulcesValues (){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        items = getItems();
        adapterCard = new adapterCard(items);
        recyclerView.setAdapter(adapterCard);
    }

    private List<listDulces> getItems(){
        List<listDulces> itemsList = new ArrayList<>();
        itemsList.add(new listDulces("Manjar blanco", "Estas son las mejores de popayan", R.drawable.iglesia));
        itemsList.add(new listDulces("Manjar blanco", "Estas son las mejores de popayan", R.drawable.iglesia));

        return itemsList;
    }*/


    private void llenarDulces() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listDulcesArrayList.add(new listDulces("Repollitas", "Estas son las mejores de popayan", R.drawable.arte));
        listDulcesArrayList.add(new listDulces("Manjar blanco", "Estas son las mejores de popayan", R.drawable.iglesia));
        listDulcesArrayList.add(new listDulces("Tamales", "Estas son las mejores de popayan", R.drawable.museo));

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


    public void Onclick(View view) {

    }
}


