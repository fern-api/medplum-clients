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
  Optional<List<SubstanceSpecification_Name>> synonym();

  Optional<List<CodeableConcept>> language();

  Optional<CodeableConcept> status();

  Optional<String> name();

  Optional<List<SubstanceSpecification_Name>> translation();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<CodeableConcept>> domain();

  Optional<List<Reference>> source();

  Optional<CodeableConcept> type();

  Optional<Boolean> preferred();

  Optional<List<SubstanceSpecification_Official>> official();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSubstanceSpecification_Name.Builder builder() {
    return ImmutableSubstanceSpecification_Name.builder();
  }
}
