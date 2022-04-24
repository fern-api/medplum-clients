package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableLogin.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Login {
  Optional<String> codeChallenge();

  Optional<Boolean> admin();

  Optional<String> cookie();

  Optional<String> refreshSecret();

  Optional<instant> authTime();

  Optional<String> remoteAddress();

  Optional<Reference> client();

  Optional<String> userAgent();

  Optional<Reference> membership();

  Optional<Boolean> granted();

  Optional<uri> implicitRules();

  Optional<String> scope();

  Optional<String> authMethod();

  Optional<Meta> meta();

  Optional<List<Reference>> compartments();

  Optional<String> code();

  Optional<id> id();

  Optional<String> resourceType();

  Optional<Boolean> revoked();

  Optional<String> nonce();

  Optional<code> language();

  Optional<Reference> user();

  Optional<String> codeChallengeMethod();

  static ImmutableLogin.Builder builder() {
    return ImmutableLogin.builder();
  }
}
