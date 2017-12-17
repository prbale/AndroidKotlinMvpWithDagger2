package kotlinresearch.bale.com.androidsimplemvp

import android.app.Application
import kotlinresearch.bale.com.androidsimplemvp.DepenedencyInjection.AndroidModule
import kotlinresearch.bale.com.androidsimplemvp.DepenedencyInjection.ApplicationComponent
import kotlinresearch.bale.com.androidsimplemvp.DepenedencyInjection.DaggerApplicationComponent

class AppApplication : Application() {

  override fun onCreate() {
    super.onCreate()
    graph = DaggerApplicationComponent.builder().androidModule(AndroidModule(this)).build()
    graph.inject(this)
  }

  companion object {
    //platformStatic allow access it from java code
    @JvmStatic lateinit var graph: ApplicationComponent
  }

}