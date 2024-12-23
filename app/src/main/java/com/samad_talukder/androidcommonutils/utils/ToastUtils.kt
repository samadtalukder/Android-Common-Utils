package com.samad_talukder.androidcommonutils.utils

import android.content.Context
import android.widget.Toast

fun showShortToast(context: Context, value: String) {
    Toast.makeText(context, value, Toast.LENGTH_SHORT).show()
}