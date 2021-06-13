package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        GeolocationPositionError.PERMISSION_DENIED,
        GeolocationPositionError.POSITION_UNAVAILABLE,
        GeolocationPositionError.TIMEOUT
    }
)
public @interface GeolocationPositionErrorCode {
  final class Util {
    private Util() {
    }

    @GeolocationPositionErrorCode
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@GeolocationPositionErrorCode annotated value must be one of [GeolocationPositionError.PERMISSION_DENIED, GeolocationPositionError.POSITION_UNAVAILABLE, GeolocationPositionError.TIMEOUT] but is " + value;
    }

    public static boolean isValid(final int value) {
      return GeolocationPositionError.PERMISSION_DENIED == value || GeolocationPositionError.POSITION_UNAVAILABLE == value || GeolocationPositionError.TIMEOUT == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return GeolocationPositionError.PERMISSION_DENIED == value ? "PERMISSION_DENIED" : GeolocationPositionError.POSITION_UNAVAILABLE == value ? "POSITION_UNAVAILABLE" : GeolocationPositionError.TIMEOUT == value ? "TIMEOUT" : "Unknown value " + value;
    }
  }
}
