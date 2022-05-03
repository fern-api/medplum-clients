package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> nonce();

  Optional<String> codeChallengeMethod();

  Optional<String> scope();

  Optional<Meta> meta();

  Optional<String> authMethod();

  Optional<String> resourceType();

  Optional<Instant> authTime();

  Optional<String> remoteAddress();

  Optional<String> userAgent();

  Optional<String> refreshSecret();

  Optional<Uri> implicitRules();

  Optional<Reference> client();

  Optional<List<Reference>> compartments();

  Optional<Boolean> admin();

  Optional<Reference> membership();

  Optional<String> code();

  Optional<String> codeChallenge();

  Optional<Boolean> revoked();

  Optional<Id> id();

  Optional<Reference> user();

  Optional<Boolean> granted();

  Optional<Code> language();

  Optional<String> cookie();

  static ImmutableLogin.Builder builder() {
    return ImmutableLogin.builder();
  }
}
