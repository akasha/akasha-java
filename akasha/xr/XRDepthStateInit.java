package akasha.xr;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRDepthStateInit"
)
public interface XRDepthStateInit {
  @JsOverlay
  @Nonnull
  static Step1 usagePreference(@Nonnull final JsArray<String> usagePreference) {
    final XRDepthStateInit $xrDepthStateInit = Js.<XRDepthStateInit>uncheckedCast( JsPropertyMap.of() );
    $xrDepthStateInit.setUsagePreference( usagePreference );
    return Js.uncheckedCast( $xrDepthStateInit );
  }

  @JsOverlay
  @Nonnull
  static Step1 usagePreference(@Nonnull final String... usagePreference) {
    final XRDepthStateInit $xrDepthStateInit = Js.<XRDepthStateInit>uncheckedCast( JsPropertyMap.of() );
    $xrDepthStateInit.setUsagePreference( usagePreference );
    return Js.uncheckedCast( $xrDepthStateInit );
  }

  @JsProperty(
      name = "usagePreference"
  )
  @JsNonNull
  JsArray<String> usagePreference();

  @JsProperty
  void setUsagePreference(@JsNonNull JsArray<String> usagePreference);

  @JsOverlay
  default void setUsagePreference(@Nonnull final String... usagePreference) {
    setUsagePreference( Js.<JsArray<String>>uncheckedCast( usagePreference ) );
  }

  @JsProperty(
      name = "dataFormatPreference"
  )
  @JsNonNull
  JsArray<String> dataFormatPreference();

  @JsProperty
  void setDataFormatPreference(@JsNonNull JsArray<String> dataFormatPreference);

  @JsOverlay
  default void setDataFormatPreference(@Nonnull final String... dataFormatPreference) {
    setDataFormatPreference( Js.<JsArray<String>>uncheckedCast( dataFormatPreference ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRDepthStateInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default XRDepthStateInit dataFormatPreference(@Nonnull JsArray<String> dataFormatPreference) {
      Js.<XRDepthStateInit>uncheckedCast( this ).setDataFormatPreference( dataFormatPreference );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default XRDepthStateInit dataFormatPreference(@Nonnull String... dataFormatPreference) {
      Js.<XRDepthStateInit>uncheckedCast( this ).setDataFormatPreference( dataFormatPreference );
      return Js.uncheckedCast( this );
    }
  }
}
