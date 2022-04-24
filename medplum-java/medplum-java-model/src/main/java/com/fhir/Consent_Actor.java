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
    as = ImmutableConsent_Actor.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Actor {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept role();

  Reference reference();

  Optional<String> id();

  static ImmutableConsent_Actor.RoleBuildStage builder() {
    return ImmutableConsent_Actor.builder();
  }
}
