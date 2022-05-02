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
    as = ImmutableMedicationKnowledge_DrugCharacteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_DrugCharacteristic {
  Optional<String> id();

  Optional<String> valueString();

  Optional<String> valueBase64Binary();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Quantity> valueQuantity();

  static ImmutableMedicationKnowledge_DrugCharacteristic.Builder builder() {
    return ImmutableMedicationKnowledge_DrugCharacteristic.builder();
  }
}