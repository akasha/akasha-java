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
    valuesFromClass = GPUQueryType.class
)
public @interface GPUQueryType {
  @Nonnull
  String occlusion = "occlusion";

  @Nonnull
  String timestamp = "timestamp";

  final class Util {
    private Util() {
    }

    @GPUQueryType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUQueryType.occlusion.equals( value ) || GPUQueryType.timestamp.equals( value );
    }
  }
}
