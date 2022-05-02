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
  Optional<Instant> authTime();

  Optional<Code> language();

  Optional<String> codeChallengeMethod();

  Optional<String> code();

  Optional<Boolean> revoked();

  Optional<String> cookie();

  Optional<Reference> client();

  Optional<Meta> meta();

  Optional<String> scope();

  Optional<Reference> user();

  Optional<String> codeChallenge();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Reference> membership();

  Optional<String> refreshSecret();

  Optional<Boolean> granted();

  Optional<String> nonce();

  Optional<String> remoteAddress();

  Optional<String> resourceType();

  Optional<List<Reference>> compartments();

  Optional<String> authMethod();

  Optional<Boolean> admin();

  Optional<String> userAgent();

  static ImmutableLogin.Builder builder() {
    return ImmutableLogin.builder();
  }
}
