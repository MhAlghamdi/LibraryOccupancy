package roy.library;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class OccupancyFragment extends Fragment implements GetRequest.AsyncResponseGET {
    TextView occup;
    TextView totalocc;

    public OccupancyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TextViews
        //occup = (TextView)findViewById(R.id.occupancy);
        //totalocc = (TextView)findViewById(R.id.totalOccupancy);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.occupancy, container, false);
    }


    @Override
    public void processFinish(String output) {
        try {
            String lines[] = output.split("\\r?\\n");
            String occupancy = lines[0];
            String totalOccupancy = lines[1];

            occup.setText(occupancy);
            totalocc.setText(totalOccupancy);
        } catch (IndexOutOfBoundsException e) { // Catching any server error has occurred and displaying an error message
            occup.setText("Error");
            totalocc.setText("Error");
        }
    }
}