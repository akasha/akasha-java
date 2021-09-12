package akasha.codecs;

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
  String f32 = "f32";

  @Nonnull
  String f32_planar = "f32-planar";

  @Nonnull
  String s16 = "s16";

  @Nonnull
  String s16_planar = "s16-planar";

  @Nonnull
  String s32 = "s32";

  @Nonnull
  String s32_planar = "s32-planar";

  @Nonnull
  String u8 = "u8";

  @Nonnull
  String u8_planar = "u8-planar";

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
      return AudioSampleFormat.f32.equals( value ) || AudioSampleFormat.f32_planar.equals( value ) || AudioSampleFormat.s16.equals( value ) || AudioSampleFormat.s16_planar.equals( value ) || AudioSampleFormat.s32.equals( value ) || AudioSampleFormat.s32_planar.equals( value ) || AudioSampleFormat.u8.equals( value ) || AudioSampleFormat.u8_planar.equals( value );
    }
  }
}
