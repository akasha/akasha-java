package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceComponent.class
)
public @interface RTCIceComponent {
  @Nonnull
  String rtcp = "rtcp";

  @Nonnull
  String rtp = "rtp";

  final class Util {
    private Util() {
    }

    @RTCIceComponent
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceComponent.rtcp.equals( value ) || RTCIceComponent.rtp.equals( value );
    }
  }
}
