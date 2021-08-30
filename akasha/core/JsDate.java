package akasha.core;

import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * JavaScript Date objects represent a single moment in time in a platform-independent format. Date objects contain a Number that represents milliseconds since 1 January 1970 UTC.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date">Date - MDN</a>
 * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date-objects">(ECMAScript) # sec-date-objects</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Date"
)
public class JsDate extends JsObject {
  public JsDate() {
  }

  public JsDate(@Nonnull final String date) {
  }

  public JsDate(final double date) {
  }

  public JsDate(final int year, final int month, final int date, final int hours, final int minute,
      final int second, final int ms) {
  }

  public JsDate(final int year, final int month, final int date, final int hours, final int minute,
      final int second) {
  }

  public JsDate(final int year, final int month, final int date, final int hours,
      final int minute) {
  }

  public JsDate(final int year, final int month, final int date, final int hours) {
  }

  public JsDate(final int year, final int month, final int date) {
  }

  public JsDate(final int year, final int month) {
  }

  /**
   * The static Date.now() method returns the number of milliseconds elapsed since January 1, 1970 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/now">Date.now - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.now">(ECMAScript) # sec-date.now</a>
   */
  public static native double now();

  /**
   * The Date.parse() method parses a string representation of a date, and returns the number of milliseconds since January 1, 1970, 00:00:00 UTC or NaN if the string is unrecognized or, in some cases, contains illegal date values (e.g. 2015-02-31).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/parse">Date.parse - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.parse">(ECMAScript) # sec-date.parse</a>
   */
  public static native double parse(@Nonnull String date);

  /**
   * The getDate() method returns the day of the month for the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getDate">Date.getDate - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getdate">(ECMAScript) # sec-date.prototype.getdate</a>
   */
  @HasNoSideEffects
  public native int getDate();

  /**
   * The getDay() method returns the day of the week for the specified date according to local time, where 0 represents Sunday. For the day of the month, see Date.prototype.getDate().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getDay">Date.getDay - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getday">(ECMAScript) # sec-date.prototype.getday</a>
   */
  @HasNoSideEffects
  public native int getDay();

  /**
   * The getFullYear() method returns the year of the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getFullYear">Date.getFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getfullyear">(ECMAScript) # sec-date.prototype.getfullyear</a>
   */
  @HasNoSideEffects
  public native int getFullYear();

  /**
   * The getHours() method returns the hour for the specified date, according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getHours">Date.getHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.gethours">(ECMAScript) # sec-date.prototype.gethours</a>
   */
  @HasNoSideEffects
  public native int getHours();

  /**
   * The getMilliseconds() method returns the milliseconds in the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getMilliseconds">Date.getMilliseconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getmilliseconds">(ECMAScript) # sec-date.prototype.getmilliseconds</a>
   */
  @HasNoSideEffects
  public native int getMilliseconds();

  /**
   * The getMinutes() method returns the minutes in the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getMinutes">Date.getMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getminutes">(ECMAScript) # sec-date.prototype.getminutes</a>
   */
  @HasNoSideEffects
  public native int getMinutes();

  /**
   * The getMonth() method returns the month in the specified date according to local time, as a zero-based value (where zero indicates the first month of the year).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getMonth">Date.getMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getmonth">(ECMAScript) # sec-date.prototype.getmonth</a>
   */
  @HasNoSideEffects
  public native int getMonth();

  /**
   * The getSeconds() method returns the seconds in the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getSeconds">Date.getSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getseconds">(ECMAScript) # sec-date.prototype.getseconds</a>
   */
  @HasNoSideEffects
  public native int getSeconds();

  /**
   * The getTime() method returns the number of milliseconds* since the Unix Epoch.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime">Date.getTime - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.gettime">(ECMAScript) # sec-date.prototype.gettime</a>
   */
  @HasNoSideEffects
  public native double getTime();

  /**
   * The getTimezoneOffset() method returns the difference, in minutes, between a date as evaluated in the UTC time zone, and the same date as evaluated in the local time zone.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">Date.getTimezoneOffset - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.gettimezoneoffset">(ECMAScript) # sec-date.prototype.gettimezoneoffset</a>
   */
  @HasNoSideEffects
  public native int getTimezoneOffset();

  /**
   * The getUTCDate() method returns the day of the month(from 1 to 31) in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCDate">Date.getUTCDate - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getutcdate">(ECMAScript) # sec-date.prototype.getutcdate</a>
   */
  @HasNoSideEffects
  public native int getUTCDate();

  /**
   * The getUTCDay() method returns the day of the week in the specified date according to universal time, where 0 represents Sunday.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCDay">Date.getUTCDay - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getutcday">(ECMAScript) # sec-date.prototype.getutcday</a>
   */
  @HasNoSideEffects
  public native int getUTCDay();

  /**
   * The getUTCFullYear() method returns the year in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCFullYear">Date.getUTCFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getutcfullyear">(ECMAScript) # sec-date.prototype.getutcfullyear</a>
   */
  @HasNoSideEffects
  public native int getUTCFullYear();

  /**
   * The getUTCHours() method returns the hours in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCHours">Date.getUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getutchours">(ECMAScript) # sec-date.prototype.getutchours</a>
   */
  @HasNoSideEffects
  public native int getUTCHours();

  /**
   * The getUTCMilliseconds() method returns the milliseconds portion of the time object's value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCMilliseconds">Date.getUTCMilliseconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getutcmilliseconds">(ECMAScript) # sec-date.prototype.getutcmilliseconds</a>
   */
  @HasNoSideEffects
  public native int getUTCMilliseconds();

  /**
   * The getUTCMinutes() method returns the minutes in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCMinutes">Date.getUTCMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getutcminutes">(ECMAScript) # sec-date.prototype.getutcminutes</a>
   */
  @HasNoSideEffects
  public native int getUTCMinutes();

  /**
   * The getUTCMonth() returns the month of the specified date according to universal time, as a zero-based value (where zero indicates the first month of the year).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCMonth">Date.getUTCMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getutcmonth">(ECMAScript) # sec-date.prototype.getutcmonth</a>
   */
  @HasNoSideEffects
  public native int getUTCMonth();

  /**
   * The getUTCSeconds() method returns the seconds in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCSeconds">Date.getUTCSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.getutcseconds">(ECMAScript) # sec-date.prototype.getutcseconds</a>
   */
  @HasNoSideEffects
  public native int getUTCSeconds();

  /**
   * The setDate() method changes the day of the month of a given Date instance, based on local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setDate">Date.setDate - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setdate">(ECMAScript) # sec-date.prototype.setdate</a>
   */
  public native double setDate(int dayValue);

  /**
   * The setFullYear() method sets the full year for a specified date according to local time. Returns new timestamp.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setFullYear">Date.setFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setfullyear">(ECMAScript) # sec-date.prototype.setfullyear</a>
   */
  public native double setFullYear(int yearValue, int monthValue, int dayValue);

  /**
   * The setFullYear() method sets the full year for a specified date according to local time. Returns new timestamp.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setFullYear">Date.setFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setfullyear">(ECMAScript) # sec-date.prototype.setfullyear</a>
   */
  public native double setFullYear(int yearValue, int monthValue);

  /**
   * The setFullYear() method sets the full year for a specified date according to local time. Returns new timestamp.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setFullYear">Date.setFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setfullyear">(ECMAScript) # sec-date.prototype.setfullyear</a>
   */
  public native double setFullYear(int yearValue);

  /**
   * The setHours() method sets the hours for a specified date according to local time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setHours">Date.setHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.sethours">(ECMAScript) # sec-date.prototype.sethours</a>
   */
  public native double setHours(int hoursValue, int minutesValue, int secondsValue, int msValue);

  /**
   * The setHours() method sets the hours for a specified date according to local time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setHours">Date.setHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.sethours">(ECMAScript) # sec-date.prototype.sethours</a>
   */
  public native double setHours(int hoursValue, int minutesValue, int secondsValue);

  /**
   * The setHours() method sets the hours for a specified date according to local time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setHours">Date.setHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.sethours">(ECMAScript) # sec-date.prototype.sethours</a>
   */
  public native double setHours(int hoursValue, int minutesValue);

  /**
   * The setHours() method sets the hours for a specified date according to local time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setHours">Date.setHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.sethours">(ECMAScript) # sec-date.prototype.sethours</a>
   */
  public native double setHours(int hoursValue);

  /**
   * The setMilliseconds() method sets the milliseconds for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMilliseconds">Date.setMilliseconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setmilliseconds">(ECMAScript) # sec-date.prototype.setmilliseconds</a>
   */
  public native double setMilliseconds(int millisecondsValue);

  /**
   * The setMinutes() method sets the minutes for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMinutes">Date.setMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setminutes">(ECMAScript) # sec-date.prototype.setminutes</a>
   */
  public native double setMinutes(int minutesValue, int secondsValue, int msValue);

  /**
   * The setMinutes() method sets the minutes for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMinutes">Date.setMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setminutes">(ECMAScript) # sec-date.prototype.setminutes</a>
   */
  public native double setMinutes(int minutesValue, int secondsValue);

  /**
   * The setMinutes() method sets the minutes for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMinutes">Date.setMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setminutes">(ECMAScript) # sec-date.prototype.setminutes</a>
   */
  public native double setMinutes(int minutesValue);

  /**
   * The setMonth() method sets the month for a specified date according to the currently set year.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMonth">Date.setMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setmonth">(ECMAScript) # sec-date.prototype.setmonth</a>
   */
  public native double setMonth(int monthValue, int dayValue);

  /**
   * The setMonth() method sets the month for a specified date according to the currently set year.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMonth">Date.setMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setmonth">(ECMAScript) # sec-date.prototype.setmonth</a>
   */
  public native double setMonth(int monthValue);

  /**
   * The setSeconds() method sets the seconds for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setSeconds">Date.setSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setseconds">(ECMAScript) # sec-date.prototype.setseconds</a>
   */
  public native double setSeconds(int secondsValue, int msValue);

  /**
   * The setSeconds() method sets the seconds for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setSeconds">Date.setSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setseconds">(ECMAScript) # sec-date.prototype.setseconds</a>
   */
  public native double setSeconds(int secondsValue);

  /**
   * The setTime() method sets the Date object to the time represented by a number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setTime">Date.setTime - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.settime">(ECMAScript) # sec-date.prototype.settime</a>
   */
  public native double setTime(double timeValue);

  /**
   * The setUTCDate() method changes the day of the month of a given Date instance, based on UTC time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCDate">Date.setUTCDate - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcdate">(ECMAScript) # sec-date.prototype.setutcdate</a>
   */
  public native double setUTCDate(int dayValue);

  /**
   * The setUTCFullYear() method sets the full year for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCFullYear">Date.setUTCFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcfullyear">(ECMAScript) # sec-date.prototype.setutcfullyear</a>
   */
  public native double setUTCFullYear(int yearValue, int monthValue, int dayValue);

  /**
   * The setUTCFullYear() method sets the full year for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCFullYear">Date.setUTCFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcfullyear">(ECMAScript) # sec-date.prototype.setutcfullyear</a>
   */
  public native double setUTCFullYear(int yearValue, int monthValue);

  /**
   * The setUTCFullYear() method sets the full year for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCFullYear">Date.setUTCFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcfullyear">(ECMAScript) # sec-date.prototype.setutcfullyear</a>
   */
  public native double setUTCFullYear(int yearValue);

  /**
   * The setUTCHours() method sets the hour for a specified date according to universal time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCHours">Date.setUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutchours">(ECMAScript) # sec-date.prototype.setutchours</a>
   */
  public native double setUTCHours(int hoursValue, int minutesValue, int secondsValue, int msValue);

  /**
   * The setUTCHours() method sets the hour for a specified date according to universal time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCHours">Date.setUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutchours">(ECMAScript) # sec-date.prototype.setutchours</a>
   */
  public native double setUTCHours(int hoursValue, int minutesValue, int secondsValue);

  /**
   * The setUTCHours() method sets the hour for a specified date according to universal time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCHours">Date.setUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutchours">(ECMAScript) # sec-date.prototype.setutchours</a>
   */
  public native double setUTCHours(int hoursValue, int minutesValue);

  /**
   * The setUTCHours() method sets the hour for a specified date according to universal time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCHours">Date.setUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutchours">(ECMAScript) # sec-date.prototype.setutchours</a>
   */
  public native double setUTCHours(int hoursValue);

  /**
   * The setUTCMilliseconds() method sets the milliseconds for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMilliseconds">Date.setUTCMilliseconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcmilliseconds">(ECMAScript) # sec-date.prototype.setutcmilliseconds</a>
   */
  public native double setUTCMilliseconds(int millisecondsValue);

  /**
   * The setUTCMinutes() method sets the minutes for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMinutes">Date.setUTCMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcminutes">(ECMAScript) # sec-date.prototype.setutcminutes</a>
   */
  public native double setUTCMinutes(int minutesValue, int secondsValue, int msValue);

  /**
   * The setUTCMinutes() method sets the minutes for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMinutes">Date.setUTCMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcminutes">(ECMAScript) # sec-date.prototype.setutcminutes</a>
   */
  public native double setUTCMinutes(int minutesValue, int secondsValue);

  /**
   * The setUTCMinutes() method sets the minutes for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMinutes">Date.setUTCMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcminutes">(ECMAScript) # sec-date.prototype.setutcminutes</a>
   */
  public native double setUTCMinutes(int minutesValue);

  /**
   * The setUTCMonth() method sets the month for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMonth">Date.setUTCMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcmonth">(ECMAScript) # sec-date.prototype.setutcmonth</a>
   */
  public native double setUTCMonth(int monthValue, int dayValue);

  /**
   * The setUTCMonth() method sets the month for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMonth">Date.setUTCMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcmonth">(ECMAScript) # sec-date.prototype.setutcmonth</a>
   */
  public native double setUTCMonth(int monthValue);

  /**
   * The setUTCSeconds() method sets the seconds for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCSeconds">Date.setUTCSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcseconds">(ECMAScript) # sec-date.prototype.setutcseconds</a>
   */
  public native double setUTCSeconds(int secondsValue, int msValue);

  /**
   * The setUTCSeconds() method sets the seconds for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCSeconds">Date.setUTCSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.setutcseconds">(ECMAScript) # sec-date.prototype.setutcseconds</a>
   */
  public native double setUTCSeconds(int secondsValue);

  /**
   * The toDateString() method returns the date portion of a Date object in English in the following format separated by spaces:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toDateString">Date.toDateString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.todatestring">(ECMAScript) # sec-date.prototype.todatestring</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String toDateString();

  /**
   * The toISOString() method returns a string in simplified extended ISO format (ISO 8601), which is always 24 or 27 characters long (YYYY-MM-DDTHH:mm:ss.sssZ or &plusmn;YYYYYY-MM-DDTHH:mm:ss.sssZ, respectively). The timezone is always zero UTC offset, as denoted by the suffix &quot;Z&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString">Date.toISOString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.toisostring">(ECMAScript) # sec-date.prototype.toisostring</a>
   */
  @JsNonNull
  public native String toISOString();

  /**
   * The toJSON() method returns a string representation of the Date object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toJSON">Date.toJSON - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.tojson">(ECMAScript) # sec-date.prototype.tojson</a>
   */
  @JsNonNull
  public native String toJSON();

  /**
   * The toTimeString() method returns the time portion of a Date object in human readable form in English.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toTimeString">Date.toTimeString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.totimestring">(ECMAScript) # sec-date.prototype.totimestring</a>
   */
  @JsNonNull
  public native String toTimeString();

  /**
   * The toUTCString() method converts a date to a string, using the UTC time zone.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toUTCString">Date.toUTCString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.toutcstring">(ECMAScript) # sec-date.prototype.toutcstring</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String toUTCString();

  /**
   * The valueOf() method returns the primitive value of a Date object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/valueOf">Date.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.valueof">(ECMAScript) # sec-date.prototype.valueof</a>
   */
  public native double valueOf();

  /**
   * The toString() method returns a string representing the specified Date object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toString">Date.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.prototype.tostring">(ECMAScript) # sec-date.prototype.tostring</a>
   */
  @JsMethod(
      name = "toString"
  )
  @JsNonNull
  public native String toString_();

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.utc">(ECMAScript) # sec-date.utc</a>
   */
  public static native double UTC(int year, int month, int date, int hours, int minute, int second,
      int ms);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.utc">(ECMAScript) # sec-date.utc</a>
   */
  public static native double UTC(int year, int month, int date, int hours, int minute, int second);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.utc">(ECMAScript) # sec-date.utc</a>
   */
  public static native double UTC(int year, int month, int date, int hours, int minute);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.utc">(ECMAScript) # sec-date.utc</a>
   */
  public static native double UTC(int year, int month, int date, int hours);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.utc">(ECMAScript) # sec-date.utc</a>
   */
  public static native double UTC(int year, int month, int date);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-date.utc">(ECMAScript) # sec-date.utc</a>
   */
  public static native double UTC(int year, int month);
}
