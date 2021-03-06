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
    valuesFromClass = GPUDeviceLostReason.class
)
public @interface GPUDeviceLostReason {
  @Nonnull
  String destroyed = "destroyed";

  final class Util {
    private Util() {
    }

    @GPUDeviceLostReason
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUDeviceLostReason.destroyed.equals( value );
    }
  }
}
