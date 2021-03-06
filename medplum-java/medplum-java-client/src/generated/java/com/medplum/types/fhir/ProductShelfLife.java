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
    as = ImmutableProductShelfLife.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProductShelfLife {
  Optional<List<CodeableConcept>> specialPrecautionsForStorage();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Identifier> identifier();

  Quantity period();

  CodeableConcept type();

  static ImmutableProductShelfLife.PeriodBuildStage builder() {
    return ImmutableProductShelfLife.builder();
  }
}
