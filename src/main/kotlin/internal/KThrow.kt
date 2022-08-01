package com.github.rhllor.internal

abstract class KThrow<T>(private val value: T){

    protected fun <R: KThrow<T>, E: Throwable> throwException(conditionalExpression: (T) -> Boolean, ex: () -> E): R {
        if (conditionalExpression(value)) {
            throw ex()
        }
        return this as R;
    }
}