package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TimelinePhase.class
)
public @interface TimelinePhase {
  @Nonnull
  String active = "active";

  @Nonnull
  String after = "after";

  @Nonnull
  String before = "before";

  @Nonnull
  String inactive = "inactive";

  final class Util {
    private Util() {
    }

    @TimelinePhase
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return TimelinePhase.active.equals( value ) || TimelinePhase.after.equals( value ) || TimelinePhase.before.equals( value ) || TimelinePhase.inactive.equals( value );
    }
  }
}
