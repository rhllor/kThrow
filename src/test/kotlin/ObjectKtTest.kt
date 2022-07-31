import com.github.rhllor.kThrow
import org.junit.jupiter.api.Test

internal class ObjectKtTest {

    @Test
    fun `throw exception on call kThrow function`() {
        org.junit.jupiter.api.assertThrows<NotImplementedError> {
            var textValue: Int? = null
            textValue.kThrow()
        }
    }
}