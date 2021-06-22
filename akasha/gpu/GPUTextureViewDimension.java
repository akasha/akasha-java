package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUTextureViewDimension.class
)
public @interface GPUTextureViewDimension {
  @Nonnull
  String _1d = "1d";

  @Nonnull
  String _2d = "2d";

  @Nonnull
  String _2d_array = "2d-array";

  @Nonnull
  String _3d = "3d";

  @Nonnull
  String cube = "cube";

  @Nonnull
  String cube_array = "cube-array";

  final class Util {
    private Util() {
    }

    @GPUTextureViewDimension
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUTextureViewDimension._1d.equals( value ) || GPUTextureViewDimension._2d.equals( value ) || GPUTextureViewDimension._2d_array.equals( value ) || GPUTextureViewDimension._3d.equals( value ) || GPUTextureViewDimension.cube.equals( value ) || GPUTextureViewDimension.cube_array.equals( value );
    }
  }
}
