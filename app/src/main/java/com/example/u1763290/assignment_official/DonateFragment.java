package com.example.u1763290.assignment_official;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
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
    EditText cardno;
    Button buy;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_donate,container,false);
        final EditText cardcheck1 =(EditText) rootView.findViewById(R.id.cardno);
        final EditText sortcheck1 =(EditText) rootView.findViewById(R.id.sortcode);
        final EditText cvvcheck1 =(EditText) rootView.findViewById(R.id.cvv);
        final EditText amountcheck1 =(EditText) rootView.findViewById(R.id.amount);
        Button buy = (Button) rootView.findViewById(R.id.buy);


            buy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String cardcehcker = cardcheck1.getText().toString();
                    String sortchecker = sortcheck1.getText().toString();
                    String cvvchecker = cvvcheck1.getText().toString();
                    String amountchecker = amountcheck1.getText().toString();
                    if (cardcehcker.trim().length() == 16)
                        if (sortchecker.trim().length() == 6)
                            if (cvvchecker.trim().length() == 3)
                                if(amountchecker.trim().length()>0){

                                {
                                    Intent in = new Intent(getActivity(), Donation_thankyou_activity.class);
                                    startActivity(in);
                                }

                            }


                }
            });
        return rootView;
    }
}
