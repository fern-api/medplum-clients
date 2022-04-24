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
    as = ImmutableProductShelfLife.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProductShelfLife {
  Optional<List<CodeableConcept>> specialPrecautionsForStorage();

  CodeableConcept type();

  Optional<List<Extension>> extension();

  Quantity period();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  static ImmutableProductShelfLife.TypeBuildStage builder() {
    return ImmutableProductShelfLife.builder();
  }
}
