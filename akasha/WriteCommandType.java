package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = WriteCommandType.class
)
public @interface WriteCommandType {
  @Nonnull
  String seek = "seek";

  @Nonnull
  String truncate = "truncate";

  @Nonnull
  String write = "write";

  final class Util {
    private Util() {
    }

    @WriteCommandType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return WriteCommandType.seek.equals( value ) || WriteCommandType.truncate.equals( value ) || WriteCommandType.write.equals( value );
    }
  }
}
