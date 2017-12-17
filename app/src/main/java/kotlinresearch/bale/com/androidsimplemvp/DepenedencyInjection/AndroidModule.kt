package kotlinresearch.bale.com.androidsimplemvp.DepenedencyInjection

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import kotlinresearch.bale.com.androidsimplemvp.Add.AddContract
import kotlinresearch.bale.com.androidsimplemvp.Add.AddPresenterImpl
import javax.inject.Singleton

@Module
class AndroidModule(private val application: Application) {

    @Provides
    @Singleton
    @ForApplication
    fun provideApplicationContext(): Context = application

    @Provides
    @Singleton
    fun provideAddPresenter(): AddContract.AddPresenter {
        return AddPresenterImpl()
    }

}
