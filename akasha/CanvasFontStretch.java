package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasFontStretch.class
)
public @interface CanvasFontStretch {
  @Nonnull
  String condensed = "condensed";

  @Nonnull
  String expanded = "expanded";

  @Nonnull
  String extra_condensed = "extra-condensed";

  @Nonnull
  String extra_expanded = "extra-expanded";

  @Nonnull
  String normal = "normal";

  @Nonnull
  String semi_condensed = "semi-condensed";

  @Nonnull
  String semi_expanded = "semi-expanded";

  @Nonnull
  String ultra_condensed = "ultra-condensed";

  @Nonnull
  String ultra_expanded = "ultra-expanded";

  final class Util {
    private Util() {
    }

    @CanvasFontStretch
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasFontStretch.condensed.equals( value ) || CanvasFontStretch.expanded.equals( value ) || CanvasFontStretch.extra_condensed.equals( value ) || CanvasFontStretch.extra_expanded.equals( value ) || CanvasFontStretch.normal.equals( value ) || CanvasFontStretch.semi_condensed.equals( value ) || CanvasFontStretch.semi_expanded.equals( value ) || CanvasFontStretch.ultra_condensed.equals( value ) || CanvasFontStretch.ultra_expanded.equals( value );
    }
  }
}
