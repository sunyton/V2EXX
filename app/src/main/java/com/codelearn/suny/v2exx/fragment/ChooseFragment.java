package com.codelearn.suny.v2exx.fragment;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codelearn.suny.v2exx.Bean.LastestBean;
import com.codelearn.suny.v2exx.Bean.TPComment;
import com.codelearn.suny.v2exx.R;
import com.codelearn.suny.v2exx.adapter.MyDecoration;
import com.codelearn.suny.v2exx.adapter.MyRVAdapter;
import com.codelearn.suny.v2exx.api.RetroUtils;
import com.codelearn.suny.v2exx.api.V2exService;
import com.codelearn.suny.v2exx.database.DBUtils;
import com.codelearn.suny.v2exx.database.DatebaseHlper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by suny on 2017/5/19.
 */

public class ChooseFragment extends Fragment {

    private List<LastestBean> mLastestBeenList;
    private RecyclerView recyclerView;
    private MyRVAdapter adapter;
    private LinearLayoutManager mLinearLayoutManager;
    private Map<String, List<TPComment>> mStringListMap = new ArrayMap<>();
    private String node_name;


    public static ChooseFragment newInstance(String node_name) {
        Bundle bundle = new Bundle();
        bundle.putString("node_name", node_name);
        ChooseFragment fragment = new ChooseFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            node_name = bundle.getString("node_name");
            Log.i("node_name: ", node_name);
        }
        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLinearLayoutManager);
        recyclerView.setHasFixedSize(true);
//        initLast();
        initLast();
//        getLL();

        return view;
    }

    private void initLast() {

        RetroUtils.getNode(node_name, new Callback<List<LastestBean>>() {
            @Override
            public void onResponse(Call<List<LastestBean>> call, Response<List<LastestBean>> response) {
                Log.i("第二个", node_name);
                mLastestBeenList = response.body();
                Log.i("hehe: ", mLastestBeenList.toString());
                MyRVAdapter adapter = new MyRVAdapter(getActivity(), mLastestBeenList);
                recyclerView.setAdapter(adapter);
                recyclerView.addItemDecoration(new MyDecoration());

            }

            @Override
            public void onFailure(Call<List<LastestBean>> call, Throwable t) {

            }
        });
    }

}
