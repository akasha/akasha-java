package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCSdpType.class
)
public @interface RTCSdpType {
  @Nonnull
  String answer = "answer";

  @Nonnull
  String offer = "offer";

  @Nonnull
  String pranswer = "pranswer";

  @Nonnull
  String rollback = "rollback";

  final class Util {
    private Util() {
    }

    @RTCSdpType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCSdpType.answer.equals( value ) || RTCSdpType.offer.equals( value ) || RTCSdpType.pranswer.equals( value ) || RTCSdpType.rollback.equals( value );
    }
  }
}
