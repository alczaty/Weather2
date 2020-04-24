package com.aty.weather2;

import android.Manifest;
import android.content.pm.PackageManager;
import androidx.core.app.ActivityCompat;


public class Permisions {
    static int PERMISSION_ID =44;
    public static boolean checkPermissions(MainActivity itsObject){

        if (ActivityCompat.checkSelfPermission(itsObject, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){

            return false;
        }
        return true;
    }
    public static void requestPermissions(MainActivity itsObject){
        ActivityCompat.requestPermissions(itsObject, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, PERMISSION_ID);
    }
}
