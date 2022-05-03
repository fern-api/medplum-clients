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
    as = ImmutableConsent_Verification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Verification {
  Optional<Boolean> verified();

  Optional<String> id();

  Optional<DateTime> verificationDate();

  Optional<Reference> verifiedWith();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableConsent_Verification.Builder builder() {
    return ImmutableConsent_Verification.builder();
  }
}
