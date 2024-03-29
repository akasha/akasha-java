package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A DOMQuad is a collection of four DOMPoints defining the corners of an arbitrary quadrilateral. Returning DOMQuads lets getBoxQuads() return accurate information even when arbitrary 2D or 3D transforms are present. It has a handy bounds attribute returning a DOMRectReadOnly for those cases where you just want an axis-aligned bounding rectangle.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMQuad">DOMQuad - MDN</a>
 * @see <a href="https://drafts.fxtf.org/geometry/#DOMQuad"># DOMQuad</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMQuad"
)
public class DOMQuad extends JsObject {
  public DOMQuad(@Nonnull final DOMPointInit p1, @Nonnull final DOMPointInit p2,
      @Nonnull final DOMPointInit p3, @Nonnull final DOMPointInit p4) {
  }

  public DOMQuad(@Nonnull final DOMPointInit p1, @Nonnull final DOMPointInit p2,
      @Nonnull final DOMPointInit p3) {
  }

  public DOMQuad(@Nonnull final DOMPointInit p1, @Nonnull final DOMPointInit p2) {
  }

  public DOMQuad(@Nonnull final DOMPointInit p1) {
  }

  public DOMQuad() {
  }

  @JsProperty(
      name = "p1"
  )
  @Nonnull
  public native DOMPoint p1();

  @JsProperty(
      name = "p2"
  )
  @Nonnull
  public native DOMPoint p2();

  @JsProperty(
      name = "p3"
  )
  @Nonnull
  public native DOMPoint p3();

  @JsProperty(
      name = "p4"
  )
  @Nonnull
  public native DOMPoint p4();

  @JsNonNull
  public static native DOMQuad fromQuad(@Nonnull DOMQuadInit other);

  @JsNonNull
  public static native DOMQuad fromQuad();

  @JsNonNull
  public static native DOMQuad fromRect(@Nonnull DOMRectInit other);

  @JsNonNull
  public static native DOMQuad fromRect();

  @JsNonNull
  public native DOMRect getBounds();

  @JsNonNull
  public native JsObject toJSON();
}
