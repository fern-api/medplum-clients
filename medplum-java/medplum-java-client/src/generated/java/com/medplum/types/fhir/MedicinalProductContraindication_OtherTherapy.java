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
    as = ImmutableMedicinalProductContraindication_OtherTherapy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductContraindication_OtherTherapy {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Reference> medicationReference();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept therapyRelationshipType();

  Optional<CodeableConcept> medicationCodeableConcept();

  static ImmutableMedicinalProductContraindication_OtherTherapy.TherapyRelationshipTypeBuildStage builder(
      ) {
    return ImmutableMedicinalProductContraindication_OtherTherapy.builder();
  }
}
