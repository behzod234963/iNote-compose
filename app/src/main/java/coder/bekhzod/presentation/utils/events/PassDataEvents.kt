package coder.bekhzod.presentation.utils.events

import coder.behzod.domain.model.NotesModel

sealed class PassDataEvents {
    data class PassStatus(val status: Boolean) : PassDataEvents()
    data class CheckedItems(val checkedItems:MutableList<Boolean>):PassDataEvents()
}