package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasFontVariantCaps.class
)
public @interface CanvasFontVariantCaps {
  @Nonnull
  String all_petite_caps = "all-petite-caps";

  @Nonnull
  String all_small_caps = "all-small-caps";

  @Nonnull
  String normal = "normal";

  @Nonnull
  String petite_caps = "petite-caps";

  @Nonnull
  String small_caps = "small-caps";

  @Nonnull
  String titling_caps = "titling-caps";

  @Nonnull
  String unicase = "unicase";

  final class Util {
    private Util() {
    }

    @CanvasFontVariantCaps
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasFontVariantCaps.all_petite_caps.equals( value ) || CanvasFontVariantCaps.all_small_caps.equals( value ) || CanvasFontVariantCaps.normal.equals( value ) || CanvasFontVariantCaps.petite_caps.equals( value ) || CanvasFontVariantCaps.small_caps.equals( value ) || CanvasFontVariantCaps.titling_caps.equals( value ) || CanvasFontVariantCaps.unicase.equals( value );
    }
  }
}
