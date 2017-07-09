package com.example.windows10.atisv3;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Windows 10 on 6/19/2017.
 */

@ParseClassName("TLog")
public class Atis extends ParseObject {
    public String getObjectID(){
        return getString("objectId");
    }

    public void setObjectID(String objectid){
        put("objectId", objectid);
    }

    public String getProm(){
        return getString("from");
    }

    public void setProm(String from){
        put("from",from);
    }

    public Double getTemperature(){
        return getDouble("temperature");
    }

    public void setTemperature(Double suhu){
        put("temperature", suhu);
    }

    public String getDate(){
        return String.valueOf(getDate("createdAt"));
    }

    public void setDate(String tanggal){
        put("createdAt",tanggal);
    }
}
