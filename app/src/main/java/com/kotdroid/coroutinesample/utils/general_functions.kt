package com.kotdroid.coroutinesample.utils

import android.view.View
import androidx.core.view.isVisible

/**
 * @AUTHOR Amandeep Singh
 * @DATE   18/05/2021
 */
fun View.toggleVisibility() {
    if (this.isVisible) {
        this.visibility = View.GONE
    } else {
        this.visibility = View.VISIBLE
    }
}