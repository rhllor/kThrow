package com.github.rhllor.abs

interface NumericKThrow<T> {
    fun ifZero(message: String = "Value should not be 0"): NumericKThrow<T>

    fun ifNotZero(message: String = "Value should be 0"): NumericKThrow<T>

    fun ifPositive(message: String = "Value should not be greater than 0"): NumericKThrow<T>

    fun ifNegative(message: String = "Value should not be less than 0"): NumericKThrow<T>

    fun ifLessThan(valueToCompare: T, message: String = "Value should not be less than {0}"): NumericKThrow<T>

    fun ifGreaterThan(valueToCompare: T, message: String = "Value should not be greater than {0}"): NumericKThrow<T>

    fun ifOutOfRange(fromValue: T, toValue: T, message: String = "Value should be between {0} and {1}"): NumericKThrow<T>
}