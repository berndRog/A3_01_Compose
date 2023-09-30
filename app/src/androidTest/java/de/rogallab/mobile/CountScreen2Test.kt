import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.assertIsDisplayed
import androidx.test.ext.junit.runners.AndroidJUnit4
import de.rogallab.mobile.ui.composables.CountScreen2
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CountScreen2Test {

   @get:Rule
   val composeTestRule = createComposeRule()

   @Test
   fun testCountScreen2() {
      // Starte die Bildschirmkomposition
      composeTestRule.setContent {
         CountScreen2()
      }

      // Überprüfe den initialen Wert des Textes
      composeTestRule.onNodeWithText("0").assertIsDisplayed()

      // Klicke auf den Button
      composeTestRule.onNodeWithText("Hochzählen").performClick()

      // Überprüfe den aktualisierten Wert des Textes nach dem Klick
      composeTestRule.onNodeWithText("1").assertIsDisplayed()

      // Klicke erneut auf den Button
      composeTestRule.onNodeWithText("Hochzählen").performClick()

      // Überprüfe den aktualisierten Wert des Textes nach dem zweiten Klick
      composeTestRule.onNodeWithText("2").assertIsDisplayed()
   }
}
