package roy.library;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
            case R.id.about:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("CSUSB Library Study Space lets you reserve a study room " +
                        "(Group Study Room, Individual Study Carrel, Multimedia Collaboration Room)" +
                        " from CSUSB's Pfau Library! Here's the process:\n\n1) Select a study room.\n\n2)" +
                        " Select a day and hour slot from the calendar.\n\n3) Submit your booking details" +
                        " (name, school email, public booking label).\n\n4) Within 15 minutes of making your" +
                        " reservation, open the confirmation email that was sent to your inbox.\n\n5) " +
                        "Your reservation is complete! Keep your final confirmation email as your proof of booking and bring it with you.")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                AlertDialog helpPopUp = builder.create();
                helpPopUp.show();
                return true;
            case R.id.refresh:
                super.onRestart();
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
                finish();

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    public void occupancyButtonOnClick(View view) {
        Intent myIntent = new Intent(MainActivity.this, OccupancyActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void reserveButtonOnClick(View view) {
        Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void mapsButtonOnClick(View view) {
        Intent myIntent = new Intent(MainActivity.this, MapsActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}