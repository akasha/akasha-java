package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRDOMOverlayType.class
)
public @interface XRDOMOverlayType {
  @Nonnull
  String floating = "floating";

  @Nonnull
  String head_locked = "head-locked";

  @Nonnull
  String screen = "screen";

  final class Util {
    private Util() {
    }

    @XRDOMOverlayType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRDOMOverlayType.floating.equals( value ) || XRDOMOverlayType.head_locked.equals( value ) || XRDOMOverlayType.screen.equals( value );
    }
  }
}
