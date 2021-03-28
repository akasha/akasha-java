package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceGatheringState.class
)
public @interface RTCIceGatheringState {
  @Nonnull
  String complete = "complete";

  @Nonnull
  String gathering = "gathering";

  @Nonnull
  String new_ = "new";

  final class Util {
    private Util() {
    }

    @RTCIceGatheringState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceGatheringState.complete.equals( value ) || RTCIceGatheringState.gathering.equals( value ) || RTCIceGatheringState.new_.equals( value );
    }
  }
}
