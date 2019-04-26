package com.example.u1763290.assignment_official;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

/**
 * Created by u1763290 on 20/04/2019.
 */

public class InfoFragment extends Fragment {
    private static final String TAG = "InfoFragment";

    private TextView timer;
    private Button btn3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_info, container, false);
        /*timer= (TextView) rootview.findViewById(R.id.timer);
        btn3= (Button) rootview.findViewById(R.id.btn3);*/
        return rootview;
    }

    CountDownTimer countDownTimer = new android.os.CountDownTimer(100,0){
        @Override
        public void onTick(long millisUntilFinished) {
            long millis= millisUntilFinished;
            @SuppressLint("DefaultLocale") String hms= String.format("%02d:%02d:%02d",

                    TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
            );
            timer.setText(hms);
        }

        @Override
        public void onFinish() {

        }
    };
}

