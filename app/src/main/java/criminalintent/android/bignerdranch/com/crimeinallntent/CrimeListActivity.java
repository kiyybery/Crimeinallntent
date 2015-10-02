package criminalintent.android.bignerdranch.com.crimeinallntent;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * Created by zihua on 2015/10/2.
 */
public class CrimeListActivity extends SignleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
