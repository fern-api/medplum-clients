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
  Optional<String> id();

  CodeableConcept role();

  Reference reference();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableConsent_Actor.RoleBuildStage builder() {
    return ImmutableConsent_Actor.builder();
  }
}
