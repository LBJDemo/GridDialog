package com.xdx.doall.griddialog;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xdx on 2018/7/30.
 */
public class InsurGridViewAdapter extends BaseAdapter {
    private Context mContext;
    private List<InsurEntity> List;

    public InsurGridViewAdapter(Context mContext, List<InsurEntity> List) {
        this.mContext = mContext;
        this.List = List;
    }

    @Override
    public int getCount() {
        return List.size();
    }

    @Override
    public Object getItem(int i) {
        return List.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        final InsurEntity insurBean = (InsurEntity) getItem(position);
        ViewHolder viewHolder;
        if(view == null){
            view = View.inflate(mContext, R.layout.mall_item_insur,null);
            viewHolder = new ViewHolder();
            viewHolder.name = view.findViewById(R.id.rb03);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if(insurBean.isSelect()){
            viewHolder.name.setBackgroundResource(R.drawable.me_shape_eclass);
            viewHolder.name.setTextColor(Color.parseColor("#28cc82"));
        }else {
            viewHolder.name.setBackgroundResource(R.drawable.me_shape_eclass_u);
            viewHolder.name.setTextColor(Color.parseColor("#8F8F8F"));
        }
        viewHolder.name.setText(List.get(position).getName());

        return view;
    }
    class ViewHolder{
        TextView name;
    }


}
