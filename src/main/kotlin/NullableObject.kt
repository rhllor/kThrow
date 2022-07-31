package com.github.rhllor

fun Any?.kThrow(): Nothing = throw NotImplementedError(this.toString())