package com.laka.arouterdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                ARouter.getInstance().build("/test/testActivity1").navigation();
                break;
            case R.id.btn2:
                ARouter.getInstance().build("/test/testActivity2", "A").navigation();
                break;
            case R.id.btn3:
                ARouter.getInstance().build("/test/testActivity3")
                        .withString("name", "xhh")
                        .withInt("age", 20)
                        .withBoolean("boy", true)
                        .navigation();
                break;
            case R.id.btn4:
                ARouter.getInstance().build("/user/userCenterActivity")
                        .withString("params", "用户中心模块携带参数跳转")
                        .navigation();
                break;
            case R.id.btn5:
                ARouter.getInstance().build("/shopping/shoppingActivity")
                        .withString("params", "购物模块携带参数跳转")
                        .navigation();
                break;
            case R.id.btn6:
                Uri uri = Uri.parse("arouter://m.laka.com/schame/SchameActivity");
                ARouter.getInstance().build(uri).navigation();
                break;
            case R.id.btn7:
                ARouter.getInstance().build("/test/testActivity4").navigation();
                break;
            case R.id.btn8:
//                单独降级
//                ARouter.getInstance().build("/test/testActivity5").navigation(this, new NavigationCallback() {
//                    @Override
//                    public void onFound(Postcard postcard) {
//                        Log.i("postcard", "onFound");
//                    }
//
//                    @Override
//                    public void onLost(Postcard postcard) {
//                        Log.i("postcard", "onLost");
//                    }
//
//                    @Override
//                    public void onArrival(Postcard postcard) {
//                        Log.i("postcard", "onArrival");
//                    }
//
//                    @Override
//                    public void onInterrupt(Postcard postcard) {
//                        Log.i("postcard", "onInterrupt");
//                    }
//                });

                //全局降级，不是很理解
//                ARouter.getInstance().build("/xxx/xxx").navigation();
                break;
        }
    }
}
