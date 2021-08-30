package akasha;

import akasha.core.Float32Array;
import akasha.core.Float64Array;
import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DOMMatrixReadOnly interface represents a read-only 4&times;4 matrix, suitable for 2D and 3D operations. The DOMMatrix interrface&mdash;which is based upon DOMMatrixReadOnly&mdash;adds mutability, allowing you to alter the matrix after creating it.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly">DOMMatrixReadOnly - MDN</a>
 * @see <a href="https://drafts.fxtf.org/geometry/#DOMMatrix">(Geometry Interfaces 1) # DOMMatrix</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMMatrixReadOnly"
)
public class DOMMatrixReadOnly extends JsObject {
  /**
   * The DOMMatrixReadOnly constructor creates a new DOMMatrixReadOnly object which represents 4x4 matrices, suitable for 2D and 3D operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/DOMMatrixReadOnly">DOMMatrixReadOnly.DOMMatrixReadOnly - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrixReadOnly - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrixReadOnly(@Nonnull final String init) {
  }

  /**
   * The DOMMatrixReadOnly constructor creates a new DOMMatrixReadOnly object which represents 4x4 matrices, suitable for 2D and 3D operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/DOMMatrixReadOnly">DOMMatrixReadOnly.DOMMatrixReadOnly - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrixReadOnly - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrixReadOnly(@Nonnull final JsArray<Double> init) {
  }

  /**
   * The DOMMatrixReadOnly constructor creates a new DOMMatrixReadOnly object which represents 4x4 matrices, suitable for 2D and 3D operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/DOMMatrixReadOnly">DOMMatrixReadOnly.DOMMatrixReadOnly - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrixReadOnly - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrixReadOnly(@Nonnull final double[] init) {
  }

  /**
   * The DOMMatrixReadOnly constructor creates a new DOMMatrixReadOnly object which represents 4x4 matrices, suitable for 2D and 3D operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/DOMMatrixReadOnly">DOMMatrixReadOnly.DOMMatrixReadOnly - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrixReadOnly - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrixReadOnly() {
  }

  @JsProperty(
      name = "a"
  )
  public native double a();

  @JsProperty(
      name = "b"
  )
  public native double b();

  @JsProperty(
      name = "c"
  )
  public native double c();

  @JsProperty(
      name = "d"
  )
  public native double d();

  @JsProperty(
      name = "e"
  )
  public native double e();

  @JsProperty(
      name = "f"
  )
  public native double f();

  @JsProperty(
      name = "is2D"
  )
  public native boolean is2D();

  @JsProperty(
      name = "isIdentity"
  )
  public native boolean isIdentity();

  @JsProperty(
      name = "m11"
  )
  public native double m11();

  @JsProperty(
      name = "m12"
  )
  public native double m12();

  @JsProperty(
      name = "m13"
  )
  public native double m13();

  @JsProperty(
      name = "m14"
  )
  public native double m14();

  @JsProperty(
      name = "m21"
  )
  public native double m21();

  @JsProperty(
      name = "m22"
  )
  public native double m22();

  @JsProperty(
      name = "m23"
  )
  public native double m23();

  @JsProperty(
      name = "m24"
  )
  public native double m24();

  @JsProperty(
      name = "m31"
  )
  public native double m31();

  @JsProperty(
      name = "m32"
  )
  public native double m32();

  @JsProperty(
      name = "m33"
  )
  public native double m33();

  @JsProperty(
      name = "m34"
  )
  public native double m34();

  @JsProperty(
      name = "m41"
  )
  public native double m41();

  @JsProperty(
      name = "m42"
  )
  public native double m42();

  @JsProperty(
      name = "m43"
  )
  public native double m43();

  @JsProperty(
      name = "m44"
  )
  public native double m44();

  @JsNonNull
  public static native DOMMatrixReadOnly fromFloat32Array(@Nonnull Float32Array array32);

  @JsNonNull
  public static native DOMMatrixReadOnly fromFloat64Array(@Nonnull Float64Array array64);

  @JsNonNull
  public static native DOMMatrixReadOnly fromMatrix(@Nonnull DOMMatrixInit other);

  @JsNonNull
  public static native DOMMatrixReadOnly fromMatrix();

  /**
   * The flipX() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix flipped about the x-axis.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/flipX">DOMMatrixReadOnly.flipX - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-flipx">DOMMatrixReadOnly.flipX() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix flipX();

  @JsNonNull
  public native DOMMatrix flipY();

  @JsNonNull
  public native DOMMatrix inverse();

  @JsNonNull
  public native DOMMatrix multiply(@Nonnull DOMMatrixInit other);

  @JsNonNull
  public native DOMMatrix multiply();

  @JsNonNull
  public native DOMMatrix rotate(double rotX, double rotY, double rotZ);

  @JsNonNull
  public native DOMMatrix rotate(double rotX, double rotY);

  @JsNonNull
  public native DOMMatrix rotate(double rotX);

  @JsNonNull
  public native DOMMatrix rotate();

  @JsNonNull
  public native DOMMatrix rotateAxisAngle(double x, double y, double z, double angle);

  @JsNonNull
  public native DOMMatrix rotateAxisAngle(double x, double y, double z);

  @JsNonNull
  public native DOMMatrix rotateAxisAngle(double x, double y);

  @JsNonNull
  public native DOMMatrix rotateAxisAngle(double x);

  @JsNonNull
  public native DOMMatrix rotateAxisAngle();

  @JsNonNull
  public native DOMMatrix rotateFromVector(double x, double y);

  @JsNonNull
  public native DOMMatrix rotateFromVector(double x);

  @JsNonNull
  public native DOMMatrix rotateFromVector();

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/scale">DOMMatrixReadOnly.scale - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-scale">DOMMatrixReadOnly.scale() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX,
      double originY, double originZ);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/scale">DOMMatrixReadOnly.scale - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-scale">DOMMatrixReadOnly.scale() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX,
      double originY);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/scale">DOMMatrixReadOnly.scale - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-scale">DOMMatrixReadOnly.scale() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/scale">DOMMatrixReadOnly.scale - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-scale">DOMMatrixReadOnly.scale() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix scale(double scaleX, double scaleY, double scaleZ);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/scale">DOMMatrixReadOnly.scale - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-scale">DOMMatrixReadOnly.scale() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix scale(double scaleX, double scaleY);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/scale">DOMMatrixReadOnly.scale - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-scale">DOMMatrixReadOnly.scale() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix scale(double scaleX);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/scale">DOMMatrixReadOnly.scale - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-scale">DOMMatrixReadOnly.scale() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix scale();

  @JsNonNull
  public native DOMMatrix scale3d(double scale, double originX, double originY, double originZ);

  @JsNonNull
  public native DOMMatrix scale3d(double scale, double originX, double originY);

  @JsNonNull
  public native DOMMatrix scale3d(double scale, double originX);

  @JsNonNull
  public native DOMMatrix scale3d(double scale);

  @JsNonNull
  public native DOMMatrix scale3d();

  @JsNonNull
  public native DOMMatrix scaleNonUniform(double scaleX, double scaleY);

  @JsNonNull
  public native DOMMatrix scaleNonUniform(double scaleX);

  @JsNonNull
  public native DOMMatrix scaleNonUniform();

  @JsNonNull
  public native DOMMatrix skewX(double sx);

  @JsNonNull
  public native DOMMatrix skewX();

  @JsNonNull
  public native DOMMatrix skewY(double sy);

  @JsNonNull
  public native DOMMatrix skewY();

  @JsNonNull
  public native Float32Array toFloat32Array();

  @JsNonNull
  public native Float64Array toFloat64Array();

  @JsNonNull
  public native JsObject toJSON();

  @JsNonNull
  public native DOMPoint transformPoint(@Nonnull DOMPointInit point);

  @JsNonNull
  public native DOMPoint transformPoint();

  /**
   * The translate() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix with a translation applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/translate">DOMMatrixReadOnly.translate - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-translate">DOMMatrixReadOnly.translate() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix translate(double tx, double ty, double tz);

  /**
   * The translate() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix with a translation applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/translate">DOMMatrixReadOnly.translate - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-translate">DOMMatrixReadOnly.translate() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix translate(double tx, double ty);

  /**
   * The translate() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix with a translation applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/translate">DOMMatrixReadOnly.translate - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-translate">DOMMatrixReadOnly.translate() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix translate(double tx);

  /**
   * The translate() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix with a translation applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrixReadOnly/translate">DOMMatrixReadOnly.translate - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-translate">DOMMatrixReadOnly.translate() - Geometry Interfaces Module Level 1</a>
   */
  @JsNonNull
  public native DOMMatrix translate();
}
