package coder.bekhzod.presentation.utils.constants

const val  MAIN_TOP_APP_BAR_KEY = "main_top_app_bar_key"

sealed class PassDataEvents{
    data class PassStatus(val status:Boolean):PassDataEvents()
}