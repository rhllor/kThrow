package com.github.rhllor.internal

class ObjectKThrow<T: Any>(private val value: T) : KThrow<T>(value) {
}