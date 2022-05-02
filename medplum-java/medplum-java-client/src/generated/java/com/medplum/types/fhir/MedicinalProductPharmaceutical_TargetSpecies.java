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
    as = ImmutableMedicinalProductPharmaceutical_TargetSpecies.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical_TargetSpecies {
  Optional<String> id();

  CodeableConcept code();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<MedicinalProductPharmaceutical_WithdrawalPeriod>> withdrawalPeriod();

  static ImmutableMedicinalProductPharmaceutical_TargetSpecies.CodeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical_TargetSpecies.builder();
  }
}
