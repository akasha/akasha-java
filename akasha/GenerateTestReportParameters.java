package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
  static Builder create(@Nonnull final String message) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).message( message );
  }

  @JsProperty(
      name = "group"
  )
  String group();

  @JsProperty
  void setGroup(@Nonnull String group);

  @JsProperty(
      name = "message"
  )
  @Nonnull
  String message();

  @JsProperty
  void setMessage(@Nonnull String message);

  @Generated("org.realityforge.webtack")
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

    @JsOverlay
    @Nonnull
    default Builder message(@Nonnull final String message) {
      setMessage( message );
      return this;
    }
  }
}
