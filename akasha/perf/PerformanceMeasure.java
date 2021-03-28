package akasha.perf;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of &quot;measure&quot;. Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceMeasure">PerformanceMeasure - MDN</a>
 * @see <a href="https://w3c.github.io/user-timing/#dom-performance-measure">PerformanceMeasure - User Timing Level 2</a>
 * @see <a href="https://www.w3.org/TR/user-timing/#performancemeasure">PerformanceMeasure - User Timing</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceMeasure"
)
public class PerformanceMeasure extends PerformanceEntry {
  protected PerformanceMeasure() {
  }
}
