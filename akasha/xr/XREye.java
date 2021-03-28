package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XREye.class
)
public @interface XREye {
  @Nonnull
  String left = "left";

  @Nonnull
  String none = "none";

  @Nonnull
  String right = "right";

  final class Util {
    private Util() {
    }

    @XREye
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XREye.left.equals( value ) || XREye.none.equals( value ) || XREye.right.equals( value );
    }
  }
}
