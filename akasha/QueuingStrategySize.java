package akasha;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOptional;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface QueuingStrategySize {
  double onInvoke(@DoNotAutobox @Nullable @JsOptional Object chunk);
}
