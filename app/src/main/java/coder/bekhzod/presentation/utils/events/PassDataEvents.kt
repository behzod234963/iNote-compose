package coder.bekhzod.presentation.utils.events

import coder.behzod.domain.model.NotesModel

sealed class PassDataEvents {
    data class PassStatus(val status: Boolean) : PassDataEvents()
    data class CheckedItems(val checkedItems:MutableList<Boolean>):PassDataEvents()
    data class IsSelectedStatus(val isSelected:Boolean):PassDataEvents()
    data class SelectAll(val selectAll:Boolean):PassDataEvents()
}