package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Double> doseNumberPositiveInt();

  Optional<Double> seriesDosesPositiveInt();

  Optional<List<CodeableConcept>> targetDisease();

  Optional<String> id();

  Optional<Reference> authority();

  Optional<String> doseNumberString();

  Optional<List<Extension>> modifierExtension();

  Optional<String> series();

  Optional<List<Extension>> extension();

  Optional<String> seriesDosesString();

  static ImmutableImmunization_ProtocolApplied.Builder builder() {
    return ImmutableImmunization_ProtocolApplied.builder();
  }
}
