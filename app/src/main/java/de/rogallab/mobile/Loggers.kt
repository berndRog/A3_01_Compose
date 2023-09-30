package de.rogallab.mobile

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import de.rogallab.mobile.MainActivity.Companion.isDebug
import de.rogallab.mobile.MainActivity.Companion.isInfo


@Composable
fun LogComp(tag: String, msg: String) {
   if (isDebug) {
      val ref = remember { Ref(1) }
      SideEffect { ref.value++ }
      Log.d(tag, "Compositions ${ref.value}: $msg")
   }
}

class Ref(var value: Int)

fun logError(tag: String, message: String) {
   val msg = formatMessage(message)
   Log.e(tag, msg)
}
fun logWarning(tag: String, message: String) {
   val msg = formatMessage(message)
   Log.w(tag, msg)
}
fun logInfo(tag: String, message: String) {
   val msg = formatMessage(message)
   if(isInfo) Log.i(tag, msg)
}

fun logDebug(tag: String, message: String) {
   val msg = formatMessage(message)
   if (isDebug) Log.d(tag, msg)
}

private fun formatMessage(message: String) =
   String.format("%-70s %s", message, Thread.currentThread().toString())