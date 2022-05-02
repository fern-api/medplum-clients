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
    as = ImmutableMedicationAdministration_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationAdministration_Performer {
  Optional<List<Extension>> extension();

  Reference actor();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> function();

  Optional<String> id();

  static ImmutableMedicationAdministration_Performer.ActorBuildStage builder() {
    return ImmutableMedicationAdministration_Performer.builder();
  }
}
