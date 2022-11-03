package com.willmiranda.chat.ui.theme

import android.app.Application


class ChatApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        configureDI()
    }

    private fun configureDI() = startKoin {
        androidContext(this@ChatApplication)
        modules(appComponent)
    }
}
