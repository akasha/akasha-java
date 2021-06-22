package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUBlendOperation.class
)
public @interface GPUBlendOperation {
  @Nonnull
  String add = "add";

  @Nonnull
  String max = "max";

  @Nonnull
  String min = "min";

  @Nonnull
  String reverse_subtract = "reverse-subtract";

  @Nonnull
  String subtract = "subtract";

  final class Util {
    private Util() {
    }

    @GPUBlendOperation
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUBlendOperation.add.equals( value ) || GPUBlendOperation.max.equals( value ) || GPUBlendOperation.min.equals( value ) || GPUBlendOperation.reverse_subtract.equals( value ) || GPUBlendOperation.subtract.equals( value );
    }
  }
}
