package com.github.rhllor.impl

import com.github.rhllor.abs.BooleanKThrow
import com.github.rhllor.abs.NullableObjectKThrow

class NullableBooleanKThrow(
    nullableObjectKThrow: NullableObjectKThrow,
    booleanKThrow: BooleanKThrow
) : NullableObjectKThrow by nullableObjectKThrow, BooleanKThrow by booleanKThrow