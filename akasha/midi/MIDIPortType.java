package akasha.midi;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MIDIPortType.class
)
public @interface MIDIPortType {
  @Nonnull
  String input = "input";

  @Nonnull
  String output = "output";

  final class Util {
    private Util() {
    }

    @MIDIPortType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MIDIPortType.input.equals( value ) || MIDIPortType.output.equals( value );
    }
  }
}
