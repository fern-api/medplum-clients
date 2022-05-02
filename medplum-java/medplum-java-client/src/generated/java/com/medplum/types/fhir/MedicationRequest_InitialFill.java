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
    as = ImmutableMedicationRequest_InitialFill.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationRequest_InitialFill {
  Optional<List<Extension>> modifierExtension();

  Optional<Duration> duration();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Quantity> quantity();

  static ImmutableMedicationRequest_InitialFill.Builder builder() {
    return ImmutableMedicationRequest_InitialFill.builder();
  }
}
