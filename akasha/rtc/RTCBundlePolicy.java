package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCBundlePolicy.class
)
public @interface RTCBundlePolicy {
  @Nonnull
  String balanced = "balanced";

  @Nonnull
  String max_bundle = "max-bundle";

  @Nonnull
  String max_compat = "max-compat";

  final class Util {
    private Util() {
    }

    @RTCBundlePolicy
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCBundlePolicy.balanced.equals( value ) || RTCBundlePolicy.max_bundle.equals( value ) || RTCBundlePolicy.max_compat.equals( value );
    }
  }
}
