package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUInputStepMode.class
)
public @interface GPUInputStepMode {
  @Nonnull
  String instance = "instance";

  @Nonnull
  String vertex = "vertex";

  final class Util {
    private Util() {
    }

    @GPUInputStepMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUInputStepMode.instance.equals( value ) || GPUInputStepMode.vertex.equals( value );
    }
  }
}
