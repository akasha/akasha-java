package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRReflectionFormat.class
)
public @interface XRReflectionFormat {
  @Nonnull
  String rgba16f = "rgba16f";

  @Nonnull
  String srgba8 = "srgba8";

  final class Util {
    private Util() {
    }

    @XRReflectionFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRReflectionFormat.rgba16f.equals( value ) || XRReflectionFormat.srgba8.equals( value );
    }
  }
}
