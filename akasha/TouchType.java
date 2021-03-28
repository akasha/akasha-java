package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TouchType.class
)
public @interface TouchType {
  @Nonnull
  String direct = "direct";

  @Nonnull
  String stylus = "stylus";

  final class Util {
    private Util() {
    }

    @TouchType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return TouchType.direct.equals( value ) || TouchType.stylus.equals( value );
    }
  }
}
