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
            view = inflater.inflate(R.layout.list_item, viewGroup, false);
        }
        /*placeholder设置占位符。
        * crossFade设置淡入淡出动画，默认调用，也可以重载设置时间长度
        * 调用dontAnimate可以删除淡入淡出效果
        * .error可以设置图片出错时的默认图片，必须是已经初始化或者mipmap中的图片对象*/

        Glide.with(mContext).load(mList[i]).placeholder(R.mipmap.load).crossFade(2000).into((ImageView) view);
        return view;
    }


}
