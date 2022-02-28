package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XREnvironmentBlendMode.class
)
public @interface XREnvironmentBlendMode {
  @Nonnull
  String additive = "additive";

  @Nonnull
  String alpha_blend = "alpha-blend";

  @Nonnull
  String opaque = "opaque";

  final class Util {
    private Util() {
    }

    @XREnvironmentBlendMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XREnvironmentBlendMode.additive.equals( value ) || XREnvironmentBlendMode.alpha_blend.equals( value ) || XREnvironmentBlendMode.opaque.equals( value );
    }
  }
}
