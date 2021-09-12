package akasha.codecs;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = VideoPixelFormat.class
)
public @interface VideoPixelFormat {
  @Nonnull
  String BGRA = "BGRA";

  @Nonnull
  String BGRX = "BGRX";

  @Nonnull
  String I420 = "I420";

  @Nonnull
  String I420A = "I420A";

  @Nonnull
  String I422 = "I422";

  @Nonnull
  String I444 = "I444";

  @Nonnull
  String NV12 = "NV12";

  @Nonnull
  String RGBA = "RGBA";

  @Nonnull
  String RGBX = "RGBX";

  final class Util {
    private Util() {
    }

    @VideoPixelFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return VideoPixelFormat.BGRA.equals( value ) || VideoPixelFormat.BGRX.equals( value ) || VideoPixelFormat.I420.equals( value ) || VideoPixelFormat.I420A.equals( value ) || VideoPixelFormat.I422.equals( value ) || VideoPixelFormat.I444.equals( value ) || VideoPixelFormat.NV12.equals( value ) || VideoPixelFormat.RGBA.equals( value ) || VideoPixelFormat.RGBX.equals( value );
    }
  }
}
