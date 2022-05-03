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
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> authority();

  Optional<String> id();

  Optional<Uri> uri();

  static ImmutableConsent_Policy.Builder builder() {
    return ImmutableConsent_Policy.builder();
  }
}
