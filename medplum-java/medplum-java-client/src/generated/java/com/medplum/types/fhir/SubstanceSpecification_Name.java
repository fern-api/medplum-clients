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
  Optional<CodeableConcept> type();

  Optional<List<Reference>> source();

  Optional<String> id();

  Optional<List<CodeableConcept>> language();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<Boolean> preferred();

  Optional<List<CodeableConcept>> domain();

  Optional<List<SubstanceSpecification_Name>> synonym();

  Optional<List<SubstanceSpecification_Official>> official();

  Optional<CodeableConcept> status();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<SubstanceSpecification_Name>> translation();

  static ImmutableSubstanceSpecification_Name.Builder builder() {
    return ImmutableSubstanceSpecification_Name.builder();
  }
}
