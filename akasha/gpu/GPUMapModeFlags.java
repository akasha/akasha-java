package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    flags = {
        GPUMapMode.READ,
        GPUMapMode.WRITE
    }
)
public @interface GPUMapModeFlags {
  final class Util {
    private Util() {
    }

    @GPUMapModeFlags
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@GPUMapModeFlags annotated value must be one of [GPUMapMode.READ, GPUMapMode.WRITE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return GPUMapMode.READ == value || GPUMapMode.WRITE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return GPUMapMode.READ == value ? "READ" : GPUMapMode.WRITE == value ? "WRITE" : "Unknown value " + value;
    }
  }
}
