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
    as = ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical_WithdrawalPeriod {
  Optional<String> id();

  Quantity value();

  Optional<String> supportingInformation();

  CodeableConcept tissue();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.ValueBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.builder();
  }
}
