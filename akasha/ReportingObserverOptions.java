package akasha;

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

/**
 * The ReportingObserverOptions dictionary of the Reporting API allows options to be set in the constructor when creating a ReportingObserver.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReportingObserverOptions">ReportingObserverOptions - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReportingObserverOptions"
)
public interface ReportingObserverOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "buffered"
  )
  boolean buffered();

  @JsProperty
  void setBuffered(boolean buffered);

  @JsProperty(
      name = "types"
  )
  JsArray<String> types();

  @JsProperty
  void setTypes(@JsNonNull JsArray<String> types);

  @JsOverlay
  default void setTypes(@Nonnull final String... types) {
    setTypes( Js.<JsArray<String>>uncheckedCast( types ) );
  }

  /**
   * The ReportingObserverOptions dictionary of the Reporting API allows options to be set in the constructor when creating a ReportingObserver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReportingObserverOptions">ReportingObserverOptions - MDN</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ReportingObserverOptions"
  )
  interface Builder extends ReportingObserverOptions {
    @JsOverlay
    @Nonnull
    default Builder buffered(final boolean buffered) {
      setBuffered( buffered );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder types(@Nonnull final JsArray<String> types) {
      setTypes( types );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder types(@Nonnull final String... types) {
      setTypes( types );
      return this;
    }
  }
}
