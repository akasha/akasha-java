package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUFilterMode.class
)
public @interface GPUFilterMode {
  @Nonnull
  String linear = "linear";

  @Nonnull
  String nearest = "nearest";

  final class Util {
    private Util() {
    }

    @GPUFilterMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUFilterMode.linear.equals( value ) || GPUFilterMode.nearest.equals( value );
    }
  }
}
