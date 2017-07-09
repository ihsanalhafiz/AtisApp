package com.example.windows10.atisv3;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by Windows 10 on 6/20/2017.
 */
@ParseClassName("TLog")
public class TLog extends ParseObject {

    public int getTemperature(){
        return getInt("temperature");
    }

    public Date getCreateAt(){
        return getCreatedAt();
    }

}
