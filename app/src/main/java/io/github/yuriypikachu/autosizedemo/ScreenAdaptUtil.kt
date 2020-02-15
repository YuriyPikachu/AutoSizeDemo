package io.github.yuriypikachu.autosizedemo

import android.app.Activity

/**
 * @author YuLiang
 * update  2020-02-13
 * <a href="YuriyPikachu@163.com">Contact me</a>
 */
object ScreenAdaptUtil {
    fun setCustomDensity(activity: Activity) {
        activity.resources.displayMetrics.apply {
            val targetDensity = (widthPixels / 360).toFloat()
            density = targetDensity
            scaledDensity = targetDensity
            densityDpi = 160 * targetDensity.toInt()
        }
    }
}

