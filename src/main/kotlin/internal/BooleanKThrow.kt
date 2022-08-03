package com.github.rhllor.internal

import java.lang.IllegalArgumentException

class BooleanKThrow(private val value: Boolean) : KThrow<Boolean>(value) {

    fun ifTrue(message: String = "Value should not be true"): KThrow<Boolean> = throwException({ it }, { IllegalArgumentException(message) })

    fun ifFalse(message: String = "Value should not be false"): KThrow<Boolean> = throwException({ !it }, { IllegalArgumentException(message) })
}