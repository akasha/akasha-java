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
    valuesFromClass = GPUStoreOp.class
)
public @interface GPUStoreOp {
  @Nonnull
  String discard = "discard";

  @Nonnull
  String store = "store";

  final class Util {
    private Util() {
    }

    @GPUStoreOp
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUStoreOp.discard.equals( value ) || GPUStoreOp.store.equals( value );
    }
  }
}
