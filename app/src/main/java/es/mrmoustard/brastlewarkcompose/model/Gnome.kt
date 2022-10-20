package es.mrmoustard.brastlewarkcompose.model

data class Gnome(
    var id: Int = 0,
    var name: String = "",
    var thumbnail: String = "",
    var gender: Gender = Gender.UNKNOWN,
    var age: Int = 0,
    var weight: Double = 0.0,
    var height: Double = 0.0,
    var hairColor: String = "",
    var professions: List<String> = emptyList(),
    var friends: List<String> = emptyList()
) {

    enum class Gender { MALE, FEMALE, UNKNOWN }

    companion object {
        fun getGnomeGender(name: String): Gender =
            when {
                name.length % 2 == 0 -> Gender.FEMALE
                name.length % 2 != 0 -> Gender.MALE
                else -> Gender.UNKNOWN
            }
    }
}

fun getGnome() = (1..10).map {
    Gnome(
        id = it,
        name = "name $it",
        thumbnail = "https://loremflickr.com/320/240/dog?lock=$it"
    )
}
