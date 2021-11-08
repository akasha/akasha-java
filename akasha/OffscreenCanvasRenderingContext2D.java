package akasha;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OffscreenCanvasRenderingContext2D"
)
public class OffscreenCanvasRenderingContext2D extends JsObject implements OffscreenRenderingContext {
  @JsNonNull
  @CanvasDirection
  public String direction;

  @JsNonNull
  public StringOrCanvasGradientOrCanvasPatternUnion fillStyle;

  @JsNonNull
  public String filter;

  @JsNonNull
  public String font;

  @JsNonNull
  @CanvasFontKerning
  public String fontKerning;

  @JsNonNull
  @CanvasFontStretch
  public String fontStretch;

  @JsNonNull
  @CanvasFontVariantCaps
  public String fontVariantCaps;

  public double globalAlpha;

  @JsNonNull
  public String globalCompositeOperation;

  public boolean imageSmoothingEnabled;

  @JsNonNull
  @ImageSmoothingQuality
  public String imageSmoothingQuality;

  public double letterSpacing;

  @JsNonNull
  @CanvasLineCap
  public String lineCap;

  public double lineDashOffset;

  @JsNonNull
  @CanvasLineJoin
  public String lineJoin;

  public double lineWidth;

  public double miterLimit;

  public double shadowBlur;

  @JsNonNull
  public String shadowColor;

  public double shadowOffsetX;

  public double shadowOffsetY;

  @JsNonNull
  public StringOrCanvasGradientOrCanvasPatternUnion strokeStyle;

  @JsNonNull
  @CanvasTextAlign
  public String textAlign;

  @JsNonNull
  @CanvasTextBaseline
  public String textBaseline;

  @JsNonNull
  @CanvasTextRendering
  public String textRendering;

  public double wordSpacing;

  protected OffscreenCanvasRenderingContext2D() {
  }

  @JsProperty(
      name = "canvas"
  )
  @Nonnull
  public native OffscreenCanvas canvas();

  public native void commit();

  public native void beginPath();

  public native void clip(@CanvasFillRule @Nonnull String fillRule);

  public native void clip();

  public native void clip(@Nonnull Path2D path, @CanvasFillRule @Nonnull String fillRule);

  public native void clip(@Nonnull Path2D path);

  public native void fill(@CanvasFillRule @Nonnull String fillRule);

  public native void fill();

  public native void fill(@Nonnull Path2D path, @CanvasFillRule @Nonnull String fillRule);

  public native void fill(@Nonnull Path2D path);

  @HasNoSideEffects
  public native boolean isPointInPath(double x, double y, @CanvasFillRule @Nonnull String fillRule);

  @HasNoSideEffects
  public native boolean isPointInPath(double x, double y);

  @HasNoSideEffects
  public native boolean isPointInPath(@Nonnull Path2D path, double x, double y,
      @CanvasFillRule @Nonnull String fillRule);

  @HasNoSideEffects
  public native boolean isPointInPath(@Nonnull Path2D path, double x, double y);

  @HasNoSideEffects
  public native boolean isPointInStroke(double x, double y);

  @HasNoSideEffects
  public native boolean isPointInStroke(@Nonnull Path2D path, double x, double y);

  public native void stroke();

  public native void stroke(@Nonnull Path2D path);

  public native void clearRect(double x, double y, double w, double h);

  public native void fillRect(double x, double y, double w, double h);

  public native void strokeRect(double x, double y, double w, double h);

  @JsNonNull
  public native CanvasGradient createConicGradient(double startAngle, double x, double y);

  @JsNonNull
  public native CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);

  @JsNullable
  public native CanvasPattern createPattern(@Nonnull CanvasImageSource image,
      @Nonnull String repetition);

  @JsNonNull
  public native CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1,
      double y1, double r1);

  @JsNonNull
  public native JsArray<Double> getLineDash();

  public native void setLineDash(@Nonnull JsArray<Double> segments);

  @JsOverlay
  public final void setLineDash(@Nonnull final double... segments) {
    _setLineDash( segments );
  }

  @JsMethod(
      name = "setLineDash"
  )
  private native void _setLineDash(@Nonnull double[] segments);

  @JsNonNull
  public native DOMMatrix getTransform();

  public native void resetTransform();

  public native void rotate(double angle);

  public native void scale(double x, double y);

  public native void setTransform(double a, double b, double c, double d, double e, double f);

  public native void setTransform(@Nonnull DOMMatrix2DInit transform);

  public native void setTransform();

  public native void transform(double a, double b, double c, double d, double e, double f);

  public native void translate(double x, double y);

  public native void fillText(@Nonnull String text, double x, double y, double maxWidth);

  public native void fillText(@Nonnull String text, double x, double y);

  @HasNoSideEffects
  @JsNonNull
  public native TextMetrics measureText(@Nonnull String text);

  public native void strokeText(@Nonnull String text, double x, double y, double maxWidth);

  public native void strokeText(@Nonnull String text, double x, double y);

  public native void drawImage(@Nonnull CanvasImageSource image, double dx, double dy);

  public native void drawImage(@Nonnull CanvasImageSource image, double dx, double dy, double dw,
      double dh);

  public native void drawImage(@Nonnull CanvasImageSource image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  @HasNoSideEffects
  @JsNonNull
  public native ImageData createImageData(int sw, int sh, @Nonnull ImageDataSettings settings);

  @HasNoSideEffects
  @JsNonNull
  public native ImageData createImageData(int sw, int sh);

  @HasNoSideEffects
  @JsNonNull
  public native ImageData createImageData(@Nonnull ImageData imagedata);

  @JsNonNull
  public native ImageData getImageData(int sx, int sy, int sw, int sh,
      @Nonnull ImageDataSettings settings);

  @JsNonNull
  public native ImageData getImageData(int sx, int sy, int sw, int sh);

  public native void putImageData(@Nonnull ImageData imagedata, int dx, int dy);

  public native void putImageData(@Nonnull ImageData imagedata, int dx, int dy, int dirtyX,
      int dirtyY, int dirtyWidth, int dirtyHeight);

  public native boolean isContextLost();

  public native void reset();

  public native void restore();

  public native void save();

  public native void arc(double x, double y, double radius, double startAngle, double endAngle,
      boolean counterclockwise);

  public native void arc(double x, double y, double radius, double startAngle, double endAngle);

  public native void arcTo(double x1, double y1, double x2, double y2, double radius);

  public native void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x,
      double y);

  public native void closePath();

  public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation,
      double startAngle, double endAngle, boolean counterclockwise);

  public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation,
      double startAngle, double endAngle);

  public native void lineTo(double x, double y);

  public native void moveTo(double x, double y);

  public native void quadraticCurveTo(double cpx, double cpy, double x, double y);

  public native void rect(double x, double y, double w, double h);

  public native void roundRect(double x, double y, double w, double h,
      @Nonnull JsArray<UnrestrictedDoubleOrDOMPointInitUnion> radii);

  @JsOverlay
  public final void roundRect(final double x, final double y, final double w, final double h,
      @Nonnull final UnrestrictedDoubleOrDOMPointInitUnion... radii) {
    _roundRect( x, y, w, h, radii );
  }

  @JsMethod(
      name = "roundRect"
  )
  private native void _roundRect(double x, double y, double w, double h,
      @Nonnull UnrestrictedDoubleOrDOMPointInitUnion[] radii);
}
