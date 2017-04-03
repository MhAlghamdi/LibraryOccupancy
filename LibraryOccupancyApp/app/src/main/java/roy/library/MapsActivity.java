package roy.library;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle("Occupancy");
        myToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.csusb:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.csusb.edu/")));
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    public void map1ButtonOnClick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://library.csusb.edu/documents/floorMaps/floor1.jpg")));
    }

    public void map2ButtonOnClick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://library.csusb.edu/documents/floorMaps/floor2.jpg")));
    }

    public void map3ButtonOnClick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://library.csusb.edu/documents/floorMaps/floor3.jpg")));
    }

    public void map4ButtonOnClick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://library.csusb.edu/documents/floorMaps/floor4.jpg")));
    }

    public void map5ButtonOnClick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://library.csusb.edu/documents/floorMaps/floor5.jpg")));
    }
}