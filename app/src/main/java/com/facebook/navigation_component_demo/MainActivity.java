package com.facebook.navigation_component_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Uri deepLinkUri = intent.getData();
        if (deepLinkUri != null && "http".equals(deepLinkUri.getScheme()) && "www.startfragment.com".equals(deepLinkUri.getHost())) {
            NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);
            navController.navigate(R.id.startFragment);
        }
    }


}
