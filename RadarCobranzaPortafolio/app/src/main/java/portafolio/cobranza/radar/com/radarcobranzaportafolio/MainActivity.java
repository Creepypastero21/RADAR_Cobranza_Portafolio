package portafolio.cobranza.radar.com.radarcobranzaportafolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;

import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    private Fragment_Home fragment_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment_home = new Fragment_Home();
        getSupportFragmentManager().beginTransaction().add(R.id.Contenedor_Fragment,fragment_home).commit();
    }

}
