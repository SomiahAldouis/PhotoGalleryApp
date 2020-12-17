package somiah.jad.photogalleryapp.api


import com.google.gson.annotations.SerializedName
import somiah.jad.photogalleryapp.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}
