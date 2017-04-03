package roy.library;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Highlight;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeekFragment extends Fragment implements OnChartValueSelectedListener {
    TextView max;
    TextView min;
    TextView maxDate;
    TextView minDate;

    WeekChart chart = new WeekChart();
    protected HorizontalBarChart barChart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_week, container, false);

        max = (TextView) view.findViewById(R.id.maxView);
        min = (TextView) view.findViewById(R.id.minView);
        maxDate = (TextView) view.findViewById(R.id.textViewMax);
        minDate = (TextView) view.findViewById(R.id.textViewMin);

        barChart = (HorizontalBarChart) view.findViewById(R.id.chart1);
        chart.generateHorizontalBarChart(barChart);
        return view;
    }

    @Override
    public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
        //Toast.makeText(WeekFragment.this, e.getVal() + " occupancy on " + e.getXIndex(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected() {
    }
}
