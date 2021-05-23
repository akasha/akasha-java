package akasha;

import akasha.core.ArrayBuffer;
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
    name = "txAuthGenericArg"
)
public interface TxAuthGenericArg {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final ArrayBuffer content, @Nonnull final String contentType) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).content( content ).contentType( contentType );
  }

  @JsProperty(
      name = "content"
  )
  @Nonnull
  ArrayBuffer content();

  @JsProperty
  void setContent(@Nonnull ArrayBuffer content);

  @JsProperty(
      name = "contentType"
  )
  @Nonnull
  String contentType();

  @JsProperty
  void setContentType(@Nonnull String contentType);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "txAuthGenericArg"
  )
  interface Builder extends TxAuthGenericArg {
    @JsOverlay
    @Nonnull
    default Builder content(@Nonnull final ArrayBuffer content) {
      setContent( content );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder contentType(@Nonnull final String contentType) {
      setContentType( contentType );
      return this;
    }
  }
}
