package com.github.rhllor.internal

import java.lang.IllegalArgumentException

class NullableObjectKThrow<T: Any?>(private val value: T) : KThrow<T>(value) {

    fun ifNull(message: String = "Value cannot be null"): NullableObjectKThrow<T> = throwException({ it == null }, { IllegalArgumentException(message) })
}