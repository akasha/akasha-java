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
    valuesFromClass = GPURenderPassTimestampLocation.class
)
public @interface GPURenderPassTimestampLocation {
  @Nonnull
  String beginning = "beginning";

  @Nonnull
  String end = "end";

  final class Util {
    private Util() {
    }

    @GPURenderPassTimestampLocation
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPURenderPassTimestampLocation.beginning.equals( value ) || GPURenderPassTimestampLocation.end.equals( value );
    }
  }
}
