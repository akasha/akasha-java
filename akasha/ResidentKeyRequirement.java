package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ResidentKeyRequirement.class
)
public @interface ResidentKeyRequirement {
  @Nonnull
  String discouraged = "discouraged";

  @Nonnull
  String preferred = "preferred";

  @Nonnull
  String required = "required";

  final class Util {
    private Util() {
    }

    @ResidentKeyRequirement
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ResidentKeyRequirement.discouraged.equals( value ) || ResidentKeyRequirement.preferred.equals( value ) || ResidentKeyRequirement.required.equals( value );
    }
  }
}
