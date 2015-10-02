package criminalintent.android.bignerdranch.com.crimeinallntent;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by zihua on 2015/10/2.
 */
public abstract class SignleFragmentActivity extends FragmentActivity{

    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.FragmentContiner);
        if(fragment == null){
            fragment = createFragment();
            fm.beginTransaction().add(R.id.FragmentContiner,fragment).commit();
        }
    }
}
