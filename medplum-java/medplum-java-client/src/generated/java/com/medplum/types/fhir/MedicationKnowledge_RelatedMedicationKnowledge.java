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
    as = ImmutableMedicationKnowledge_RelatedMedicationKnowledge.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_RelatedMedicationKnowledge {
  List<Reference> reference();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept type();

  static ImmutableMedicationKnowledge_RelatedMedicationKnowledge.TypeBuildStage builder() {
    return ImmutableMedicationKnowledge_RelatedMedicationKnowledge.builder();
  }
}
