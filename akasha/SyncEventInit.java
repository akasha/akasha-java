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
    name = "SyncEventInit"
)
public interface SyncEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static Builder tag(@Nonnull final String tag) {
    final Builder $syncEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $syncEventInit.setTag( tag );
    return Js.uncheckedCast( $syncEventInit );
  }

  @JsProperty(
      name = "tag"
  )
  @JsNonNull
  String tag();

  @JsProperty
  void setTag(@JsNonNull String tag);

  @JsProperty(
      name = "lastChance"
  )
  boolean lastChance();

  @JsProperty
  void setLastChance(boolean lastChance);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SyncEventInit"
  )
  interface Builder extends SyncEventInit {
    @JsOverlay
    @Nonnull
    default Builder lastChance(final boolean lastChance) {
      setLastChance( lastChance );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
