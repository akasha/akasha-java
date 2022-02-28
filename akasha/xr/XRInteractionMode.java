package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRInteractionMode.class
)
public @interface XRInteractionMode {
  @Nonnull
  String screen_space = "screen-space";

  @Nonnull
  String world_space = "world-space";

  final class Util {
    private Util() {
    }

    @XRInteractionMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRInteractionMode.screen_space.equals( value ) || XRInteractionMode.world_space.equals( value );
    }
  }
}
