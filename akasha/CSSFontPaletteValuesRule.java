package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSFontPaletteValuesRule"
)
public class CSSFontPaletteValuesRule extends CSSRule {
  protected CSSFontPaletteValuesRule() {
  }

  @JsProperty(
      name = "basePalette"
  )
  @Nonnull
  public native String basePalette();

  @JsProperty(
      name = "fontFamily"
  )
  @Nonnull
  public native String fontFamily();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsProperty(
      name = "overrideColors"
  )
  @Nonnull
  public native String overrideColors();
}
