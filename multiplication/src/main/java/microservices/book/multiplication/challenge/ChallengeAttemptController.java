package microservices.book.multiplication.challenge;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/attempts")
public class ChallengeAttemptController {

	private final ChallengeService challengeService;
	
	@PostMapping
	ResponseEntity<ChallengeAttempt> postResult(
			@RequestBody @Valid ChallengeAttemptDTO challengeAttemptDTO) 
	{
		return ResponseEntity.ok(challengeService.verifyAttempt(challengeAttemptDTO));
	}
}
