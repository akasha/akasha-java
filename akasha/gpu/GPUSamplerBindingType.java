package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUSamplerBindingType.class
)
public @interface GPUSamplerBindingType {
  @Nonnull
  String comparison = "comparison";

  @Nonnull
  String filtering = "filtering";

  @Nonnull
  String non_filtering = "non-filtering";

  final class Util {
    private Util() {
    }

    @GPUSamplerBindingType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUSamplerBindingType.comparison.equals( value ) || GPUSamplerBindingType.filtering.equals( value ) || GPUSamplerBindingType.non_filtering.equals( value );
    }
  }
}
