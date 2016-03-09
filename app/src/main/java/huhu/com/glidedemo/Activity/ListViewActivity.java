package huhu.com.glidedemo.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import huhu.com.glidedemo.Adapter.ListViewAdapter;
import huhu.com.glidedemo.Config;
import huhu.com.glidedemo.R;

public class ListViewActivity extends AppCompatActivity {
    //列表的适配器
    private ListViewAdapter mAdapter;
    //列表View
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        //初始化视图
        mAdapter = new ListViewAdapter(this, Config.imageSource);
        mListView = (ListView) findViewById(R.id.mListView);
        //设置适配器
        mListView.setAdapter(mAdapter);


    }
}
