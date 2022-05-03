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
  Optional<Code> language();

  Optional<Boolean> revoked();

  Optional<String> codeChallengeMethod();

  Optional<String> resourceType();

  Optional<String> nonce();

  Optional<Meta> meta();

  Optional<String> scope();

  Optional<Id> id();

  Optional<Instant> authTime();

  Optional<Boolean> granted();

  Optional<Boolean> admin();

  Optional<String> cookie();

  Optional<String> remoteAddress();

  Optional<Reference> client();

  Optional<Reference> membership();

  Optional<String> authMethod();

  Optional<String> userAgent();

  Optional<Uri> implicitRules();

  Optional<String> refreshSecret();

  Optional<Reference> user();

  Optional<List<Reference>> compartments();

  Optional<String> code();

  Optional<String> codeChallenge();

  static ImmutableLogin.Builder builder() {
    return ImmutableLogin.builder();
  }
}
