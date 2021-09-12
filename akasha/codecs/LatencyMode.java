package akasha.codecs;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = LatencyMode.class
)
public @interface LatencyMode {
  @Nonnull
  String quality = "quality";

  @Nonnull
  String realtime = "realtime";

  final class Util {
    private Util() {
    }

    @LatencyMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return LatencyMode.quality.equals( value ) || LatencyMode.realtime.equals( value );
    }
  }
}
