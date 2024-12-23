package com.samad_talukder.androidcommonutils.utils

import android.content.Context
import android.content.pm.PackageManager

object VersionUtil {
    /**
     * Get your app version name
     *
     * @param context
     * @return
     */
    fun appVersionName(context: Context): String {
        val packageManager = context.packageManager
        val packageName = context.packageName

        try {
            val packageInfo = packageManager?.getPackageInfo(packageName, 0)
            return packageInfo?.versionName ?: ""

        } catch (exception: PackageManager.NameNotFoundException) {
            exception.printStackTrace()
        }
        return ""
    }

    fun appVersionCode(context: Context): Int {
        val packageManager = context.packageManager
        val packageName = context.packageName
        val defaultVersionCode = 1

        try {
            val packageInfo = packageManager?.getPackageInfo(packageName, 0)
            return packageInfo?.versionCode ?: defaultVersionCode

        } catch (exception: PackageManager.NameNotFoundException) {
            exception.printStackTrace()
        }
        return defaultVersionCode
    }
}