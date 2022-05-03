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
    as = ImmutableMedicationKnowledge_MaxDispense.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_MaxDispense {
  Optional<List<Extension>> extension();

  Optional<Duration> period();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Quantity quantity();

  static ImmutableMedicationKnowledge_MaxDispense.QuantityBuildStage builder() {
    return ImmutableMedicationKnowledge_MaxDispense.builder();
  }
}
