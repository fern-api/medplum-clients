package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstanceSpecification_Name.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Name {
  Optional<List<CodeableConcept>> language();

  Optional<String> id();

  Optional<List<CodeableConcept>> domain();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> source();

  Optional<String> name();

  Optional<List<SubstanceSpecification_Name>> synonym();

  Optional<Boolean> preferred();

  Optional<List<SubstanceSpecification_Name>> translation();

  Optional<List<SubstanceSpecification_Official>> official();

  Optional<CodeableConcept> status();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<CodeableConcept> type();

  static ImmutableSubstanceSpecification_Name.Builder builder() {
    return ImmutableSubstanceSpecification_Name.builder();
  }
}
