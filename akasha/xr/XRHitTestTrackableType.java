package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRHitTestTrackableType.class
)
public @interface XRHitTestTrackableType {
  @Nonnull
  String mesh = "mesh";

  @Nonnull
  String plane = "plane";

  @Nonnull
  String point = "point";

  final class Util {
    private Util() {
    }

    @XRHitTestTrackableType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRHitTestTrackableType.mesh.equals( value ) || XRHitTestTrackableType.plane.equals( value ) || XRHitTestTrackableType.point.equals( value );
    }
  }
}
