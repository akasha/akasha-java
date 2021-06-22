package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUCullMode.class
)
public @interface GPUCullMode {
  @Nonnull
  String back = "back";

  @Nonnull
  String front = "front";

  @Nonnull
  String none = "none";

  final class Util {
    private Util() {
    }

    @GPUCullMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUCullMode.back.equals( value ) || GPUCullMode.front.equals( value ) || GPUCullMode.none.equals( value );
    }
  }
}
