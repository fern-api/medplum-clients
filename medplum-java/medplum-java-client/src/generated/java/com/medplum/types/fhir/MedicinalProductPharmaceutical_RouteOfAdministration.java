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
    as = ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical_RouteOfAdministration {
  Optional<String> id();

  Optional<Ratio> maxDosePerTreatmentPeriod();

  Optional<Duration> maxTreatmentPeriod();

  Optional<Quantity> maxSingleDose();

  Optional<List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies();

  Optional<List<Extension>> extension();

  Optional<Quantity> maxDosePerDay();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  Optional<Quantity> firstDose();

  static ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.CodeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.builder();
  }
}
