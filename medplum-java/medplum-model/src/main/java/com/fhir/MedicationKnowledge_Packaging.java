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
    as = ImmutableMedicationKnowledge_Packaging.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Packaging {
  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableMedicationKnowledge_Packaging.Builder builder() {
    return ImmutableMedicationKnowledge_Packaging.builder();
  }
}
