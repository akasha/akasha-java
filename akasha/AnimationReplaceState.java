package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AnimationReplaceState.class
)
public @interface AnimationReplaceState {
  @Nonnull
  String active = "active";

  @Nonnull
  String persisted = "persisted";

  @Nonnull
  String removed = "removed";

  final class Util {
    private Util() {
    }

    @AnimationReplaceState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AnimationReplaceState.active.equals( value ) || AnimationReplaceState.persisted.equals( value ) || AnimationReplaceState.removed.equals( value );
    }
  }
}
