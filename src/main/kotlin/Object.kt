package com.github.rhllor

import com.github.rhllor.impl.BooleanKThrowImpl

fun Boolean.kThrow(): BooleanKThrowImpl = BooleanKThrowImpl(this)