package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.READ_FRAMEBUFFER,
        WebGL2RenderingContext.DRAW_FRAMEBUFFER,
        WebGL2RenderingContext.FRAMEBUFFER
    }
)
public @interface FramebufferTargetType {
  final class Util {
    private Util() {
    }

    @FramebufferTargetType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@FramebufferTargetType annotated value must be one of [WebGL2RenderingContext.FRAMEBUFFER, WebGL2RenderingContext.DRAW_FRAMEBUFFER, WebGL2RenderingContext.READ_FRAMEBUFFER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.FRAMEBUFFER == value || WebGL2RenderingContext.DRAW_FRAMEBUFFER == value || WebGL2RenderingContext.READ_FRAMEBUFFER == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.FRAMEBUFFER == value ? "FRAMEBUFFER" : WebGL2RenderingContext.DRAW_FRAMEBUFFER == value ? "DRAW_FRAMEBUFFER" : WebGL2RenderingContext.READ_FRAMEBUFFER == value ? "READ_FRAMEBUFFER" : "Unknown value " + value;
    }
  }
}
