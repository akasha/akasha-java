package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@Documented
@MagicConstant(
    valuesFromClass = GPUIndexFormat.class
)
public @interface GPUIndexFormat {
  @Nonnull
  String uint16 = "uint16";

  @Nonnull
  String uint32 = "uint32";

  final class Util {
    private Util() {
    }

    @GPUIndexFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUIndexFormat.uint16.equals( value ) || GPUIndexFormat.uint32.equals( value );
    }
  }
}
