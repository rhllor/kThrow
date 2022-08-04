package com.github.rhllor

import com.github.rhllor.impl.BooleanKThrowImpl
import com.github.rhllor.impl.NullableBooleanKThrow
import com.github.rhllor.impl.NullableObjectKThrowImpl

fun Any?.kThrow(): NullableObjectKThrowImpl<Any?> = NullableObjectKThrowImpl(this)

fun Boolean?.kThrow(): NullableBooleanKThrow = NullableBooleanKThrow(
    NullableObjectKThrowImpl(this),
    BooleanKThrowImpl(this)
)
