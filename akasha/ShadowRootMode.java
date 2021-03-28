package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ShadowRootMode.class
)
public @interface ShadowRootMode {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String open = "open";

  final class Util {
    private Util() {
    }

    @ShadowRootMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ShadowRootMode.closed.equals( value ) || ShadowRootMode.open.equals( value );
    }
  }
}
