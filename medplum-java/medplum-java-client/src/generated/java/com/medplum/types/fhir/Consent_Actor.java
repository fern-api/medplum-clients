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
    as = ImmutableConsent_Actor.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Actor {
  Reference reference();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept role();

  Optional<List<Extension>> extension();

  static ImmutableConsent_Actor.ReferenceBuildStage builder() {
    return ImmutableConsent_Actor.builder();
  }
}
