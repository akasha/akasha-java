package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = SlotAssignmentMode.class
)
public @interface SlotAssignmentMode {
  @Nonnull
  String manual = "manual";

  @Nonnull
  String named = "named";

  final class Util {
    private Util() {
    }

    @SlotAssignmentMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return SlotAssignmentMode.manual.equals( value ) || SlotAssignmentMode.named.equals( value );
    }
  }
}
