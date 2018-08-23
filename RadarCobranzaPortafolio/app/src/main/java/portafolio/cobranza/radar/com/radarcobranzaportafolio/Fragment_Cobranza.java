package portafolio.cobranza.radar.com.radarcobranzaportafolio;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.github.clans.fab.FloatingActionMenu;

public class Fragment_Cobranza extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    public Fragment_Cobranza() {
    }

    public static Fragment_Cobranza newInstance() {
        Fragment_Cobranza fragment = new Fragment_Cobranza();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_cobranza, container, false);
        BottomNavigationView navigation = (BottomNavigationView) view.findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        FragmentTransaction CambioFragment = getFragmentManager().beginTransaction();
                        Fragment_Home Fragment_Home = new Fragment_Home();
                        CambioFragment.replace(R.id.Contenedor_Fragment, Fragment_Home);
                        CambioFragment.commit();
                        return true;
                }
                return false;
            }
        });
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
