package akasha.codecs;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = EncodedAudioChunkType.class
)
public @interface EncodedAudioChunkType {
  @Nonnull
  String delta = "delta";

  @Nonnull
  String key = "key";

  final class Util {
    private Util() {
    }

    @EncodedAudioChunkType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return EncodedAudioChunkType.delta.equals( value ) || EncodedAudioChunkType.key.equals( value );
    }
  }
}
