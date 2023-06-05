import java.text.SimpleDateFormat
import java.util.*


fun formatDateTime(date: String): String?{
    val pattern = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if(date.isNotEmpty()) {
        pattern.format(date)
    } else {
        "Unknown"
    }
}

fun formatDateTimeSeconds(date: String): String?{
    val pattern = SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.getDefault())
    return if(date.isNotEmpty()){
        pattern.format(date)
    } else {
        "Unknown"
    }
}

fun formatDateToYear(date: String): String?{
    val pattern = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if(date.isNotEmpty()) {
        pattern.format(date)
            ?.let { SimpleDateFormat("yyyy", Locale.getDefault()).format(it) }
    } else {
        "Unknown"
    }
}

fun formatDateToMonth(date: String): String?{
    val pattern = SimpleDateFormat("yyyy-MM", Locale.getDefault())
    return if(date.isNotEmpty()) {
        pattern.format(date)
    } else {
        "Unknown"
    }
}

fun formatDateToMinute(date: String): String?{
    val pattern = SimpleDateFormat("HH:mm", Locale.getDefault())
    return if(date.isNotEmpty()){
        pattern.format(date)
    } else {
        "Unknown"
    }
}

fun formatDateToSecond(date: String): String?{
    val pattern = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    return if(date.isNotEmpty()){
        pattern.format(date)
    } else {
        "Unknown"
    }
}