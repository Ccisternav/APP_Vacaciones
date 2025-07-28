
package com.example.appvacaciones.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Lugar(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val orden: Int,
    val imagenUrl: String,
    val latitud: Double,
    val longitud: Double,
    val costoAlojamiento: Double,
    val costoTransporte: Double,
    val comentario: String,
    val fotoLocalUri: String?
)
