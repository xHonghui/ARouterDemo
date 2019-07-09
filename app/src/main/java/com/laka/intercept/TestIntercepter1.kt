package com.laka.intercept

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

/**
 * @Author:summer
 * @Date:2019/7/9
 * @Description:拦截器测试
 */
@Interceptor(priority = 7, name = "测试拦截器")
class TestIntercepter1 : IInterceptor {

    private lateinit var mContext: Context

    /**
     * 子线程中执行
     * */
    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        if (postcard?.path == "/test/testActivity4") {
            Log.i("intercepter", "current thread：${Thread.currentThread().name}")
            callback?.onContinue(postcard)  //处理完成，交还控制权
            // callback?.onInterrupt(RuntimeException("拦截器拦截，不允许进行此操作"))
        }else{
            callback?.onContinue(postcard)
        }
    }

    override fun init(context: Context?) {
        context?.let {
            mContext = context
        }
        Log.i("intercepter", "intercepter init")
    }
}