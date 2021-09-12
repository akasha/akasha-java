package akasha.codecs;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = HardwareAcceleration.class
)
public @interface HardwareAcceleration {
  @Nonnull
  String no_preference = "no-preference";

  @Nonnull
  String prefer_hardware = "prefer-hardware";

  @Nonnull
  String prefer_software = "prefer-software";

  final class Util {
    private Util() {
    }

    @HardwareAcceleration
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return HardwareAcceleration.no_preference.equals( value ) || HardwareAcceleration.prefer_hardware.equals( value ) || HardwareAcceleration.prefer_software.equals( value );
    }
  }
}
