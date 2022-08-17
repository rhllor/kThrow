package com.github.rhllor.abs

interface ComparableKThrow<T> {

    fun ifEqual(valueToCompare: T, message: String = "Value should not be equal than {0}"): ComparableKThrow<T>

    fun ifNotEqual(valueToCompare: T, message: String = "Value should be equal than {0}"): ComparableKThrow<T>

}