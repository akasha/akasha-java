package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUCompilationMessageType.class
)
public @interface GPUCompilationMessageType {
  @Nonnull
  String error = "error";

  @Nonnull
  String info = "info";

  @Nonnull
  String warning = "warning";

  final class Util {
    private Util() {
    }

    @GPUCompilationMessageType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUCompilationMessageType.error.equals( value ) || GPUCompilationMessageType.info.equals( value ) || GPUCompilationMessageType.warning.equals( value );
    }
  }
}
