package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUStencilOperation.class
)
public @interface GPUStencilOperation {
  @Nonnull
  String decrement_clamp = "decrement-clamp";

  @Nonnull
  String decrement_wrap = "decrement-wrap";

  @Nonnull
  String increment_clamp = "increment-clamp";

  @Nonnull
  String increment_wrap = "increment-wrap";

  @Nonnull
  String invert = "invert";

  @Nonnull
  String keep = "keep";

  @Nonnull
  String replace = "replace";

  @Nonnull
  String zero = "zero";

  final class Util {
    private Util() {
    }

    @GPUStencilOperation
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUStencilOperation.decrement_clamp.equals( value ) || GPUStencilOperation.decrement_wrap.equals( value ) || GPUStencilOperation.increment_clamp.equals( value ) || GPUStencilOperation.increment_wrap.equals( value ) || GPUStencilOperation.invert.equals( value ) || GPUStencilOperation.keep.equals( value ) || GPUStencilOperation.replace.equals( value ) || GPUStencilOperation.zero.equals( value );
    }
  }
}
