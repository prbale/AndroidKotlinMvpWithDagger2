package kotlinresearch.bale.com.androidsimplemvp.Add

import kotlinresearch.bale.com.androidsimplemvp.Add.AddContract.AddPresenter
import kotlinresearch.bale.com.androidsimplemvp.Add.AddContract.AddView

class AddPresenterImpl : AddPresenter {

  private var addView: AddContract.AddView? = null

  override fun attachView(view: AddView) {
    addView = view
  }

  override fun detachView() {
    addView = null
  }

  override fun start() {
    addView?.init()
  }

  override fun validateInputs(firstNumber: Int, secondNumber: Int) {
    if( firstNumber.toString().isBlank() ||
        firstNumber.toString().isEmpty() ||
        secondNumber.toString().isBlank() ||
        secondNumber.toString().isEmpty()) {
      addView?.showError("Please provide valid inputs !")
    }

    addView?.showProgress()
    addNumbers(firstNumber = firstNumber, secondNumber = secondNumber );

  }

  override fun addNumbers(firstNumber: Int, secondNumber: Int) {
    addView?.hideProgress()
    addView?.showAddition("${firstNumber + secondNumber}")
  }

}