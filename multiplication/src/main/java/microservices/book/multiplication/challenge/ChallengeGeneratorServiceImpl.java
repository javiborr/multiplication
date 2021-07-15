package microservices.book.multiplication.challenge;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {

	private final Random random;
	
	ChallengeGeneratorServiceImpl() {
		this.random = new Random();
	}
	
	protected ChallengeGeneratorServiceImpl(final Random prandom) {
		this.random = prandom;
	}
	
	@Override
	public Challenge randomChallenge() {
		return null;
	}

}