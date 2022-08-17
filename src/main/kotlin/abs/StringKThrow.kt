package com.github.rhllor.abs

interface StringKThrow {
    fun ifEmpty(message: String = "String should not be empty"): StringKThrow

    fun ifWhiteSpace(message: String = "String should not be white space only"): StringKThrow

    fun ifLengthEquals(length: Int, message: String = "String length should not be equal to {0}"): StringKThrow

    fun ifLengthNotEquals(length: Int, message: String = "String length should be equal to {0}"): StringKThrow

    fun ifShorterThan(length: Int, message: String = "String should not be shorter than {0} characters"): StringKThrow

    fun ifLongerThan(length: Int, message: String = "String should not be longer than {0} characters"): StringKThrow

    fun ifContains(valueToSearch: String, ignoreCase: Boolean = false, message: String = "String should not contain '{0}'"): StringKThrow

    fun ifNotContains(valueToSearch: String, ignoreCase: Boolean = false, message: String = "String should contain '{0}'"): StringKThrow

    fun ifStartsWith(valueToCompare: String, ignoreCase: Boolean = false, message: String = "String should not start with '{0}'"): StringKThrow

    fun ifNotStartsWith(valueToCompare: String, ignoreCase: Boolean = false, message: String = "String should start with '{0}'"): StringKThrow

    fun ifEndsWith(valueToCompare: String, ignoreCase: Boolean = false, message: String = "String should not end with '{0}'"): StringKThrow

    fun ifNotEndsWith(valueToCompare: String, ignoreCase: Boolean = false, message: String = "String should end with '{0}"): StringKThrow
}