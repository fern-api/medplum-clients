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
    as = ImmutableMedicationKnowledge_Monograph.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Monograph {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Reference> source();

  static ImmutableMedicationKnowledge_Monograph.Builder builder() {
    return ImmutableMedicationKnowledge_Monograph.builder();
  }
}