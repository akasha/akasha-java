package akasha.midi;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MIDIPortDeviceState.class
)
public @interface MIDIPortDeviceState {
  @Nonnull
  String connected = "connected";

  @Nonnull
  String disconnected = "disconnected";

  final class Util {
    private Util() {
    }

    @MIDIPortDeviceState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MIDIPortDeviceState.connected.equals( value ) || MIDIPortDeviceState.disconnected.equals( value );
    }
  }
}
