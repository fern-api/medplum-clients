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
  Optional<Uri> implicitRules();

  Optional<String> authMethod();

  Optional<Instant> authTime();

  Optional<Reference> client();

  Optional<String> refreshSecret();

  Optional<Reference> membership();

  Optional<Boolean> revoked();

  Optional<String> resourceType();

  Optional<String> nonce();

  Optional<Boolean> granted();

  Optional<Boolean> admin();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Reference> user();

  Optional<String> scope();

  Optional<String> codeChallenge();

  Optional<String> userAgent();

  Optional<String> code();

  Optional<List<Reference>> compartments();

  Optional<String> cookie();

  Optional<String> codeChallengeMethod();

  Optional<String> remoteAddress();

  static ImmutableLogin.Builder builder() {
    return ImmutableLogin.builder();
  }
}
