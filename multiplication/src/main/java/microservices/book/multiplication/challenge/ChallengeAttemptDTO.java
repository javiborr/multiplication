package microservices.book.multiplication.challenge;

import lombok.*;

/**
 * The user is trying
 */
@Value
public class ChallengeAttemptDTO {
	int factorA, factorB;
	String userAlias;
	int guess;
}
