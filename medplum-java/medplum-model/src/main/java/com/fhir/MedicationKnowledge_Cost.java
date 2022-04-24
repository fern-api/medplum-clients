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
    as = ImmutableMedicationKnowledge_Cost.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Cost {
  Optional<String> source();

  Optional<String> id();

  CodeableConcept type();

  Optional<List<Extension>> extension();

  Money cost();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicationKnowledge_Cost.TypeBuildStage builder() {
    return ImmutableMedicationKnowledge_Cost.builder();
  }
}
