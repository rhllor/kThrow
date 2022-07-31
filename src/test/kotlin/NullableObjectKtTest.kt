import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import com.github.rhllor.kThrow

internal class NullableObjectKtTest {

    @Test
    fun `throw exception on call kThrow function`() {
        assertThrows<NotImplementedError> {
            var textValue: Int? = null
            textValue.kThrow()
        }
    }
}