import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import com.github.rhllor.kThrow
import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.test.assertEquals

internal class NullableObjectKtTest {

    @Test
    fun `throw IllegalArgumentException when object is null`() {
        var exception = assertThrows<IllegalArgumentException> { (null).kThrow().ifNull() }
        assertEquals(exception.message, "Value cannot be null")
    }

    @Test
    fun `throw IllegalArgumentException with custom message when object is null`() {
        var exception = assertThrows<IllegalArgumentException> { (null).kThrow().ifNull("Custom Message") }
        assertEquals(exception.message, "Custom Message")
    }

    @Test
    fun `not throw IllegalArgumentException when object is not null`() {
        assertDoesNotThrow { ("test" as String?).kThrow().ifNull() }
    }

}