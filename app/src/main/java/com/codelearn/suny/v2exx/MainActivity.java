package com.codelearn.suny.v2exx;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.codelearn.suny.v2exx.fragment.ChooseFragment;

public class MainActivity extends AppCompatActivity {

    private Spinner mSpinner;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private ChooseFragment lastFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//初始化spinner
        initSpinner();
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
//        lastFragment = new ChooseFragment();
        ChooseFragment lastFragment = ChooseFragment.newInstance("jobs");
        mFragmentTransaction.add(R.id.fragment, lastFragment);
        mFragmentTransaction.commit();


    }




/*
初始化spinner，设置监听，用于选择node节点
 */
    public void initSpinner() {

        String[] strings = getResources().getStringArray(R.array.node_default);

        mSpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, strings);
        mSpinner.setAdapter(adapter);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
