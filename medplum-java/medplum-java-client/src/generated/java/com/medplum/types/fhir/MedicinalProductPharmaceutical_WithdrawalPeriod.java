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
    as = ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical_WithdrawalPeriod {
  CodeableConcept tissue();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Quantity value();

  Optional<List<Extension>> modifierExtension();

  Optional<String> supportingInformation();

  static ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.TissueBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.builder();
  }
}
