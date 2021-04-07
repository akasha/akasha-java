package akasha.perf;

import akasha.lang.JsArray;
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
    name = "Object"
)
public interface PerformanceObserverInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "buffered"
  )
  boolean buffered();

  @JsProperty
  void setBuffered(boolean buffered);

  @JsProperty(
      name = "entryTypes"
  )
  JsArray<String> entryTypes();

  @JsProperty
  void setEntryTypes(@Nonnull JsArray<String> entryTypes);

  @JsOverlay
  default void setEntryTypes(@Nonnull final String... entryTypes) {
    setEntryTypes( Js.<JsArray<String>>uncheckedCast( entryTypes ) );
  }

  @JsProperty(
      name = "type"
  )
  String type();

  @JsProperty
  void setType(@Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends PerformanceObserverInit {
    @JsOverlay
    @Nonnull
    default Builder buffered(final boolean buffered) {
      setBuffered( buffered );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder entryTypes(@Nonnull final JsArray<String> entryTypes) {
      setEntryTypes( entryTypes );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder entryTypes(@Nonnull final String... entryTypes) {
      setEntryTypes( entryTypes );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
