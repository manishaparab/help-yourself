package com.example.helpyourself;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	private List<AppInfo> mListAppInfo;
    private Context mContext;
    
    public MyAdapter(Context context, List<AppInfo> list) {
        mContext = context;
        mListAppInfo = list;
    }
    @Override
    public int getCount() {
        return mListAppInfo.size();
    }
 
    @Override
    public Object getItem(int position) {
        return mListAppInfo.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AppInfo entry = mListAppInfo.get(position);
        ViewHolder holder = null;
        ImageView imageView;
     
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
            holder = new ViewHolder();
            convertView.setTag(holder);
            }
        else {
            holder = (ViewHolder)convertView.getTag();
            }
        
        holder.ivIcon = (ImageView)convertView.findViewById(R.id.ivIcon);
        holder.tvName = (TextView)convertView.findViewById(R.id.tvName);
        
        imageView = new ImageView(mContext);
        holder.ivIcon.setImageBitmap(entry.getIcon());
        holder.tvName.setText(entry.getName());
        imageView.setTag(mListAppInfo.get(position));
       
        return convertView;
    }
  
    static class ViewHolder {
        ImageView ivIcon;
        TextView tvName;
}
}