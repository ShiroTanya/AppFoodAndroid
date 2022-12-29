package com.example.appfood.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import com.example.appfood.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mMap;
    SupportMapFragment mapFragment;
    Spinner sp_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        addControls();
        addEvents();
    }

    public void addEvents() {
        sp_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,int position, long l) {
                switch (position) {
                    case 0:
                        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                        break;
                    case 1:
                        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                        break;
                    case 2:
                        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                        break;
                    case 3:
                        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void addControls() {
        sp_spinner = findViewById(R.id.spinnerMap);

        ArrayList<String> ds_StyleMap = new ArrayList<>();
        ds_StyleMap.add("Bản đồ hàng không");
        ds_StyleMap.add("Bản đồ địa hình");
        ds_StyleMap.add("Bản đồ vệ tinh");
        ds_StyleMap.add("Bản đồ 2D thường");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ds_StyleMap);
        sp_spinner.setAdapter(arrayAdapter);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        LatLng latLng1 = new LatLng(10.855859286912773, 106.78498468003903);
        LatLng latLng2 = new LatLng(10.801817728334006, 106.71438079538169);
        LatLng latLng3 = new LatLng(10.84105045155475, 106.80885739538193);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("Vị trí nhà hàng");
        markerOptions.position(latLng1);
        mMap.addMarker(markerOptions);
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng1, 50);



        mMap.animateCamera(cameraUpdate);
        mMap.getUiSettings().setCompassEnabled(true);
        //lay vi tri hien tai
      mMap.getUiSettings().setMyLocationButtonEnabled(true);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);

        //Bat nut zoom
        mMap.getUiSettings().setZoomControlsEnabled(true);

        //Tao vi tri

//        //Ve Polyline
//        PolylineOptions polylineOptions = new PolylineOptions()
//                .add(latLng1).add(latLng2).add(latLng3)
//                .color(Color.RED)
//                .width(30);
//        //Noi cac Polyline
//        Polyline polyline = mMap.addPolyline(polylineOptions);
//        Circle circle = mMap.addCircle(new CircleOptions().center(latLng1).radius(50).fillColor(Color.GREEN).strokeColor(Color.BLUE));
//        Circle circle2 = mMap.addCircle(new CircleOptions().center(latLng2).radius(50).fillColor(Color.GREEN).strokeColor(Color.BLUE));
//        Circle circle3 = mMap.addCircle(new CircleOptions().center(latLng3).radius(50).fillColor(Color.GREEN).strokeColor(Color.BLUE));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng1,15));

    }
}