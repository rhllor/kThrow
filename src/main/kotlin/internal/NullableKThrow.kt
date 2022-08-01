package com.github.rhllor.internal

import java.lang.IllegalArgumentException

class NullableKThrow<T: Any?>(private val value: T) : KThrow<T>(value) {

    fun ifNull(): NullableKThrow<T> = throwException({ it == null }, { IllegalArgumentException("value is null") })
}