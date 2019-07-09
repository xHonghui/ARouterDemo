package com.laka.arouterdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @Author:summer
 * @Date:2019/7/9
 * @Description:新建一个Activity用于监听Schame事件,之后直接把url传递给ARouter即可
 * 当前activity只是起到一个中转的作用，先匹配Schame，在此进行拆解，再进行目标Activity
 */
class SchameFilterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        ARouter.getInstance().inject(this)
//        setContentView(R.layout.activity_schame_filter)
        super.onCreate(savedInstanceState)
        val uri = intent.data
        ARouter.getInstance().build(uri).navigation(this, object : NavigationCallback {
            override fun onLost(postcard: Postcard?) {
                Toast.makeText(this@SchameFilterActivity, "onLost", Toast.LENGTH_SHORT).show()
            }

            override fun onFound(postcard: Postcard?) {
                Toast.makeText(this@SchameFilterActivity, "onFound", Toast.LENGTH_SHORT).show()
            }

            override fun onInterrupt(postcard: Postcard?) {
                Toast.makeText(this@SchameFilterActivity, "onInterrupt", Toast.LENGTH_SHORT).show()
            }

            override fun onArrival(postcard: Postcard?) {
                Toast.makeText(this@SchameFilterActivity, "onArrival", Toast.LENGTH_SHORT).show()
            }
        })
    }
}