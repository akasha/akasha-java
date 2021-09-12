package akasha.codecs;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = VideoMatrixCoefficients.class
)
public @interface VideoMatrixCoefficients {
  @Nonnull
  String bt470bg = "bt470bg";

  @Nonnull
  String bt709 = "bt709";

  @Nonnull
  String rgb = "rgb";

  @Nonnull
  String smpte170m = "smpte170m";

  final class Util {
    private Util() {
    }

    @VideoMatrixCoefficients
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return VideoMatrixCoefficients.bt470bg.equals( value ) || VideoMatrixCoefficients.bt709.equals( value ) || VideoMatrixCoefficients.rgb.equals( value ) || VideoMatrixCoefficients.smpte170m.equals( value );
    }
  }
}
