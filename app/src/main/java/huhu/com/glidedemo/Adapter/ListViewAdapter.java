package huhu.com.glidedemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import huhu.com.glidedemo.R;

/**
 * Created by Huhu on 3/9/16.
 * ListView的adapter
 */
public class ListViewAdapter extends BaseAdapter {
    //上下文环境
    private Context mContext;
    //url参数列表
    private String[] mList;
    private LayoutInflater inflater;

    public ListViewAdapter(Context mContext, String[] mList) {
        this.mList = mList;
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.list_item, viewGroup,false);
        }
        Glide.with(mContext).load(mList[i]).into((ImageView) view);
        return view;
    }


}
