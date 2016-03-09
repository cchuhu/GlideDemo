package huhu.com.glidedemo.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;

import huhu.com.glidedemo.Config;
import huhu.com.glidedemo.R;

/**
 * 测试Glide优先级。
 */
public class PriorityActivity extends AppCompatActivity {
    public ImageView iv_theBigger, iv_theSmaller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority);
        iv_theBigger = (ImageView) findViewById(R.id.iv_theBigger);
        iv_theSmaller = (ImageView) findViewById(R.id.iv_theSmaller);
        //设置大图片
        Glide.with(this).load(Config.biggerUrl).priority(Priority.HIGH).into(iv_theBigger);
        //设置小图片
        Glide.with(this).load(Config.smallerUrl).into(iv_theSmaller);

    }
}
