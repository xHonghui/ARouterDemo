package com.laka.shopping

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @Author:summer
 * @Date:2019/7/9
 * @Description:
 */
@Route(path = "/shopping/shoppingActivity")
class ShoppingActivity : AppCompatActivity() {

    @Autowired
    @JvmField
    var params: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        ARouter.getInstance().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        Toast.makeText(this, params, Toast.LENGTH_SHORT).show()
    }
}