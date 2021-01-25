package com.example.biolink.view.fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;

import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.biolink.R;

import static android.content.ContentValues.TAG;


public class MainPageFragment extends Fragment {
private RelativeLayout mArian,mKamyab,mElahe,mArsham,mAmirali;
private ImageView mK,mA,mE,mAr,mAm;


    public MainPageFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(android.R.transition.move));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_page, container, false);
        findViews(view);
        setListener();
        return view;


    }
    private void findViews(View view){
        mArian=view.findViewById(R.id.arianBox);
        mKamyab=view.findViewById(R.id.kamyabBox);
        mElahe=view.findViewById(R.id.elaheBox);
        mArsham=view.findViewById(R.id.arshamBox);
        mAmirali=view.findViewById(R.id.amiraliBox);
        mK=view.findViewById(R.id.kamyabTanhaei);
        mA=view.findViewById(R.id.arianKarami);
        mAr=view.findViewById(R.id.arshamKhonasham);
        mE=view.findViewById(R.id.elaheShi);
        mAm=view.findViewById(R.id.amiralihariri);
    }
    private void setListener(){
        mArian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new ArianFragment())
                        .commit();

            }
        });
        mKamyab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KamyabFragment kB =new KamyabFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .addSharedElement(mK, ViewCompat.getTransitionName(mK))
                        .addToBackStack(TAG)
                        .replace(R.id.fragment_container,  kB)
                        .commit();

            }
        });
        mArsham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new ArshamFragment())
                        .commit();

            }
        });
        mElahe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new elaheFragment())
                        .commit();

            }
        });
        mAmirali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new AmiraliFragment())
                        .commit();

            }
        });
    }
}