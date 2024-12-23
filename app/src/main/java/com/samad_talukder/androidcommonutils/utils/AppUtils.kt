package com.samad_talukder.androidcommonutils.utils

import android.app.Activity

// isPortraitMode
// isInLandscapeMode

object AppUtils {
    /**
     * Run on ui thread
     *
     * @param activity
     * @param action
     * @receiver
     */
    @JvmStatic
    fun runOnUiThread(activity: Activity?, action: (Activity) -> Unit) {
        activity?.let {
            if (!it.isFinishing) {
                it.runOnUiThread { (action.invoke(it)) }
            }
        }
    }
}