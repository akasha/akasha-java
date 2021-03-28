package akasha.notifications;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = NotificationDirection.class
)
public @interface NotificationDirection {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String ltr = "ltr";

  @Nonnull
  String rtl = "rtl";

  final class Util {
    private Util() {
    }

    @NotificationDirection
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return NotificationDirection.auto.equals( value ) || NotificationDirection.ltr.equals( value ) || NotificationDirection.rtl.equals( value );
    }
  }
}
