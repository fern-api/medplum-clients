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
  Optional<Reference> authority();

  Optional<List<Extension>> extension();

  Optional<String> series();

  Optional<Double> doseNumberPositiveInt();

  Optional<List<CodeableConcept>> targetDisease();

  Optional<String> doseNumberString();

  Optional<Double> seriesDosesPositiveInt();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> seriesDosesString();

  static ImmutableImmunization_ProtocolApplied.Builder builder() {
    return ImmutableImmunization_ProtocolApplied.builder();
  }
}
