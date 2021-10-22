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
    name = "PushSubscriptionChangeEventInit"
)
public interface PushSubscriptionChangeEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "newSubscription"
  )
  PushSubscription newSubscription();

  @JsProperty
  void setNewSubscription(@JsNonNull PushSubscription newSubscription);

  @JsProperty(
      name = "oldSubscription"
  )
  PushSubscription oldSubscription();

  @JsProperty
  void setOldSubscription(@JsNonNull PushSubscription oldSubscription);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PushSubscriptionChangeEventInit"
  )
  interface Builder extends PushSubscriptionChangeEventInit {
    @JsOverlay
    @Nonnull
    default Builder newSubscription(@Nonnull final PushSubscription newSubscription) {
      setNewSubscription( newSubscription );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder oldSubscription(@Nonnull final PushSubscription oldSubscription) {
      setOldSubscription( oldSubscription );
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
