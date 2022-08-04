package com.github.rhllor.impl

import com.github.rhllor.abs.KThrow
import com.github.rhllor.abs.NullableObjectKThrow
import java.lang.IllegalArgumentException

class NullableObjectKThrowImpl<T: Any?>(value: T) : KThrow<T>(value), NullableObjectKThrow {

    override fun ifNull(message: String): NullableObjectKThrowImpl<T> =
        throwException({ it == null }, { IllegalArgumentException(message) })
}