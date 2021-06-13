package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AudioSampleFormat.class
)
public @interface AudioSampleFormat {
  @Nonnull
  String FLT = "FLT";

  @Nonnull
  String FLTP = "FLTP";

  @Nonnull
  String S16 = "S16";

  @Nonnull
  String S16P = "S16P";

  @Nonnull
  String S24 = "S24";

  @Nonnull
  String S24P = "S24P";

  @Nonnull
  String S32 = "S32";

  @Nonnull
  String S32P = "S32P";

  @Nonnull
  String U8 = "U8";

  @Nonnull
  String U8P = "U8P";

  final class Util {
    private Util() {
    }

    @AudioSampleFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AudioSampleFormat.FLT.equals( value ) || AudioSampleFormat.FLTP.equals( value ) || AudioSampleFormat.S16.equals( value ) || AudioSampleFormat.S16P.equals( value ) || AudioSampleFormat.S24.equals( value ) || AudioSampleFormat.S24P.equals( value ) || AudioSampleFormat.S32.equals( value ) || AudioSampleFormat.S32P.equals( value ) || AudioSampleFormat.U8.equals( value ) || AudioSampleFormat.U8P.equals( value );
    }
  }
}
