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
    as = ImmutableMedicationKnowledge_MaxDispense.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_MaxDispense {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Quantity quantity();

  Optional<String> id();

  Optional<Duration> period();

  static ImmutableMedicationKnowledge_MaxDispense.QuantityBuildStage builder() {
    return ImmutableMedicationKnowledge_MaxDispense.builder();
  }
}
