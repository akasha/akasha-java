package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUTextureSampleType.class
)
public @interface GPUTextureSampleType {
  @Nonnull
  String depth = "depth";

  @Nonnull
  String float_ = "float";

  @Nonnull
  String sint = "sint";

  @Nonnull
  String uint = "uint";

  @Nonnull
  String unfilterable_float = "unfilterable-float";

  final class Util {
    private Util() {
    }

    @GPUTextureSampleType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUTextureSampleType.depth.equals( value ) || GPUTextureSampleType.float_.equals( value ) || GPUTextureSampleType.sint.equals( value ) || GPUTextureSampleType.uint.equals( value ) || GPUTextureSampleType.unfilterable_float.equals( value );
    }
  }
}
