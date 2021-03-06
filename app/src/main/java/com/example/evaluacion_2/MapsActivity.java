package com.example.evaluacion_2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.evaluacion_2.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    //define la posicion en el mapa segun marcador
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // efinimos en lat y long la posicion de la persona.
        LatLng app = new LatLng(-33.49884238624999, -70.61634968893736);
        mMap.addMarker(new MarkerOptions().position(app).title("Ubicados en santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(app));
    }
}