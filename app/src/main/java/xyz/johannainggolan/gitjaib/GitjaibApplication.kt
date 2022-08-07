package xyz.johannainggolan.gitjaib

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import xyz.johannainggolan.gitjaib.dpinjection.networkModule
import xyz.johannainggolan.gitjaib.dpinjection.viewmodelModule


class GitjaibApplication: Application() {
 //https://stackoverflow.com/questions/71988144/serializer-for-class-is-not-found-mark-the-class-as-serializable-or-prov
    //https://www.codexpedia.com/android/android-dependency-injection-koin-example/
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@GitjaibApplication)
            androidLogger()
            modules(listOf(viewmodelModule, networkModule))
        }
    }
}