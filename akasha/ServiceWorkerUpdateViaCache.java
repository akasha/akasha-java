package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ServiceWorkerUpdateViaCache.class
)
public @interface ServiceWorkerUpdateViaCache {
  @Nonnull
  String all = "all";

  @Nonnull
  String imports = "imports";

  @Nonnull
  String none = "none";

  final class Util {
    private Util() {
    }

    @ServiceWorkerUpdateViaCache
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ServiceWorkerUpdateViaCache.all.equals( value ) || ServiceWorkerUpdateViaCache.imports.equals( value ) || ServiceWorkerUpdateViaCache.none.equals( value );
    }
  }
}
