package com.mantz_it.rfanalyzer;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class MyLocatoinProxy implements LocationListener {

    private Location myLocation = null;

    public MyLocatoinProxy(){
    }

    public Location getLocation() {
        return myLocation;
    }

    @Override
    public void onLocationChanged(Location location) {
        if (null == myLocation) {
            myLocation = new Location(location);
        }
        myLocation.set(location);
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
