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
    as = ImmutableConsent_Verification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Verification {
  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> verificationDate();

  Optional<Boolean> verified();

  Optional<List<Extension>> extension();

  Optional<Reference> verifiedWith();

  Optional<String> id();

  static ImmutableConsent_Verification.Builder builder() {
    return ImmutableConsent_Verification.builder();
  }
}
