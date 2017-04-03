package roy.library;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Highlight;

import java.util.ArrayList;

/**
 * Created by muhannadalghamdi on 9/15/16.
 */
public class WeekChart extends Activity implements OnChartValueSelectedListener {
    protected HorizontalBarChart barChart;

    public void generateHorizontalBarChart(HorizontalBarChart chart) {
        barChart = chart;
        //barChart = (HorizontalBarChart) findViewById(R.id.chart1);
        BarDataSet dataset = new BarDataSet(getEntries(), "# of Calls");
        BarData data = new BarData(getLabels(), dataset);

        barChart.setData(data);
        barChart.setOnChartValueSelectedListener(this);
        barChart.setDrawValueAboveBar(true);
        barChart.setPinchZoom(true);
        barChart.setDrawBarShadow(false);
        barChart.getLegend().setEnabled(false);
        barChart.getAxisRight().setDrawLabels(false);
        barChart.setDescription("");
        barChart.animateY(2000);
        //dataset.setColors(ColorTemplate.COLORFUL_COLORS);
    }

    public ArrayList<BarEntry> getEntries() {
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(2f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));
        return entries;
    }

    public ArrayList<String> getLabels() {
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        return labels;
    }

    public void refrish() {
        barChart.notifyDataSetChanged();
        barChart.invalidate();
        barChart.animateY(2000);
    }

    @Override
    public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {

    }

    @Override
    public void onNothingSelected() {

    }
}