package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUAddressMode.class
)
public @interface GPUAddressMode {
  @Nonnull
  String clamp_to_edge = "clamp-to-edge";

  @Nonnull
  String mirror_repeat = "mirror-repeat";

  @Nonnull
  String repeat = "repeat";

  final class Util {
    private Util() {
    }

    @GPUAddressMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUAddressMode.clamp_to_edge.equals( value ) || GPUAddressMode.mirror_repeat.equals( value ) || GPUAddressMode.repeat.equals( value );
    }
  }
}
