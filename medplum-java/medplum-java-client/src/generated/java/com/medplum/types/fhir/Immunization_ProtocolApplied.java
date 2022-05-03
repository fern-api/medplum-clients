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
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> seriesDosesString();

  Optional<String> series();

  Optional<Reference> authority();

  Optional<Double> doseNumberPositiveInt();

  Optional<List<CodeableConcept>> targetDisease();

  Optional<String> doseNumberString();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> seriesDosesPositiveInt();

  static ImmutableImmunization_ProtocolApplied.Builder builder() {
    return ImmutableImmunization_ProtocolApplied.builder();
  }
}
