package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRTextureType.class
)
public @interface XRTextureType {
  @Nonnull
  String texture = "texture";

  @Nonnull
  String texture_array = "texture-array";

  final class Util {
    private Util() {
    }

    @XRTextureType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRTextureType.texture.equals( value ) || XRTextureType.texture_array.equals( value );
    }
  }
}
