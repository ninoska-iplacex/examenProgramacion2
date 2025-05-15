package cl.Ninoska.android.Servicios_Basicos.db

import androidx.room.TypeConverter
import java.time.LocalDate

// Contiene los convertidores de fecha para la columna fecha
class LocalDateConverter {
    @TypeConverter
    fun fromTimestamp(value: Long?): LocalDate? {
        return value?.let { LocalDate.ofEpochDay(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: LocalDate?): Long? {
        return date?.toEpochDay()
    }
}