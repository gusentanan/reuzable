package com.bagusmerta.core_ui

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

fun View?.makeGone(){
    this?.visibility = View.GONE
}

fun View?.makeVisible(){
    this?.visibility = View.VISIBLE
}

fun View?.makeInvisible(){
    this?.visibility = View.INVISIBLE
}

fun ImageView.loadImage(url: String?){
    Glide.with(context)
        .load("$url")
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .error(R.drawable.baseline_image_not_supported_24)
        .into(this)
}
