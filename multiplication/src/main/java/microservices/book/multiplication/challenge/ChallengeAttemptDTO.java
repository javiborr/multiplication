package microservices.book.multiplication.challenge;

import javax.validation.constraints.*;

import lombok.*;

/**
 * The user is trying
 */
@Value
public class ChallengeAttemptDTO {
	@Min(1) @Max(99)
	int factorA, factorB;
	@NotBlank
	String userAlias;
	@Positive
	int guess;
}
