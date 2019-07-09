package com.laka.arouterdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @Author:summer
 * @Date:2019/7/9
 * @Description:携带参数跳转，java 的话直接使用注解 @Autowired 就可以解析参数，kotlin的话需要额外添加多一个 @JvmField 注解
 */
@Route(path = "/test/testActivity4")
class Test4Activity : AppCompatActivity() {

    @Autowired
    @JvmField
    var name: String? = ""
    @Autowired
    @JvmField
    var age: Int? = 0
    @Autowired
    @JvmField
    var boy: Boolean? = false

    override fun onCreate(savedInstanceState: Bundle?) {
        ARouter.getInstance().inject(this)  // Start auto inject.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)

        Toast.makeText(this, "$name----$age-----$boy", Toast.LENGTH_SHORT).show()

    }
}