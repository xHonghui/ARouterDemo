package com.laka.app

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.laka.arouterdemo.BuildConfig

/**
 * @Author:summer
 * @Date:2019/7/9
 * @Description:
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
            ARouter.init(this)
        }
    }
}