package akasha.clipboard;

import akasha.promise.Promise;
import javax.annotation.Generated;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNonNull;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ClipboardItemDelayedCallback {
  @JsNonNull
  Promise<ClipboardItemDataType> onInvoke();
}
