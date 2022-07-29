package com.example.socket_alarm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SoVoRoAlarmAdapter extends RecyclerView.Adapter<SoVoRoAlarmAdapter.ViewHolder> {
    private ArrayList<String> mData=null;

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView notificationText;

        ViewHolder(View itemView) {
            super(itemView) ;

            // 뷰 객체에 대한 참조. (hold strong reference)
            notificationText = itemView.findViewById(R.id.notificationContent);
        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    SoVoRoAlarmAdapter(ArrayList<String> list) {
        mData = list ;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public SoVoRoAlarmAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.sovoro_alarm_content, parent, false) ;
        SoVoRoAlarmAdapter.ViewHolder vh = new SoVoRoAlarmAdapter.ViewHolder(view) ;

        return vh ;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(SoVoRoAlarmAdapter.ViewHolder holder, int position) {
        String text = mData.get(position) ;
        holder.notificationText.setText(text) ;
    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mData.size() ;
    }

}
