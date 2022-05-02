package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableConsent_Policy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Policy {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> uri();

  Optional<Uri> authority();

  Optional<List<Extension>> extension();

  static ImmutableConsent_Policy.Builder builder() {
    return ImmutableConsent_Policy.builder();
  }
}
