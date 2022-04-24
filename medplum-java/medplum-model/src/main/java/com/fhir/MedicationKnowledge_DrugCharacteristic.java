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
    as = ImmutableMedicationKnowledge_DrugCharacteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_DrugCharacteristic {
  Optional<Quantity> valueQuantity();

  Optional<String> valueString();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> id();

  Optional<String> valueBase64Binary();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableMedicationKnowledge_DrugCharacteristic.Builder builder() {
    return ImmutableMedicationKnowledge_DrugCharacteristic.builder();
  }
}
