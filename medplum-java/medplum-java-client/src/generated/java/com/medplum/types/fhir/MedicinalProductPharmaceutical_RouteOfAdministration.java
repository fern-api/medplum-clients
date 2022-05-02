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

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> maxSingleDose();

  CodeableConcept code();

  Optional<Quantity> maxDosePerDay();

  Optional<Duration> maxTreatmentPeriod();

  Optional<List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies();

  Optional<Quantity> firstDose();

  Optional<Ratio> maxDosePerTreatmentPeriod();

  static ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.CodeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.builder();
  }
}
