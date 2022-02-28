package akasha;

import akasha.core.Float32Array;
import akasha.core.Float64Array;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The DOMMatrix interface represents 4&times;4 matrices, suitable for 2D and 3D operations including rotation and translation. It is a mutable version of the DOMMatrixReadOnly interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix">DOMMatrix - MDN</a>
 * @see <a href="https://drafts.fxtf.org/geometry/#DOMMatrix"># DOMMatrix</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMMatrix"
)
public class DOMMatrix extends DOMMatrixReadOnly {
  public double a;

  public double b;

  public double c;

  public double d;

  public double e;

  public double f;

  public double m11;

  public double m12;

  public double m13;

  public double m14;

  public double m21;

  public double m22;

  public double m23;

  public double m24;

  public double m31;

  public double m32;

  public double m33;

  public double m34;

  public double m41;

  public double m42;

  public double m43;

  public double m44;

  /**
   * The DOMMatrix constructor creates a new DOMMatrix object which represents 4x4 matrices, suitable for 2D and 3D operations..
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix">DOMMatrix.DOMMatrix - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrix - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrix(@Nonnull final String init) {
  }

  /**
   * The DOMMatrix constructor creates a new DOMMatrix object which represents 4x4 matrices, suitable for 2D and 3D operations..
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix">DOMMatrix.DOMMatrix - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrix - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrix(@Nonnull final JsArray<Double> init) {
  }

  /**
   * The DOMMatrix constructor creates a new DOMMatrix object which represents 4x4 matrices, suitable for 2D and 3D operations..
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix">DOMMatrix.DOMMatrix - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrix - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrix(@Nonnull final double[] init) {
  }

  /**
   * The DOMMatrix constructor creates a new DOMMatrix object which represents 4x4 matrices, suitable for 2D and 3D operations..
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix">DOMMatrix.DOMMatrix - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrix - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrix() {
  }

  @JsNonNull
  public static native DOMMatrix fromFloat32Array(@Nonnull Float32Array array32);

  @JsNonNull
  public static native DOMMatrix fromFloat64Array(@Nonnull Float64Array array64);

  @JsNonNull
  public static native DOMMatrix fromMatrix(@Nonnull DOMMatrixInit other);

  @JsNonNull
  public static native DOMMatrix fromMatrix();

  @JsNonNull
  public native DOMMatrix invertSelf();

  @JsNonNull
  public native DOMMatrix multiplySelf(@Nonnull DOMMatrixInit other);

  @JsNonNull
  public native DOMMatrix multiplySelf();

  @JsNonNull
  public native DOMMatrix preMultiplySelf(@Nonnull DOMMatrixInit other);

  @JsNonNull
  public native DOMMatrix preMultiplySelf();

  @JsNonNull
  public native DOMMatrix rotateAxisAngleSelf(double x, double y, double z, double angle);

  @JsNonNull
  public native DOMMatrix rotateAxisAngleSelf(double x, double y, double z);

  @JsNonNull
  public native DOMMatrix rotateAxisAngleSelf(double x, double y);

  @JsNonNull
  public native DOMMatrix rotateAxisAngleSelf(double x);

  @JsNonNull
  public native DOMMatrix rotateAxisAngleSelf();

  @JsNonNull
  public native DOMMatrix rotateFromVectorSelf(double x, double y);

  @JsNonNull
  public native DOMMatrix rotateFromVectorSelf(double x);

  @JsNonNull
  public native DOMMatrix rotateFromVectorSelf();

  @JsNonNull
  public native DOMMatrix rotateSelf(double rotX, double rotY, double rotZ);

  @JsNonNull
  public native DOMMatrix rotateSelf(double rotX, double rotY);

  @JsNonNull
  public native DOMMatrix rotateSelf(double rotX);

  @JsNonNull
  public native DOMMatrix rotateSelf();

  @JsNonNull
  public native DOMMatrix scale3dSelf(double scale, double originX, double originY, double originZ);

  @JsNonNull
  public native DOMMatrix scale3dSelf(double scale, double originX, double originY);

  @JsNonNull
  public native DOMMatrix scale3dSelf(double scale, double originX);

  @JsNonNull
  public native DOMMatrix scale3dSelf(double scale);

  @JsNonNull
  public native DOMMatrix scale3dSelf();

  @JsNonNull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX,
      double originY, double originZ);

  @JsNonNull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX,
      double originY);

  @JsNonNull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX);

  @JsNonNull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ);

  @JsNonNull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY);

  @JsNonNull
  public native DOMMatrix scaleSelf(double scaleX);

  @JsNonNull
  public native DOMMatrix scaleSelf();

  @JsNonNull
  public native DOMMatrix setMatrixValue(@Nonnull String transformList);

  @JsNonNull
  public native DOMMatrix skewXSelf(double sx);

  @JsNonNull
  public native DOMMatrix skewXSelf();

  @JsNonNull
  public native DOMMatrix skewYSelf(double sy);

  @JsNonNull
  public native DOMMatrix skewYSelf();

  @JsNonNull
  public native DOMMatrix translateSelf(double tx, double ty, double tz);

  @JsNonNull
  public native DOMMatrix translateSelf(double tx, double ty);

  @JsNonNull
  public native DOMMatrix translateSelf(double tx);

  @JsNonNull
  public native DOMMatrix translateSelf();
}
