package huhu.com.glidedemo.Activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.ViewTarget;

import huhu.com.glidedemo.Config;
import huhu.com.glidedemo.MyView;
import huhu.com.glidedemo.R;

/**
 * 假如获取图片的重点不是设置到ImageView中，使用Target保存bitmap对象
 * 学习使用ViewTarget设置图片到自定义View中
 */
public class TargetActivity extends Activity {
    //SimpleTarget测试的ImageView
    private ImageView mTargetImageView;
    //ViewTarget测试的自定义View
    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        mTargetImageView = (ImageView) findViewById(R.id.targetImageview);
        myView = (MyView) findViewById(R.id.mView);
        myView.setImage(this.getResources().getDrawable(R.mipmap.ic_launcher));

        /*简单使用Target
        * */
        SimpleTarget msimpleTarget = new SimpleTarget() {
            @Override
            public void onResourceReady(Object resource, GlideAnimation glideAnimation) {
                mTargetImageView.setImageBitmap((Bitmap) resource);
            }
        };
        //asBitmap确保返回一个bitmap对象
        Glide.with(this).load(Config.biggerUrl).asBitmap().into(msimpleTarget);
        /*在自定义视图中使用Target*/
        ViewTarget mTarget = new ViewTarget<MyView, GlideDrawable>(myView) {
            @Override
            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {

                myView.setImage(resource.getCurrent());
            }
        };
        Glide.with(this).load(Config.biggerUrl).into(mTarget);

    }
}
