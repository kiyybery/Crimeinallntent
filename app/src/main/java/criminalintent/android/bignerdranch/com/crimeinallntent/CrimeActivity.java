package criminalintent.android.bignerdranch.com.crimeinallntent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.FragmentContiner);
        if(fragment == null){
            fragment = new CrimeListFragment();
            fm.beginTransaction().add(R.id.FragmentContiner,fragment).commit();
        }
    }
}
