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
    valuesFromClass = GPUStorageTextureAccess.class
)
public @interface GPUStorageTextureAccess {
  @Nonnull
  String read_only = "read-only";

  @Nonnull
  String write_only = "write-only";

  final class Util {
    private Util() {
    }

    @GPUStorageTextureAccess
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUStorageTextureAccess.read_only.equals( value ) || GPUStorageTextureAccess.write_only.equals( value );
    }
  }
}
