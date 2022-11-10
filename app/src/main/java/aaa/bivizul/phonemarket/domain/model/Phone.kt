package aaa.bivizul.phonemarket.domain.model


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Phone(
    @SerializedName("CPU") val cpu: String,
    val camera: String,
    val capacity: List<String>,
    val color: List<String>,
    val id: String,
    val images: List<String>,
    val isFavorites: Boolean,
    val price: Int,
    val rating: Double,
    val sd: String,
    val ssd: String,
    val title: String
)