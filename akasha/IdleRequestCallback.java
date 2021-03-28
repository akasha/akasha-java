package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface IdleRequestCallback {
  void onInvoke(@Nonnull IdleDeadline deadline);
}
