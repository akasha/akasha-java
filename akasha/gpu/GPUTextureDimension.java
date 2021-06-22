package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUTextureDimension.class
)
public @interface GPUTextureDimension {
  @Nonnull
  String _1d = "1d";

  @Nonnull
  String _2d = "2d";

  @Nonnull
  String _3d = "3d";

  final class Util {
    private Util() {
    }

    @GPUTextureDimension
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUTextureDimension._1d.equals( value ) || GPUTextureDimension._2d.equals( value ) || GPUTextureDimension._3d.equals( value );
    }
  }
}
