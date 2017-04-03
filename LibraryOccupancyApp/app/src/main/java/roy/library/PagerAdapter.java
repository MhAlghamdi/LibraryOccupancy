package roy.library;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;

        switch (position){
            case 0:
                frag = new OccupancyFragment();
                break;
            case 1:
                frag = new WeekFragment();
                break;
            case 2:
                frag = new HistoryFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title=" ";
        switch (position){
            case 0:
                title = "Occupancy";
                break;
            case 1:
                title = "Last 7 Days";
                break;
            case 2:
                title = "History";
                break;
        }

        return title;
    }
}
