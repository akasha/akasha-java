package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNullable;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface OnBeforeUnloadEventHandler {
  @JsNullable
  String onInvoke(@Nonnull Event event);
}
