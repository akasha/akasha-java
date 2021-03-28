package akasha.idb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IDBTransactionDurability.class
)
public @interface IDBTransactionDurability {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String relaxed = "relaxed";

  @Nonnull
  String strict = "strict";

  final class Util {
    private Util() {
    }

    @IDBTransactionDurability
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return IDBTransactionDurability.default_.equals( value ) || IDBTransactionDurability.relaxed.equals( value ) || IDBTransactionDurability.strict.equals( value );
    }
  }
}
