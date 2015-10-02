package criminalintent.android.bignerdranch.com.crimeinallntent;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zihua on 2015/10/2.
 */
public class CrimeListFragment extends ListFragment {

    private static final String TAG ="CrimeListFragment";
    private ArrayList<Crime> mCrimes;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("Crime");
        mCrimes = CrimeLab.get(getActivity()).getmCrimes();

        /*ArrayAdapter<Crime> adapter = new ArrayAdapter<Crime>(getActivity(),
                android.R.layout.simple_list_item_1,
                mCrimes);
        setListAdapter(adapter);*/
        CrimeAdapter adapter = new CrimeAdapter(mCrimes);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //Crime c = (Crime)getListAdapter().getItem(position);
        Crime c = ((CrimeAdapter)getListAdapter()).getItem(position);
        Log.d(TAG,c.getmTilte() + "was clicked");
    }

    private class CrimeAdapter extends ArrayAdapter<Crime>{

        public CrimeAdapter(ArrayList<Crime> crimes){
            super(getActivity(),0,crimes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null){

                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_crime,null);
            }
            Crime c = getItem(position);

            TextView titltTextView = (TextView)convertView.findViewById(R.id.crime_list_item_titleTextView);
            titltTextView.setText(c.getmTilte());
            TextView dateTextView = (TextView)convertView.findViewById(R.id.crime_list_item_dateTextView);
            dateTextView.setText(c.getmDate().toString());
            CheckBox solvedChexkBox = (CheckBox)convertView.findViewById(R.id.crime_list_item_solvedCheckBox);
            solvedChexkBox.setChecked(c.ismSolved());
            return convertView;
        }
    }
}
