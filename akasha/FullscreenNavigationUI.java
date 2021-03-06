package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FullscreenNavigationUI.class
)
public @interface FullscreenNavigationUI {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String hide = "hide";

  @Nonnull
  String show = "show";

  final class Util {
    private Util() {
    }

    @FullscreenNavigationUI
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return FullscreenNavigationUI.auto.equals( value ) || FullscreenNavigationUI.hide.equals( value ) || FullscreenNavigationUI.show.equals( value );
    }
  }
}
