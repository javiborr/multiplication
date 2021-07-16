package microservices.book.multiplication.challenge;

import org.springframework.stereotype.Service;

import microservices.book.multiplication.user.User;

@Service
public class ChallengeServiceImpl implements ChallengeService {
	
	@Override
	public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {
		// Check getGuess works ok 
		boolean isCorrect = (attemptDTO.getGuess() == attemptDTO.getFactorA() * attemptDTO.getFactorB());
		User user = new User(null, attemptDTO.getUserAlias());
		// TODO userid
		ChallengeAttempt checkedAttempt = new ChallengeAttempt(
				null, null, attemptDTO.getFactorA(), attemptDTO.getFactorB(), attemptDTO.getGuess(), isCorrect
				);
		return checkedAttempt;
	}

}
