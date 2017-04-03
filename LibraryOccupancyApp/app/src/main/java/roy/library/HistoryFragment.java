package roy.library;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.charts.LineChart;

public class HistoryFragment extends Fragment {
    HistoryChart chart = new HistoryChart();
    protected LineChart line;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        line = (LineChart) view.findViewById(R.id.chart2);
        chart.generateLineChart(line);
        return view;
    }
}
