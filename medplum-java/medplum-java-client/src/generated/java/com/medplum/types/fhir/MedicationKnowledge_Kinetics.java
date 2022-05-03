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
    as = ImmutableMedicationKnowledge_Kinetics.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Kinetics {
  Optional<List<Extension>> extension();

  Optional<List<Quantity>> areaUnderCurve();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Quantity>> lethalDose50();

  Optional<Duration> halfLifePeriod();

  static ImmutableMedicationKnowledge_Kinetics.Builder builder() {
    return ImmutableMedicationKnowledge_Kinetics.builder();
  }
}
