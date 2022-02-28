package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRLayerLayout.class
)
public @interface XRLayerLayout {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String mono = "mono";

  @Nonnull
  String stereo = "stereo";

  @Nonnull
  String stereo_left_right = "stereo-left-right";

  @Nonnull
  String stereo_top_bottom = "stereo-top-bottom";

  final class Util {
    private Util() {
    }

    @XRLayerLayout
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRLayerLayout.default_.equals( value ) || XRLayerLayout.mono.equals( value ) || XRLayerLayout.stereo.equals( value ) || XRLayerLayout.stereo_left_right.equals( value ) || XRLayerLayout.stereo_top_bottom.equals( value );
    }
  }
}
