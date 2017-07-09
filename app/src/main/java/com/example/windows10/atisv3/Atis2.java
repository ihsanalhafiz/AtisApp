package com.example.windows10.atisv3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class Atis2 extends Fragment {


    public Atis2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_atis2, container, false);
        //TextView today = (TextView) view.findViewById(R.id .textView3);
        //TextView beforetoday = (TextView) view.findViewById(R.id.textView2);

        Calendar cal = new GregorianCalendar();
        Date todayy = cal.getTime();
        //today.setText(todayy.toString());

        cal.add(Calendar.DAY_OF_MONTH,-2);
        Date beforetodayy = cal.getTime();

        //beforetoday.setText(beforetodayy.toString());

        return view;
    }

}
