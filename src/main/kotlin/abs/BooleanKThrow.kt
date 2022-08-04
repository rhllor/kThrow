package com.github.rhllor.abs

interface BooleanKThrow {
    fun ifTrue(message: String = "Value should not be true"): BooleanKThrow

    fun ifFalse(message: String = "Value should not be false"): BooleanKThrow
}