package unicauca.edu.co.dulcespopayan.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import unicauca.edu.co.dulcespopayan.R;
import unicauca.edu.co.dulcespopayan.OnfragmentInteractionListener;

public class HomeFragment extends Fragment {

    Button buton;
    private OnfragmentInteractionListener mListener;

    public HomeFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);


        buton = root.findViewById(R.id.button);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.changeFragment(1);
                /*FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.content,nav_rutas.class,null);
                transaction.addToBackStack(null);
                transaction.commit();*/

            }
        });
        return root;



    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnfragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;

    }




}