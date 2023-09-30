package de.rogallab.mobile

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.rogallab.mobile.ui.composables.CountScreen1
import de.rogallab.mobile.ui.theme.AppTheme

class MainActivity : BaseActivity(TAG) {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)

      setContent {

         AppTheme {
            Surface(
               modifier = Modifier.fillMaxSize(),
               color = MaterialTheme.colorScheme.background) {

               val name by remember { mutableStateOf("") }
               logDebug("ok>ComposeView        .", "Composition {$name}")
               CountScreen1()
            }
         }
      }
   }

   companion object {
      const val isInfo = true
      const val isDebug = true
      //12345678901234567890123
      private const val TAG = "ok>MainActivity       ."
   }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//   Text(
//      text = "Hello $name!",
//      modifier = modifier
//   )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   AppTheme() {
      Surface(
         modifier = Modifier.fillMaxSize(),
         color = MaterialTheme.colorScheme.background
      ) {
         CountScreen1()
      }
   }
}