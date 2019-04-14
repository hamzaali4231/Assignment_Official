package com.example.u1763290.assignment_official;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by u1763290 on 12/04/2019.
 */

public class MapsFragment extends Fragment implements OnMapReadyCallback  {
    private GoogleMap mMap;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps,container,false);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Huddersfiled and move the camera
        //Range 20.0 - TOO BIG : 10.0 too small : 15.0 Just right. :-)
        mMap.moveCamera( CameraUpdateFactory.zoomTo( 15.0f ));

        LatLng uoh = new LatLng( 53.643136, -1.777231 );
        MarkerOptions mo = new MarkerOptions();
        mo.title( "The University of Hudderfield" );
        mo.position( uoh );
        mMap.addMarker( mo );
// Set the zoom
        mMap.moveCamera( CameraUpdateFactory.newLatLng( uoh ) );
    }
}
