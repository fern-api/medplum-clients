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
    as = ImmutableMedicationKnowledge_Cost.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Cost {
  CodeableConcept type();

  Optional<List<Extension>> modifierExtension();

  Money cost();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> source();

  static ImmutableMedicationKnowledge_Cost.TypeBuildStage builder() {
    return ImmutableMedicationKnowledge_Cost.builder();
  }
}
