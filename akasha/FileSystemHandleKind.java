package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FileSystemHandleKind.class
)
public @interface FileSystemHandleKind {
  @Nonnull
  String directory = "directory";

  @Nonnull
  String file = "file";

  final class Util {
    private Util() {
    }

    @FileSystemHandleKind
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return FileSystemHandleKind.directory.equals( value ) || FileSystemHandleKind.file.equals( value );
    }
  }
}
