package microservices.book.multiplication.challenge;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {

	private final Random random;
	
	private final static int MINIMUM_FACTOR = 11;
	private final static int MAXIMUM_FACTOR = 100;
	
	private int next() {
		return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR) + MINIMUM_FACTOR;
	}
	
	ChallengeGeneratorServiceImpl() {
		this.random = new Random();
	}
	
	protected ChallengeGeneratorServiceImpl(final Random prandom) {
		this.random = prandom;
	}
	
	@Override
	public Challenge randomChallenge() {
		return new Challenge(next(), next());
	}

}