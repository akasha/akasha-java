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
    valuesFromClass = GPUBlendFactor.class
)
public @interface GPUBlendFactor {
  @Nonnull
  String constant = "constant";

  @Nonnull
  String dst = "dst";

  @Nonnull
  String dst_alpha = "dst-alpha";

  @Nonnull
  String one = "one";

  @Nonnull
  String one_minus_constant = "one-minus-constant";

  @Nonnull
  String one_minus_dst = "one-minus-dst";

  @Nonnull
  String one_minus_dst_alpha = "one-minus-dst-alpha";

  @Nonnull
  String one_minus_src = "one-minus-src";

  @Nonnull
  String one_minus_src_alpha = "one-minus-src-alpha";

  @Nonnull
  String src = "src";

  @Nonnull
  String src_alpha = "src-alpha";

  @Nonnull
  String src_alpha_saturated = "src-alpha-saturated";

  @Nonnull
  String zero = "zero";

  final class Util {
    private Util() {
    }

    @GPUBlendFactor
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUBlendFactor.constant.equals( value ) || GPUBlendFactor.dst.equals( value ) || GPUBlendFactor.dst_alpha.equals( value ) || GPUBlendFactor.one.equals( value ) || GPUBlendFactor.one_minus_constant.equals( value ) || GPUBlendFactor.one_minus_dst.equals( value ) || GPUBlendFactor.one_minus_dst_alpha.equals( value ) || GPUBlendFactor.one_minus_src.equals( value ) || GPUBlendFactor.one_minus_src_alpha.equals( value ) || GPUBlendFactor.src.equals( value ) || GPUBlendFactor.src_alpha.equals( value ) || GPUBlendFactor.src_alpha_saturated.equals( value ) || GPUBlendFactor.zero.equals( value );
    }
  }
}
