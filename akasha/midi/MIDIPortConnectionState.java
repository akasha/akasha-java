package akasha.midi;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MIDIPortConnectionState.class
)
public @interface MIDIPortConnectionState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String open = "open";

  @Nonnull
  String pending = "pending";

  final class Util {
    private Util() {
    }

    @MIDIPortConnectionState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MIDIPortConnectionState.closed.equals( value ) || MIDIPortConnectionState.open.equals( value ) || MIDIPortConnectionState.pending.equals( value );
    }
  }
}
