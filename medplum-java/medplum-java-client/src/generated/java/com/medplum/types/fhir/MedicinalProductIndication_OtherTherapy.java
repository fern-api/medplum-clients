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
    as = ImmutableMedicinalProductIndication_OtherTherapy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIndication_OtherTherapy {
  CodeableConcept therapyRelationshipType();

  Optional<String> id();

  Optional<Reference> medicationReference();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicinalProductIndication_OtherTherapy.TherapyRelationshipTypeBuildStage builder(
      ) {
    return ImmutableMedicinalProductIndication_OtherTherapy.builder();
  }
}
