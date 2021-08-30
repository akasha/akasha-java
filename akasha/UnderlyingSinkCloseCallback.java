package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNonNull;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface UnderlyingSinkCloseCallback {
  @JsNonNull
  Promise<Void> onInvoke();
}
