package com.github.rhllor

import com.github.rhllor.internal.NullableObjectKThrow

fun Any?.kThrow(): NullableObjectKThrow<Any?> = NullableObjectKThrow(this)