package com.example.u1763290.assignment_official;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/*
import com.braintreepayments.cardform.view.CardForm;
*/


public class DonateFragment extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_donate,container,false);
        Button buy = rootView.findViewById(R.id.buy);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cardcehcker = ((EditText) rootView.findViewById(R.id.cardno)).getText().toString();
                String sortchecker = ((EditText) rootView.findViewById(R.id.sortcode)).getText().toString();
                String cvvchecker = ((EditText) rootView.findViewById(R.id.cvv)).getText().toString();
                String amountchecker = ((EditText) rootView.findViewById(R.id.amount)).getText().toString();

                if (cardcehcker.trim().length() == 16 && sortchecker.trim().length() == 6 &&
                        cvvchecker.trim().length() == 3 && amountchecker.trim().length()>0){
                    {
                        Intent in = new Intent(getActivity(), Donation_thankyou_activity.class);
                        startActivity(in);
                    }}
                else{
                    Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;
    }
}