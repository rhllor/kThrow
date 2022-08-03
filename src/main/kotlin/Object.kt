package com.github.rhllor

import com.github.rhllor.internal.BooleanKThrow
import com.github.rhllor.internal.ObjectKThrow

fun Any.kThrow(): ObjectKThrow<Any> = throw NotImplementedError(this.toString())

fun Boolean.kThrow(): BooleanKThrow = BooleanKThrow(this)