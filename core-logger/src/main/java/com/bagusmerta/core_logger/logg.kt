package com.bagusmerta.core_logger

import android.util.Log

object Logg {

    fun debug(tag: String? = null, msg: () -> Any?){
        logg(target = Log.DEBUG, tag = tag, msg = msg)
    }

    fun error(tag: String? = null, msg: () -> Any?, throwable: Throwable?){
        logg(target = Log.ERROR, tag = tag, msg = msg, throwable = throwable)
    }

    fun info(tag: String? = null, msg: () -> Any?){
        logg(target = Log.INFO, tag = tag, msg = msg)
    }

    fun warning(tag: String? = null, msg: () -> Any?){
        logg(target = Log.WARN, tag = tag, msg = msg)
    }

    fun verbose(tag: String? = null, msg: () -> Any?){
        logg(target = Log.VERBOSE, tag = tag, msg = msg)
    }

    private fun logg(
        target: Int,
        tag: String? = null,
        msg: () -> Any?,
        throwable: Throwable? = null
    ){
        val targetEx = tag?: "LOGG"
        logg(
            target,
            targetEx,
            { msg()?.toString() ?: "NULL" },
            throwable
        )
    }

}
