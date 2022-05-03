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
    as = ImmutableMedicationKnowledge_Dosage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Dosage {
  CodeableConcept type();

  Optional<String> id();

  List<Dosage> dosage();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableMedicationKnowledge_Dosage.TypeBuildStage builder() {
    return ImmutableMedicationKnowledge_Dosage.builder();
  }
}
