package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasFontKerning.class
)
public @interface CanvasFontKerning {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String none = "none";

  @Nonnull
  String normal = "normal";

  final class Util {
    private Util() {
    }

    @CanvasFontKerning
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasFontKerning.auto.equals( value ) || CanvasFontKerning.none.equals( value ) || CanvasFontKerning.normal.equals( value );
    }
  }
}
