package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRDepthDataFormat.class
)
public @interface XRDepthDataFormat {
  @Nonnull
  String float32 = "float32";

  @Nonnull
  String luminance_alpha = "luminance-alpha";

  final class Util {
    private Util() {
    }

    @XRDepthDataFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRDepthDataFormat.float32.equals( value ) || XRDepthDataFormat.luminance_alpha.equals( value );
    }
  }
}
