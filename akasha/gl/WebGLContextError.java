package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.NO_ERROR,
        WebGL2RenderingContext.INVALID_ENUM,
        WebGL2RenderingContext.INVALID_VALUE,
        WebGL2RenderingContext.INVALID_OPERATION,
        WebGL2RenderingContext.OUT_OF_MEMORY,
        WebGL2RenderingContext.INVALID_FRAMEBUFFER_OPERATION,
        WebGL2RenderingContext.CONTEXT_LOST_WEBGL
    }
)
public @interface WebGLContextError {
  final class Util {
    private Util() {
    }

    @WebGLContextError
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@WebGLContextError annotated value must be one of [WebGL2RenderingContext.NO_ERROR, WebGL2RenderingContext.INVALID_ENUM, WebGL2RenderingContext.INVALID_VALUE, WebGL2RenderingContext.INVALID_OPERATION, WebGL2RenderingContext.INVALID_FRAMEBUFFER_OPERATION, WebGL2RenderingContext.OUT_OF_MEMORY, WebGL2RenderingContext.CONTEXT_LOST_WEBGL] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.NO_ERROR == value || WebGL2RenderingContext.INVALID_ENUM == value || WebGL2RenderingContext.INVALID_VALUE == value || WebGL2RenderingContext.INVALID_OPERATION == value || WebGL2RenderingContext.INVALID_FRAMEBUFFER_OPERATION == value || WebGL2RenderingContext.OUT_OF_MEMORY == value || WebGL2RenderingContext.CONTEXT_LOST_WEBGL == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.NO_ERROR == value ? "NO_ERROR" : WebGL2RenderingContext.INVALID_ENUM == value ? "INVALID_ENUM" : WebGL2RenderingContext.INVALID_VALUE == value ? "INVALID_VALUE" : WebGL2RenderingContext.INVALID_OPERATION == value ? "INVALID_OPERATION" : WebGL2RenderingContext.INVALID_FRAMEBUFFER_OPERATION == value ? "INVALID_FRAMEBUFFER_OPERATION" : WebGL2RenderingContext.OUT_OF_MEMORY == value ? "OUT_OF_MEMORY" : WebGL2RenderingContext.CONTEXT_LOST_WEBGL == value ? "CONTEXT_LOST_WEBGL" : "Unknown value " + value;
    }
  }
}
