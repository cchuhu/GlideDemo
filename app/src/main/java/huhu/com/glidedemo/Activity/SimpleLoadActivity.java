package huhu.com.glidedemo.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import huhu.com.glidedemo.R;

/**
 * 简单使用Glide库加载图片测试
 */
public class SimpleLoadActivity extends Activity {
    //测试图片的ImageView
    private ImageView mImageView = null;
    //测试图片的URL
    private String url = "http://7xl07p.com1.z0.glb.clouddn.com/%60(TZ~5RGO%60G0YVIY281%25ZMB.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.mImageView);
        //流接口形式
        Glide.with(SimpleLoadActivity.this).load(url).into(mImageView);
    }
}
