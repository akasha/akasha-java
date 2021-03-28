package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        EventSource.CONNECTING,
        EventSource.OPEN,
        EventSource.CLOSED
    }
)
public @interface EventSourceReadyState {
  final class Util {
    private Util() {
    }

    @EventSourceReadyState
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@EventSourceReadyState annotated value must be one of [EventSource.CONNECTING, EventSource.OPEN, EventSource.CLOSED] but is " + value;
    }

    public static boolean isValid(final int value) {
      return EventSource.CONNECTING == value || EventSource.OPEN == value || EventSource.CLOSED == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return EventSource.CONNECTING == value ? "CONNECTING" : EventSource.OPEN == value ? "OPEN" : EventSource.CLOSED == value ? "CLOSED" : "Unknown value " + value;
    }
  }
}
