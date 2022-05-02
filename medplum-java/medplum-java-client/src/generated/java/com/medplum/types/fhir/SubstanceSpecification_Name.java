package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<CodeableConcept>> domain();

  Optional<List<SubstanceSpecification_Name>> translation();

  Optional<String> name();

  Optional<List<SubstanceSpecification_Official>> official();

  Optional<String> id();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<SubstanceSpecification_Name>> synonym();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> preferred();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> source();

  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> language();

  Optional<CodeableConcept> status();

  static ImmutableSubstanceSpecification_Name.Builder builder() {
    return ImmutableSubstanceSpecification_Name.builder();
  }
}
