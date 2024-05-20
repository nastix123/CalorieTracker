package by.eapp.onboarding_presentation.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import by.eapp.core.navigation.Route
import by.eapp.core.util.UiEvent
import by.eapp.core_ui.LocalDimensions
import by.eapp.onboarding_presentation.components.ActionButton

@Composable
fun WelcomeScreen(
    onNavigate: (UiEvent.Navigate)  -> Unit
) {

    val spacing = LocalDimensions.current
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(spacing.spaceMedium),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Text(
                text = stringResource(id = by.eapp.core.R.string.welcome_text),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(spacing.spaceMedium))

        ActionButton(
            text = stringResource(id = by.eapp.core.R.string.welcome_text),
            onClick = { onNavigate(UiEvent.Navigate(Route.AGE)) },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

    }
}