package kotlinresearch.bale.com.androidsimplemvp.Extensions

import android.content.Context
import android.widget.Toast

fun Context.showLongMessage(message: String) {
  Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}