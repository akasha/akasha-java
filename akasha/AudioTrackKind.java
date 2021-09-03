package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumeration describing the values of the AudioTrack.kind property.
 * The kind property contains a string indicating the category of audio contained in the AudioTrack.
 * The kind can be used to determine the scenarios in which specific tracks should be enabled or disabled.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AudioTrackKind.class
)
public @interface AudioTrackKind {
  /**
   * The track doesn't have an explicit kind, or the kind provided by the track's metadata isn't recognized by the user agent.
   */
  @Nonnull
  String unspecified = "";

  /**
   * A potential alternative to the main track, such as a different audio take or a version of the soundtrack with only the music and no dialogue.
   */
  @Nonnull
  String alternative = "alternative";

  /**
   * An audio track containing a commentary. This might be used to contain the director's commentary track on a movie, for example.
   */
  @Nonnull
  String commentary = "commentary";

  /**
   * An audio track providing audible descriptions of the action depicted in a video track.
   */
  @Nonnull
  String descriptions = "descriptions";

  /**
   * The primary audio track.
   */
  @Nonnull
  String main = "main";

  /**
   * The primary audio track with audio descriptions mixed into it.
   */
  @Nonnull
  String main_desc = "main-desc";

  /**
   * A translated version of the primary audio track.
   */
  @Nonnull
  String translation = "translation";

  final class Util {
    private Util() {
    }

    @AudioTrackKind
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AudioTrackKind.unspecified.equals( value ) || AudioTrackKind.alternative.equals( value ) || AudioTrackKind.commentary.equals( value ) || AudioTrackKind.descriptions.equals( value ) || AudioTrackKind.main.equals( value ) || AudioTrackKind.main_desc.equals( value ) || AudioTrackKind.translation.equals( value );
    }
  }
}
