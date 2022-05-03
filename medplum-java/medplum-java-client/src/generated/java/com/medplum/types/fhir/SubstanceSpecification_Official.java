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
    as = ImmutableSubstanceSpecification_Official.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Official {
  Optional<String> id();

  Optional<CodeableConcept> status();

  Optional<CodeableConcept> authority();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSpecification_Official.Builder builder() {
    return ImmutableSubstanceSpecification_Official.builder();
  }
}
