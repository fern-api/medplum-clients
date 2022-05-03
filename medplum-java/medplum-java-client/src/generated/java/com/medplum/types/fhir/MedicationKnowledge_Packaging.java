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
    as = ImmutableMedicationKnowledge_Packaging.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Packaging {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicationKnowledge_Packaging.Builder builder() {
    return ImmutableMedicationKnowledge_Packaging.builder();
  }
}
