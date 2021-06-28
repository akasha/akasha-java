package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@Documented
@MagicConstant(
    valuesFromClass = GPUErrorFilter.class
)
public @interface GPUErrorFilter {
  @Nonnull
  String out_of_memory = "out-of-memory";

  @Nonnull
  String validation = "validation";

  final class Util {
    private Util() {
    }

    @GPUErrorFilter
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUErrorFilter.out_of_memory.equals( value ) || GPUErrorFilter.validation.equals( value );
    }
  }
}
