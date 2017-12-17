package kotlinresearch.bale.com.androidsimplemvp.Add

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinresearch.bale.com.androidsimplemvp.Add.AddContract.AddView
import kotlinresearch.bale.com.androidsimplemvp.AppApplication
import kotlinresearch.bale.com.androidsimplemvp.Extensions.gone
import kotlinresearch.bale.com.androidsimplemvp.Extensions.showLongMessage
import kotlinresearch.bale.com.androidsimplemvp.Extensions.visible
import kotlinresearch.bale.com.androidsimplemvp.R
import kotlinx.android.synthetic.main.activity_main.calculateBtn
import kotlinx.android.synthetic.main.activity_main.firstEt
import kotlinx.android.synthetic.main.activity_main.progressBar
import kotlinx.android.synthetic.main.activity_main.resultTv
import kotlinx.android.synthetic.main.activity_main.secondEt
import javax.inject.Inject

class AddActivity : AppCompatActivity(), AddView {

  @Inject
  lateinit var addPresenter: AddContract.AddPresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    AppApplication.graph.inject(this)

    addPresenter.attachView(this)
    addPresenter.start()
  }

  override fun init() {
    calculateBtn.setOnClickListener {
      addNumbers(firstNumber = firstEt.text.toString().toInt(), secondNumber = secondEt.text.toString().toInt())
    }
  }

  override fun showProgress() = progressBar.visible()

  override fun hideProgress() = progressBar.gone()

  override fun showError(errorMessage: String) = showLongMessage(errorMessage)

  override fun showAddition(result: String) {
    resultTv.text = result
  }

  override fun addNumbers(firstNumber: Int, secondNumber: Int) {
    addPresenter.addNumbers(firstNumber = firstNumber, secondNumber = secondNumber)
  }

}
