/**
 * MIT License
 *
 * Copyright (C) 2022 HighCapable
 *
 * This file is part of YukiHookAPI.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * This file is Created by fankes on 2022/2/3.
 */
@file:Suppress("unused")

package com.highcapable.yukihookapi.hook.log

import android.util.Log
import com.highcapable.yukihookapi.YukiHookAPI
import de.robv.android.xposed.XposedBridge

/**
 * 向控制台和 [XposedBridge] 打印日志 - D
 *
 * 你可以对此方法进行二次封装
 *
 * [XposedBridge] 中的日志打印风格为 [[tag]]「类型」--> [msg]
 * @param tag 日志打印的标签 - 建议和自己的模块名称设置成一样的 - 默认为 [YukiHookAPI.TAG]
 * @param msg 日志打印的内容
 */
fun loggerD(tag: String = YukiHookAPI.TAG, msg: String) = runCatching {
    Log.d(tag, msg)
    XposedBridge.log("[$tag][D]--> $msg")
}

/**
 * 向控制台和 [XposedBridge] 打印日志 - I
 *
 * 你可以对此方法进行二次封装
 *
 * [XposedBridge] 中的日志打印风格为 [[tag]]「类型」--> [msg]
 * @param tag 日志打印的标签 - 建议和自己的模块名称设置成一样的 - 默认为 [YukiHookAPI.TAG]
 * @param msg 日志打印的内容
 */
fun loggerI(tag: String = YukiHookAPI.TAG, msg: String) = runCatching {
    Log.i(tag, msg)
    XposedBridge.log("[$tag][I]--> $msg")
}

/**
 * 向控制台和 [XposedBridge] 打印日志 - W
 *
 * 你可以对此方法进行二次封装
 *
 * [XposedBridge] 中的日志打印风格为 [[tag]]「类型」--> [msg]
 * @param tag 日志打印的标签 - 建议和自己的模块名称设置成一样的 - 默认为 [YukiHookAPI.TAG]
 * @param msg 日志打印的内容
 */
fun loggerW(tag: String = YukiHookAPI.TAG, msg: String) = runCatching {
    Log.w(tag, msg)
    XposedBridge.log("[$tag][W]--> $msg")
}

/**
 * 向控制台和 [XposedBridge] 打印日志 - E
 *
 * 你可以对此方法进行二次封装
 *
 * [XposedBridge] 中的日志打印风格为 [[tag]]「类型」--> [msg]
 * @param tag 日志打印的标签 - 建议和自己的模块名称设置成一样的 - 默认为 [YukiHookAPI.TAG]
 * @param msg 日志打印的内容
 * @param e 可填入异常堆栈信息 - 将自动完整打印到控制台
 */
fun loggerE(tag: String = YukiHookAPI.TAG, msg: String, e: Throwable? = null) = runCatching {
    Log.e(tag, msg, e)
    XposedBridge.log("[$tag][E]--> $msg")
    e?.also { XposedBridge.log(it) }
}