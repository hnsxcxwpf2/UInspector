package com.huya.mobile.uinspector.state

import android.app.Activity
import android.view.View
import com.huya.mobile.uinspector.ui.UInspectorMask
import com.yy.mobile.whisper.NotThreadSafe

/**
 * Store the information which is bound to the lifecycle of [activity]
 *
 * @author YvesCheung
 * 2020/12/30
 */
@NotThreadSafe
internal class UInspectorLifecycleState(val activity: Activity) {

    var view: UInspectorMask? = null

    var lastTouchTarget: View? = null
}