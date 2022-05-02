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
    as = ImmutableMedicationRequest_DispenseRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationRequest_DispenseRequest {
  Optional<String> id();

  Optional<MedicationRequest_InitialFill> initialFill();

  Optional<Reference> performer();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<UnsignedInt> numberOfRepeatsAllowed();

  Optional<Duration> dispenseInterval();

  Optional<Period> validityPeriod();

  Optional<Quantity> quantity();

  Optional<Duration> expectedSupplyDuration();

  static ImmutableMedicationRequest_DispenseRequest.Builder builder() {
    return ImmutableMedicationRequest_DispenseRequest.builder();
  }
}
