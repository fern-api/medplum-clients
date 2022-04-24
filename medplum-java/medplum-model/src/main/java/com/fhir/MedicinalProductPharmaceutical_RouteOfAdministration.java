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
    as = ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical_RouteOfAdministration {
  Optional<Quantity> maxSingleDose();

  CodeableConcept code();

  Optional<Quantity> maxDosePerDay();

  Optional<List<Extension>> modifierExtension();

  Optional<Duration> maxTreatmentPeriod();

  Optional<Quantity> firstDose();

  Optional<Ratio> maxDosePerTreatmentPeriod();

  Optional<String> id();

  Optional<List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.CodeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.builder();
  }
}
