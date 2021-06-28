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
    valuesFromClass = GPUPrimitiveTopology.class
)
public @interface GPUPrimitiveTopology {
  @Nonnull
  String line_list = "line-list";

  @Nonnull
  String line_strip = "line-strip";

  @Nonnull
  String point_list = "point-list";

  @Nonnull
  String triangle_list = "triangle-list";

  @Nonnull
  String triangle_strip = "triangle-strip";

  final class Util {
    private Util() {
    }

    @GPUPrimitiveTopology
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUPrimitiveTopology.line_list.equals( value ) || GPUPrimitiveTopology.line_strip.equals( value ) || GPUPrimitiveTopology.point_list.equals( value ) || GPUPrimitiveTopology.triangle_list.equals( value ) || GPUPrimitiveTopology.triangle_strip.equals( value );
    }
  }
}
