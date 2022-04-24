package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<uri> uri();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> authority();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableConsent_Policy.Builder builder() {
    return ImmutableConsent_Policy.builder();
  }
}
