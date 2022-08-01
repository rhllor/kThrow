import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import com.github.rhllor.kThrow
import org.junit.jupiter.api.assertDoesNotThrow

internal class NullableObjectKtTest {

    @Test
    fun `throw IllegalArgumentException when object is null`() {
        assertThrows<IllegalArgumentException> { (null).kThrow().ifNull() }
    }

    @Test
    fun `not throw IllegalArgumentException when object is not null`() {
        assertDoesNotThrow { ("test" as String?).kThrow().ifNull() }
    }
}