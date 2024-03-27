package coder.bekhzod.presentation.utils.constants

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import coder.behzod.domain.model.NotesModel

const val MAIN_TOP_APP_BAR_KEY = "main_top_app_bar_key"

val NOTES_MODEL_OBJECT =
    NotesModel(
        title = "Behzod",
        note = "Xudoybergenov",
        dataAdded = "22.03.2024"
    )

var THEME_COLOR = Color.Black
var FONT_AND_BORDER_COLOR = Color.White
var IS_DARK = true