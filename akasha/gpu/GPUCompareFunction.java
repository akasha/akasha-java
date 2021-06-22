package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUCompareFunction.class
)
public @interface GPUCompareFunction {
  @Nonnull
  String always = "always";

  @Nonnull
  String equal = "equal";

  @Nonnull
  String greater = "greater";

  @Nonnull
  String greater_equal = "greater-equal";

  @Nonnull
  String less = "less";

  @Nonnull
  String less_equal = "less-equal";

  @Nonnull
  String never = "never";

  @Nonnull
  String not_equal = "not-equal";

  final class Util {
    private Util() {
    }

    @GPUCompareFunction
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUCompareFunction.always.equals( value ) || GPUCompareFunction.equal.equals( value ) || GPUCompareFunction.greater.equals( value ) || GPUCompareFunction.greater_equal.equals( value ) || GPUCompareFunction.less.equals( value ) || GPUCompareFunction.less_equal.equals( value ) || GPUCompareFunction.never.equals( value ) || GPUCompareFunction.not_equal.equals( value );
    }
  }
}
