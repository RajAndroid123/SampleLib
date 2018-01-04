package com.example.mylibrary;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rajshekhar on 1/2/2018.
 */

public class LogDebugger {
    public static void logDebug(){
        String logDebug = null;

        try {
            Process process = Runtime.getRuntime().exec("logcat -d");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            StringBuilder log=new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                log.append(line);
            }
            logDebug =log.toString();
            Log.d("LOGLIBRARY",logDebug);
        }
        catch (IOException e) {}


    }
    public static void logError(){
        String logError = null;

        try {
            Process process = Runtime.getRuntime().exec("logcat -e");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            StringBuilder log=new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                log.append(line);
            }
            logError =log.toString();
            Log.e("LOGLIBRARY",logError);
        }
        catch (IOException e) {}

    }
    public static void logInfo(){
        String logInfo = null;

        try {
            Process process = Runtime.getRuntime().exec("logcat -i");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            StringBuilder log=new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                log.append(line);
            }
            logInfo =log.toString();
            Log.i("LOGLIBRARY",logInfo);
        }
        catch (IOException e) {}


    }
}
