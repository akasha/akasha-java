package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRDepthUsage.class
)
public @interface XRDepthUsage {
  @Nonnull
  String cpu_optimized = "cpu-optimized";

  @Nonnull
  String gpu_optimized = "gpu-optimized";

  final class Util {
    private Util() {
    }

    @XRDepthUsage
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRDepthUsage.cpu_optimized.equals( value ) || XRDepthUsage.gpu_optimized.equals( value );
    }
  }
}
