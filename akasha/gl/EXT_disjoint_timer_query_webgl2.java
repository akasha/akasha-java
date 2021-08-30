package akasha.gl;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EXT_disjoint_timer_query_webgl2"
)
public class EXT_disjoint_timer_query_webgl2 extends JsObject implements WebGLExtension {
  @JsOverlay
  public static final int GPU_DISJOINT_EXT = 0x8FBB;

  @JsOverlay
  public static final String NAME = "EXT_disjoint_timer_query_webgl2";

  @JsOverlay
  public static final int QUERY_COUNTER_BITS_EXT = 0x8864;

  @JsOverlay
  public static final int TIMESTAMP_EXT = 0x8E28;

  @JsOverlay
  public static final int TIME_ELAPSED_EXT = 0x88BF;

  protected EXT_disjoint_timer_query_webgl2() {
  }

  public native void queryCounterEXT(@Nonnull WebGLQuery query, int target);
}
