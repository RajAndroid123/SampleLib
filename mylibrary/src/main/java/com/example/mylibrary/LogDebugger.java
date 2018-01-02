package com.example.mylibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rajshekhar on 1/2/2018.
 */

public class LogDebugger {
    public static String logDebug(){
        String s = null;

        try {
            Process process = Runtime.getRuntime().exec("logcat -d");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            StringBuilder log=new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                log.append(line);
            }
            s =log.toString();
        }
        catch (IOException e) {}
        return s;

    }
    public static String logError(){
        String s = null;

        try {
            Process process = Runtime.getRuntime().exec("logcat -e");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            StringBuilder log=new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                log.append(line);
            }
            s =log.toString();
        }
        catch (IOException e) {}
        return s;

    }
    public static String logInfo(){
        String s = null;

        try {
            Process process = Runtime.getRuntime().exec("logcat -i");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            StringBuilder log=new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                log.append(line);
            }
            s =log.toString();
        }
        catch (IOException e) {}
        return s;

    }
}
