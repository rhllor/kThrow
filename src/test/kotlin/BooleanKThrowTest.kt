import com.github.rhllor.kThrow
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

internal class BooleanKThrowTest {
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