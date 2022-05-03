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
  Optional<List<Extension>> modifierExtension();

  Optional<Duration> expectedSupplyDuration();

  Optional<MedicationRequest_InitialFill> initialFill();

  Optional<List<Extension>> extension();

  Optional<Duration> dispenseInterval();

  Optional<Quantity> quantity();

  Optional<Period> validityPeriod();

  Optional<Reference> performer();

  Optional<String> id();

  Optional<UnsignedInt> numberOfRepeatsAllowed();

  static ImmutableMedicationRequest_DispenseRequest.Builder builder() {
    return ImmutableMedicationRequest_DispenseRequest.builder();
  }
}
