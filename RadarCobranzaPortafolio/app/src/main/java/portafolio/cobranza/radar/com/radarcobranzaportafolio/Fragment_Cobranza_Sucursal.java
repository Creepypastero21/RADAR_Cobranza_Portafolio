package portafolio.cobranza.radar.com.radarcobranzaportafolio;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_Cobranza_Sucursal extends Fragment {

    public Fragment_Cobranza_Sucursal() {
        // Required empty public constructor
    }
    public static Fragment_Cobranza_Sucursal newInstance() {
        Fragment_Cobranza_Sucursal fragment = new Fragment_Cobranza_Sucursal();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment__cobranza__sucursal, container, false);
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
