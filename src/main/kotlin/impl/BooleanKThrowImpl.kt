package com.github.rhllor.impl

import com.github.rhllor.abs.BooleanKThrow
import com.github.rhllor.abs.KThrow
import java.lang.IllegalArgumentException

class BooleanKThrowImpl(value: Boolean?) : KThrow<Boolean?>(value), BooleanKThrow {

    override fun ifTrue(message: String): BooleanKThrowImpl = throwException({ it == true }, { IllegalArgumentException(message) })

    override fun ifFalse(message: String): BooleanKThrowImpl = throwException({ it == false }, { IllegalArgumentException(message) })
}