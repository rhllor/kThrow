package com.github.rhllor.internal

import java.lang.IllegalArgumentException

class NullableKThrow<T: Any?>(private val value: T) : KThrow<T>(value) {

    fun ifNull(message: String = "Value is null"): NullableKThrow<T> = throwException({ it == null }, { IllegalArgumentException(message) })
}