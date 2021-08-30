package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushSubscriptionChangeEvent"
)
public class PushSubscriptionChangeEvent extends ExtendableEvent {
  public PushSubscriptionChangeEvent(@Nonnull final String type,
      @Nonnull final PushSubscriptionChangeEventInit eventInitDict) {
    super( null );
  }

  public PushSubscriptionChangeEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "newSubscription"
  )
  @Nullable
  public native PushSubscription newSubscription();

  @JsProperty(
      name = "oldSubscription"
  )
  @Nullable
  public native PushSubscription oldSubscription();
}
