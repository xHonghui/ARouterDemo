package com.laka.arouterdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * @Author:summer
 * @Date:2019/7/9
 * @Description:
 */
@Route(path = "/test/testActivity1")
class Test1Activity : AppCompatActivity() {

    private lateinit var mTitle: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)
    }
}