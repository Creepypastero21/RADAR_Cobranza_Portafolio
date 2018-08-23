package portafolio.cobranza.radar.com.radarcobranzaportafolio;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.clans.fab.FloatingActionMenu;

public class Fragment_Home extends Fragment {

    private FloatingActionMenu materialDesignFAM;
    private com.github.clans.fab.FloatingActionButton fabCobranza, fabPortafolio;

    public Fragment_Home() {
    }

    public static Fragment_Home newInstance() {
        Fragment_Home fragment = new Fragment_Home();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home, container, false);
        materialDesignFAM = (FloatingActionMenu) view.findViewById(R.id.material_design_android_floating_action_menu);
        fabCobranza = (com.github.clans.fab.FloatingActionButton) view.findViewById(R.id.fabCobranza);
        fabCobranza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction CambioFragment = getFragmentManager().beginTransaction();
                Fragment_Cobranza fragment_cobranza = new Fragment_Cobranza();
                CambioFragment.replace(R.id.Contenedor_Fragment, fragment_cobranza);
                CambioFragment.commit();
            }
        });

        fabPortafolio = (com.github.clans.fab.FloatingActionButton) view.findViewById(R.id.fabPortafolio);

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
