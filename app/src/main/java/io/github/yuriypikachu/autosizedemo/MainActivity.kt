package io.github.yuriypikachu.autosizedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * @author YuLiang
 * update  2020-02-13
 * <a href="YuriyPikachu@163.com">Contact me</a>
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ScreenAdaptUtil.setCustomDensity(this)
        setContentView(R.layout.activity_main)
    }
}
