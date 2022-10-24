package es.mrmoustard.brastlewarkcompose.model

data class Gnome(
    var id: Int = 0,
    var name: String = "",
    var thumbnail: String = "",
    var gender: Gender = Gender.Unknown,
    var age: Int = 0,
    var weight: Double = 0.0,
    var height: Double = 0.0,
    var hairColor: String = "",
    var professions: List<String> = emptyList(),
    var friends: List<String> = emptyList()
) {

    enum class Gender { Male, Female, Unknown }

    companion object {
        fun getGnomeGender(name: String): Gender =
            when {
                name.length % 2 == 0 -> Gender.Female
                name.length % 2 != 0 -> Gender.Male
                else -> Gender.Unknown
            }
    }
}

fun getGnome() = (1..10).map {
    Gnome(
        id = it,
        name = "name $it",
        thumbnail = "https://loremflickr.com/320/240/dog?lock=$it",
        hairColor = "Blue",
        friends = listOf("dfgs", "dfvsv", "dfgsbgtr"),
        professions = listOf("dfgs", "dfvsv", "dfgsbgtr")
    )
}
