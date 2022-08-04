import com.github.rhllor.kThrow
import org.junit.jupiter.api.*
import kotlin.test.assertEquals

internal class BooleanKThrowTest {

    @Nested
    @DisplayName("Not Nullable Boolean Test")
    inner class BooleanKThrow {

        @Test
        fun `throw IllegalArgumentException when value is true`() {
            var exception = assertThrows<IllegalArgumentException> { (true).kThrow().ifTrue() }
            assertEquals(exception.message, "Value should not be true")
        }

        @Test
        fun `throw IllegalArgumentException with custom message when value is true`() {
            var exception = assertThrows<IllegalArgumentException> { (true).kThrow().ifTrue("Custom Message") }
            assertEquals(exception.message, "Custom Message")
        }

        @Test
        fun `not throw IllegalArgumentException when value is false`() {
            assertDoesNotThrow { (false).kThrow().ifTrue() }
        }

        @Test
        fun `throw IllegalArgumentException when value is false`() {
            var exception = assertThrows<IllegalArgumentException> { (false).kThrow().ifFalse() }
            assertEquals(exception.message, "Value should not be false")
        }

        @Test
        fun `throw IllegalArgumentException with custom message when value is false`() {
            var exception = assertThrows<IllegalArgumentException> { (false).kThrow().ifFalse("Custom Message") }
            assertEquals(exception.message, "Custom Message")
        }

        @Test
        fun `not throw IllegalArgumentException when value is true`() {
            assertDoesNotThrow { (true).kThrow().ifFalse() }
        }
    }

    @Nested
    @DisplayName("Nullable Boolean Test")
    inner class NullableBooleanKThrow {
        @Test
        fun `throw IllegalArgumentException when Boolean is null`() {
            var exception = assertThrows<IllegalArgumentException> { (null as Boolean?).kThrow().ifNull() }
            assertEquals(exception.message, "Value cannot be null")
        }

        @Test
        fun `throw IllegalArgumentException with custom message when Boolean is null`() {
            var exception = assertThrows<IllegalArgumentException> { (null as Boolean?).kThrow().ifNull("Custom Message") }
            assertEquals(exception.message, "Custom Message")
        }

        @Test
        fun `not throw IllegalArgumentException when Boolean is not null`() {
            assertDoesNotThrow { (true as Boolean?).kThrow().ifNull() }
        }

        @Test
        fun `not throw any exception for null value`() {
            assertDoesNotThrow { (null as Boolean?).kThrow().ifFalse().ifTrue() }
        }
    }

}