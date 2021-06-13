package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasTextRendering.class
)
public @interface CanvasTextRendering {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String geometricPrecision = "geometricPrecision";

  @Nonnull
  String optimizeLegibility = "optimizeLegibility";

  @Nonnull
  String optimizeSpeed = "optimizeSpeed";

  final class Util {
    private Util() {
    }

    @CanvasTextRendering
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasTextRendering.auto.equals( value ) || CanvasTextRendering.geometricPrecision.equals( value ) || CanvasTextRendering.optimizeLegibility.equals( value ) || CanvasTextRendering.optimizeSpeed.equals( value );
    }
  }
}
