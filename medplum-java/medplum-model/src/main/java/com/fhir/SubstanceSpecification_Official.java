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
    as = ImmutableSubstanceSpecification_Official.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Official {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<dateTime> date();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> authority();

  Optional<CodeableConcept> status();

  static ImmutableSubstanceSpecification_Official.Builder builder() {
    return ImmutableSubstanceSpecification_Official.builder();
  }
}
