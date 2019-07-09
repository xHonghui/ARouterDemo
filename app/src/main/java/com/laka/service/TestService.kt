package com.laka.service

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService

/**
 * @Author:summer
 * @Date:2019/7/9
 * @Description:自定义全局降级策略（跳转不成功是，走 onLost 方法）
 */
@Route(path = "/xxx/xxx")
class TestService : DegradeService {

    private lateinit var mContext: Context

    override fun onLost(context: Context?, postcard: Postcard?) {
        Log.i("service", "找不到相应activity")
        Toast.makeText(context, "找不到相应activity", Toast.LENGTH_SHORT).show()
    }

    override fun init(context: Context?) {
        context?.let {
            mContext = context
        }
    }
}