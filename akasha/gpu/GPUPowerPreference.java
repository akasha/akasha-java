package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@Documented
@MagicConstant(
    valuesFromClass = GPUPowerPreference.class
)
public @interface GPUPowerPreference {
  @Nonnull
  String high_performance = "high-performance";

  @Nonnull
  String low_power = "low-power";

  final class Util {
    private Util() {
    }

    @GPUPowerPreference
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUPowerPreference.high_performance.equals( value ) || GPUPowerPreference.low_power.equals( value );
    }
  }
}
