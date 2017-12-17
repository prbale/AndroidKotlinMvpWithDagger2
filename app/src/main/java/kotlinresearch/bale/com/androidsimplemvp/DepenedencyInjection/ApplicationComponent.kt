package kotlinresearch.bale.com.androidsimplemvp.DepenedencyInjection

import dagger.Component
import kotlinresearch.bale.com.androidsimplemvp.Add.AddActivity
import kotlinresearch.bale.com.androidsimplemvp.AppApplication
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidModule::class))
interface ApplicationComponent {
    fun inject(application: AppApplication)
    fun inject(mainActivity: AddActivity)
}
