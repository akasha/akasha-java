package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ResizeObserverBoxOptions.class
)
public @interface ResizeObserverBoxOptions {
  @Nonnull
  String border_box = "border-box";

  @Nonnull
  String content_box = "content-box";

  @Nonnull
  String device_pixel_content_box = "device-pixel-content-box";

  final class Util {
    private Util() {
    }

    @ResizeObserverBoxOptions
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ResizeObserverBoxOptions.border_box.equals( value ) || ResizeObserverBoxOptions.content_box.equals( value ) || ResizeObserverBoxOptions.device_pixel_content_box.equals( value );
    }
  }
}
