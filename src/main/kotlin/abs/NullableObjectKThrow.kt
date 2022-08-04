package com.github.rhllor.abs

interface NullableObjectKThrow {
    fun ifNull(message: String = "Value cannot be null"): NullableObjectKThrow
}