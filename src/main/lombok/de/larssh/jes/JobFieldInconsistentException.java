package de.larssh.jes;

import de.larssh.utils.text.Strings;
import lombok.ToString;

/**
 * Thrown to indicate that fields of a {@link Job} or {@link JobOutput} object
 * are inconsistent.
 */
@ToString
// @EqualsAndHashCode(callSuper = true, onParam_ = { @Nullable })
public class JobFieldInconsistentException extends RuntimeException {
	private static final long serialVersionUID = -7435373803567330152L;

	/**
	 * Constructs a new {@link JobFieldInconsistentException} with the given
	 * message, formatting as described at
	 * {@link Strings#format(String, Object...)}.
	 *
	 * @param message   the detail message
	 * @param arguments arguments referenced by format specifiers in {@code message}
	 * @throws java.util.IllegalFormatException {@code arguments} is not empty and
	 *         {@code format} contains unexpected syntax
	 */
	public JobFieldInconsistentException(final String message, final Object... arguments) {
		super(Strings.format(message, arguments));
	}
}
