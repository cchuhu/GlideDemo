package huhu.com.glidedemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Huhu on 3/10/16.
 */
public class MyView extends LinearLayout {
    public ImageView imageView;
    private TextView textView;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public MyView(Context context) {
        super(context);
        init(context);

    }

    void init(Context context) {
        inflate(context, R.layout.my_view, this);
        //View v = LayoutInflater.from(context).inflate(R.layout.my_view,null);
        imageView = (ImageView) findViewById(R.id.iv_myview);
        textView = (TextView) findViewById(R.id.tv_myview);
    }

    /**
     * 设置图片的方法
     */
    public void setImage(Drawable drawable) {

        textView.setText("hello");
        imageView.setBackground(drawable);
    }


}
