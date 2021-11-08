package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The ReportBody interface of the Reporting API represents the body of a report. Individual report types inherit from this interface, adding specific attributes relevant to the particular report.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReportBody">ReportBody - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReportBody"
)
public class ReportBody extends JsObject {
  protected ReportBody() {
  }

  @JsNonNull
  public native JsObject toJSON();
}
