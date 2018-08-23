package portafolio.cobranza.radar.com.radarcobranzaportafolio;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new Fragment_Cobranza_Nacional();
        }
        else if(position == 1) {
            fragment = new Fragment_Cobranza_Zonal();
        }
        else {
            fragment = new Fragment_Cobranza_Sucursal();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)  {
            title = "Nacional";
        } else if(position == 1) {
            title = "Zonal";
        }else
            title = "Sucursal";
        return title;
    }
}