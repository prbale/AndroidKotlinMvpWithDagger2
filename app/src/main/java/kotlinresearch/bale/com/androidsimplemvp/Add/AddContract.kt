package kotlinresearch.bale.com.androidsimplemvp.Add

interface AddContract {

  interface AddView {
    fun init()
    fun showProgress()
    fun hideProgress()
    fun addNumbers(firstNumber: Int, secondNumber: Int)
    fun showError(errorMessage: String)
    fun showAddition(result: String)
  }

  interface AddPresenter {
    fun start()
    fun attachView(view: AddView)
    fun detachView()
    fun validateInputs(firstNumber: Int, secondNumber: Int)
    fun addNumbers(firstNumber: Int, secondNumber: Int)
  }

}