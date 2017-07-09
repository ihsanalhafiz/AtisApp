package com.example.windows10.atisv3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Atis1 extends Fragment {

    double perantarasuhu;
    public Atis1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ParseObject.registerSubclass(TLog.class);
        Parse.initialize(new Parse.Configuration.Builder(getActivity())
                .applicationId("9dsd8pJJ9HzC3WHLuwVGGGEp1yykbbz6bmWT92a6")
                .clientKey("QFTvMGIVXZmyXJflO4CumFakFCPogVdMR4GURzOd")
                .server("https://parseapi.back4app.com/").build()
        );

        View view  = (LinearLayout)inflater.inflate(R.layout.fragment_atis1, container, false);
        //ListView listView = (ListView)view.findViewById(R.id.listview);
        TextView textView = (TextView)view.findViewById(R.id.textView4);
        final TextView suhuAtis1 = (TextView)view.findViewById(R.id.SuhuAtis1);


        final ParseQuery<ParseObject> suhuatis1 = ParseQuery.getQuery("TLog");
        suhuatis1.whereEqualTo("idDevice", 1 );
        //suhuatis1.orderByAscending("createdAt");
        suhuatis1.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {

            }
        });
        //perantarasuhu
        String stringsuhu = String.valueOf(perantarasuhu);
        suhuAtis1.setText(stringsuhu);
        return view;
    }

}
