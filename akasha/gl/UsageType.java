package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.STREAM_DRAW,
        WebGL2RenderingContext.STREAM_READ,
        WebGL2RenderingContext.STREAM_COPY,
        WebGL2RenderingContext.STATIC_DRAW,
        WebGL2RenderingContext.STATIC_READ,
        WebGL2RenderingContext.STATIC_COPY,
        WebGL2RenderingContext.DYNAMIC_DRAW,
        WebGL2RenderingContext.DYNAMIC_READ,
        WebGL2RenderingContext.DYNAMIC_COPY
    }
)
public @interface UsageType {
  final class Util {
    private Util() {
    }

    @UsageType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@UsageType annotated value must be one of [WebGL2RenderingContext.STATIC_DRAW, WebGL2RenderingContext.DYNAMIC_DRAW, WebGL2RenderingContext.STREAM_DRAW, WebGL2RenderingContext.STATIC_READ, WebGL2RenderingContext.DYNAMIC_READ, WebGL2RenderingContext.STREAM_READ, WebGL2RenderingContext.STATIC_COPY, WebGL2RenderingContext.DYNAMIC_COPY, WebGL2RenderingContext.STREAM_COPY] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.STATIC_DRAW == value || WebGL2RenderingContext.DYNAMIC_DRAW == value || WebGL2RenderingContext.STREAM_DRAW == value || WebGL2RenderingContext.STATIC_READ == value || WebGL2RenderingContext.DYNAMIC_READ == value || WebGL2RenderingContext.STREAM_READ == value || WebGL2RenderingContext.STATIC_COPY == value || WebGL2RenderingContext.DYNAMIC_COPY == value || WebGL2RenderingContext.STREAM_COPY == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.STATIC_DRAW == value ? "STATIC_DRAW" : WebGL2RenderingContext.DYNAMIC_DRAW == value ? "DYNAMIC_DRAW" : WebGL2RenderingContext.STREAM_DRAW == value ? "STREAM_DRAW" : WebGL2RenderingContext.STATIC_READ == value ? "STATIC_READ" : WebGL2RenderingContext.DYNAMIC_READ == value ? "DYNAMIC_READ" : WebGL2RenderingContext.STREAM_READ == value ? "STREAM_READ" : WebGL2RenderingContext.STATIC_COPY == value ? "STATIC_COPY" : WebGL2RenderingContext.DYNAMIC_COPY == value ? "DYNAMIC_COPY" : WebGL2RenderingContext.STREAM_COPY == value ? "STREAM_COPY" : "Unknown value " + value;
    }
  }
}
