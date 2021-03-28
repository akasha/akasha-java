package akasha.idb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IDBTransactionMode.class
)
public @interface IDBTransactionMode {
  @Nonnull
  String readonly = "readonly";

  @Nonnull
  String readwrite = "readwrite";

  @Nonnull
  String versionchange = "versionchange";

  final class Util {
    private Util() {
    }

    @IDBTransactionMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return IDBTransactionMode.readonly.equals( value ) || IDBTransactionMode.readwrite.equals( value ) || IDBTransactionMode.versionchange.equals( value );
    }
  }
}
