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
    as = ImmutableMedicationRequest_DispenseRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationRequest_DispenseRequest {
  Optional<MedicationRequest_InitialFill> initialFill();

  Optional<Reference> performer();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<Duration> dispenseInterval();

  Optional<Period> validityPeriod();

  Optional<unsignedInt> numberOfRepeatsAllowed();

  Optional<List<Extension>> extension();

  Optional<Duration> expectedSupplyDuration();

  static ImmutableMedicationRequest_DispenseRequest.Builder builder() {
    return ImmutableMedicationRequest_DispenseRequest.builder();
  }
}
