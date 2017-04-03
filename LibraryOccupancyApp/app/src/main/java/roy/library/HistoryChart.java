package roy.library;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

/**
 * Created by muhannadalghamdi on 9/15/16.
 */
public class HistoryChart extends Activity {
    protected LineChart lineChart;

    public void generateLineChart(LineChart chart) {
        lineChart = chart;
        //lineChart = (LineChart) findViewById(R.id.chart2);
        LineDataSet dataset = new LineDataSet(getEntries(), "# of Calls");
        LineData data = new LineData(getLabels(), dataset);

        lineChart.setData(data);
        lineChart.setDescription("");
        lineChart.getLegend().setEnabled(false);
        lineChart.animateY(2000);

        dataset.setColors(ColorTemplate.LIBERTY_COLORS);
        dataset.setDrawFilled(true);
    }

    public ArrayList<Entry> getEntries() {
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(2f, 3));
        entries.add(new Entry(18f, 4));
        entries.add(new Entry(9f, 5));
        return entries;
    }

    public ArrayList<String> getLabels(){
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        return labels;
    }

    public void refrish(){
        lineChart.notifyDataSetChanged();
        lineChart.invalidate();
        lineChart.animateY(2000);
    }
}