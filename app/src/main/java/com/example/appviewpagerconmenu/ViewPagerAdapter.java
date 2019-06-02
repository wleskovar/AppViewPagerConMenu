package com.example.appviewpagerconmenu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> unaListaFragmentos;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        unaListaFragmentos = new ArrayList<>();
        unaListaFragmentos.add(new IzquierdoFragment());
        unaListaFragmentos.add(new CentroFragment());
        unaListaFragmentos.add(new DerechoFragment());
    }

    @Override
    public Fragment getItem(int i) {
        return unaListaFragmentos.get(i);
    }

    @Override
    public int getCount() {
        return unaListaFragmentos.size();
    }
}
