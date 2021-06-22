package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUCanvasCompositingAlphaMode.class
)
public @interface GPUCanvasCompositingAlphaMode {
  @Nonnull
  String opaque = "opaque";

  @Nonnull
  String premultiplied = "premultiplied";

  final class Util {
    private Util() {
    }

    @GPUCanvasCompositingAlphaMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUCanvasCompositingAlphaMode.opaque.equals( value ) || GPUCanvasCompositingAlphaMode.premultiplied.equals( value );
    }
  }
}
