package com.samad_talukder.androidcommonutils.utils

import android.app.Activity
import android.app.AlertDialog
import com.samad_talukder.androidcommonutils.utils.AppUtils.runOnUiThread

// showDialogWithMessage
// showDialogWithMessageWithAction
// showDialogForTextBox
// showDialogForInput

object DialogUtils {
    var currentDialog: Any? = null

    fun showAlertDialog(context: Activity?, title: String?, message: String?) {
        runOnUiThread(context) { activity ->
            val mDialog = AlertDialog.Builder(activity)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(
                    "Ok"
                ) { p0, p1 ->
                    showShortToast(activity, "$p1 - $p0")
                }
            currentDialog = mDialog
            mDialog.show()
        }
    }


}