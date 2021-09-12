package akasha.codecs;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = VideoTransferCharacteristics.class
)
public @interface VideoTransferCharacteristics {
  @Nonnull
  String bt709 = "bt709";

  @Nonnull
  String iec61966_2_1 = "iec61966-2-1";

  @Nonnull
  String smpte170m = "smpte170m";

  final class Util {
    private Util() {
    }

    @VideoTransferCharacteristics
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return VideoTransferCharacteristics.bt709.equals( value ) || VideoTransferCharacteristics.iec61966_2_1.equals( value ) || VideoTransferCharacteristics.smpte170m.equals( value );
    }
  }
}
