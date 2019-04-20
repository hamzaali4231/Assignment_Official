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

import static com.example.u1763290.assignment_official.R.id.cardno;

/*
import com.braintreepayments.cardform.view.CardForm;
*/

/**
 * Created by u1763290 on 12/04/2019.
 */

public class DonateFragment extends Fragment {
    EditText cardno;
    Button buy;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_donate,container,false);
        EditText cardcheck1 =(EditText) rootView.findViewById(R.id.cardno);
        Button buy = (Button) rootView.findViewById(R.id.buy);


        String cardcehcker= cardcheck1.getText().toString();

        if (TextUtils.isEmpty(cardcehcker)){
            cardcheck1.setError("Please enter number");
            buy.setEnabled(false);
        }
        else {
            buy.setEnabled(true);
            buy.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent in = new Intent(getActivity(), Donation_thankyou_activity.class);
                    startActivity(in);

                }
            });

            return rootView;
        }
        return rootView;
    }
}
