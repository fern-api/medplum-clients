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
    as = ImmutableMedicationKnowledge_RelatedMedicationKnowledge.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_RelatedMedicationKnowledge {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  List<Reference> reference();

  static ImmutableMedicationKnowledge_RelatedMedicationKnowledge.TypeBuildStage builder() {
    return ImmutableMedicationKnowledge_RelatedMedicationKnowledge.builder();
  }
}
