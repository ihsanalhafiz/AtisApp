package com.example.windows10.atisv3;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Date;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseQuery;


/**
 * A simple {@link Fragment} subclass.
 */
public class GrafikMonitor extends Fragment {

    ArrayList<String> xAxis = new ArrayList<>();
    ArrayList<Entry> yAxisAtis1 = new ArrayList<>();
    //ArrayList<Entry> yAxisAtis2 = new ArrayList<>();
    ArrayList<ILineDataSet> lineDataSets1 = new ArrayList<>();
    //ArrayList<ILineDataSet> lineDataSets2 = new ArrayList<>();

    public GrafikMonitor() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view = (LinearLayout) inflater.inflate(R.layout.fragment_grafik_monitor, container, false);

        LineChart grafik_utama = (LineChart) view.findViewById(R.id.grafik_utama);

        xAxis.add("Monday");
        xAxis.add("Tuesday");
        xAxis.add("Wednesdat");
        xAxis.add("Thursday");
        xAxis.add("Friday");
        xAxis.add("Saturday");


        yAxisAtis1.add(new Entry(0,10));
        yAxisAtis1.add(new Entry(1,50));
        yAxisAtis1.add(new Entry(2,40));
        yAxisAtis1.add(new Entry(3,60));
        yAxisAtis1.add(new Entry(4,20));
        yAxisAtis1.add(new Entry(5,30));

        final String[] xaxes = new String[xAxis.size()];

        for (int i = 0; i < xAxis.size(); i++) {
            xaxes[i] = xAxis.get(i).toString();
        }

        LineDataSet lineDataSet1 = new LineDataSet(yAxisAtis1, "values");
        //LineDataSet lineDataSet2 = new LineDataSet(yAxisAtis2, "Atis 2");

        lineDataSet1.setDrawCircles(true);
        lineDataSet1.setColor(Color.BLUE);
        //lineDataSet2.setDrawCircles(true);
        //lineDataSet2.setColor(Color.RED);

        lineDataSets1.add(lineDataSet1);
        //lineDataSets2.add(lineDataSet2);
        LineData lineData = new LineData(lineDataSets1);

        grafik_utama.setData(lineData);
        //grafik_utama.setData(new LineData(xaxes,lineDataSets2));
        IAxisValueFormatter formatter = new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return xaxes[(int) value];
            }
            //@Override
            public int getDecimalDigits(){
                return 0;
            }
        };

        XAxis xAxis = grafik_utama.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setValueFormatter(formatter);

        grafik_utama.setTouchEnabled(true);
        grafik_utama.setDragEnabled(true);
        grafik_utama.invalidate();
        return view;
    }

    }

