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

  Optional<Duration> expectedSupplyDuration();

  Optional<List<Extension>> modifierExtension();

  Optional<MedicationRequest_InitialFill> initialFill();

  Optional<Duration> dispenseInterval();

  Optional<Period> validityPeriod();

  Optional<UnsignedInt> numberOfRepeatsAllowed();

  Optional<Reference> performer();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  static ImmutableMedicationRequest_DispenseRequest.Builder builder() {
    return ImmutableMedicationRequest_DispenseRequest.builder();
  }
}
