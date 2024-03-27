package coder.behzod.domain.model

data class NotesModel(
    val id:Int? = null,
    var title:String,
    val note:String,
    var isChecked:Boolean = false,
    val dataAdded:String,
)
