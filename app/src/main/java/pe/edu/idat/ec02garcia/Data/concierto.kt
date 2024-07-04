package pe.edu.idat.ec02garcia.Data

import androidx.annotation.DrawableRes

data class concierto(
    var titulo:String,
    var descripcion: String,
    var fecha: String,
)

fun listarConciertos(): List<concierto> {
    return listOf(
        concierto("Concierto 1", "Descripción del concierto 1.", "2024-07-10"),
        concierto("Concierto 2", "Descripción del concierto 2.", "2024-07-15"),
        concierto("Concierto 3", "Descripción del concierto 3.", "2024-07-20"),
        concierto("Concierto 4", "Descripción del concierto 4.", "2024-07-25"),
        concierto("Concierto 5", "Descripción del concierto 5.", "2024-08-01"),
        concierto("Concierto 6", "Descripción del concierto 6.", "2024-08-05"),
        concierto("Concierto 7", "Descripción del concierto 7.", "2024-08-10"),
        concierto("Concierto 8", "Descripción del concierto 8.", "2024-08-15"),
        concierto("Concierto 9", "Descripción del concierto 9.", "2024-08-20"),
        concierto("Concierto 10", "Descripción del concierto 10.", "2024-08-25")
    )
}