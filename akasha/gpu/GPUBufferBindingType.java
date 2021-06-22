package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUBufferBindingType.class
)
public @interface GPUBufferBindingType {
  @Nonnull
  String read_only_storage = "read-only-storage";

  @Nonnull
  String storage = "storage";

  @Nonnull
  String uniform = "uniform";

  final class Util {
    private Util() {
    }

    @GPUBufferBindingType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUBufferBindingType.read_only_storage.equals( value ) || GPUBufferBindingType.storage.equals( value ) || GPUBufferBindingType.uniform.equals( value );
    }
  }
}
