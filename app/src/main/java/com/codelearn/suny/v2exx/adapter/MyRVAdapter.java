package com.codelearn.suny.v2exx.adapter;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.codelearn.suny.v2exx.Bean.LastestBean;
import com.codelearn.suny.v2exx.Bean.TPComment;
import com.codelearn.suny.v2exx.R;
import com.codelearn.suny.v2exx.api.RetroUtils;
import com.codelearn.suny.v2exx.api.V2exService;
import com.squareup.picasso.Picasso;

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

public class MyRVAdapter extends RecyclerView.Adapter<MyRVAdapter.MyHolder> {

    private List<LastestBean> mLastestBeen;
    private Context mContext;

    public MyRVAdapter(Context context, List<LastestBean> lastestBeen) {

        mContext = context;
        mLastestBeen = lastestBeen;


    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_items, parent, false);
        MyHolder hoder = new MyHolder(view);

        return hoder;
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {

//                Picasso.with(mContext).load("http:" + response.body().get(0).getMember().getAvatarMini()).into(holder.TpImage);
//                holder.tv_comment.setText(response.body().get(0).getContent());

        holder.tv_id.setText(mLastestBeen.get(position).getMember().getUsername());
        holder.tv_topic.setText(mLastestBeen.get(position).getTitle());
        holder.tv_node.setText(mLastestBeen.get(position).getNode().getName());
        holder.tv_num.setText(mLastestBeen.get(position).getReplies().toString());
        Picasso.with(mContext).load("http:" + mLastestBeen.get(position).getMember().getAvatar_normal()).into(holder.TpImage);
        RetroUtils.getTopic(mLastestBeen.get(position).getId().toString(), new Callback<List<TPComment>>() {
            @Override
            public void onResponse(Call<List<TPComment>> call, Response<List<TPComment>> response) {
                Log.i("kis", response.body().toString());
                if (response.body().size()>0) {
                    holder.tv_comment.setText(response.body().get(0).getContent());
                    Picasso.with(mContext).load("http:" + response.body().get(0).getMember().getAvatar_mini()).into(holder.comImage);
                } else {
                    holder.mLinearLayout.setVisibility(View.GONE);

                }


            }

            @Override
            public void onFailure(Call<List<TPComment>> call, Throwable t) {

            }
        });
//        if (mTPComments.get(mLastestBeen.get(position).getId().toString()).get(0).getContent() != null) {
//            Log.i("xuhao ", mTPComments.get(mLastestBeen.get(position).getId().toString()).get(0).getContent());
//            Picasso.with(mContext).load("http:" + mTPComments.get(mLastestBeen.get(position).getId().toString()).get(0).getMember().getAvatarMini()).into(holder.comImage);
//            holder.tv_comment.setText(mTPComments.get(mLastestBeen.get(position).getId().toString()).get(0).getContent());
//
//        } else {
//            holder.comImage.setVisibility(View.GONE);
//            holder.tv_comment.setVisibility(View.GONE);
//
//        }

    }

    @Override
    public int getItemCount() {
        return mLastestBeen.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private ImageView TpImage, comImage;
        private TextView tv_id,tv_topic,tv_num, tv_comment,tv_node;
        private String topic_id;
        private LinearLayout mLinearLayout;
        public MyHolder(View itemView) {
            super(itemView);
            TpImage = (ImageView) itemView.findViewById(R.id.im_user);
            comImage = (ImageView) itemView.findViewById(R.id.im_com_user);
            tv_id = (TextView) itemView.findViewById(R.id.username);
            tv_topic = (TextView) itemView.findViewById(R.id.tv_topic);
            tv_num = (TextView) itemView.findViewById(R.id.tv_num);
            tv_comment = (TextView) itemView.findViewById(R.id.tv_comment);
            tv_node = (TextView) itemView.findViewById(R.id.node);
            mLinearLayout = (LinearLayout) itemView.findViewById(R.id.check_layout);

        }

    }


}
