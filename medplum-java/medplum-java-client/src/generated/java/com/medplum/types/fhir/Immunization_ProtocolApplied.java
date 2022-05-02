package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableImmunization_ProtocolApplied.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Immunization_ProtocolApplied {
  Optional<String> series();

  Optional<Double> seriesDosesPositiveInt();

  Optional<String> doseNumberString();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> targetDisease();

  Optional<List<Extension>> modifierExtension();

  Optional<String> seriesDosesString();

  Optional<Reference> authority();

  Optional<Double> doseNumberPositiveInt();

  static ImmutableImmunization_ProtocolApplied.Builder builder() {
    return ImmutableImmunization_ProtocolApplied.builder();
  }
}
