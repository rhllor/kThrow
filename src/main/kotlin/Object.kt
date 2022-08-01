package com.github.rhllor

import com.github.rhllor.internal.NullableKThrow

fun Any.kThrow(): NullableKThrow<Any?> = throw NotImplementedError(this.toString())