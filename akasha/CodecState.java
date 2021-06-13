package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CodecState.class
)
public @interface CodecState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String configured = "configured";

  @Nonnull
  String unconfigured = "unconfigured";

  final class Util {
    private Util() {
    }

    @CodecState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CodecState.closed.equals( value ) || CodecState.configured.equals( value ) || CodecState.unconfigured.equals( value );
    }
  }
}
