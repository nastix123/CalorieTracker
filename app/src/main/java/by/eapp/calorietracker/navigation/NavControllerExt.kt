package by.eapp.calorietracker.navigation

import androidx.navigation.NavController
import by.eapp.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}