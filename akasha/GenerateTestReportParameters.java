package akasha;

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
    name = "GenerateTestReportParameters"
)
public interface GenerateTestReportParameters {
  @JsOverlay
  @Nonnull
  static Builder message(@Nonnull final String message) {
    final Builder $generateTestReportParameters = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $generateTestReportParameters.setMessage( message );
    return Js.uncheckedCast( $generateTestReportParameters );
  }

  @JsProperty(
      name = "message"
  )
  @JsNonNull
  String message();

  @JsProperty
  void setMessage(@JsNonNull String message);

  @JsProperty(
      name = "group"
  )
  String group();

  @JsProperty
  void setGroup(@JsNonNull String group);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GenerateTestReportParameters"
  )
  interface Builder extends GenerateTestReportParameters {
    @JsOverlay
    @Nonnull
    default Builder group(@Nonnull final String group) {
      setGroup( group );
      return this;
    }
  }
}
