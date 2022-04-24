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
    as = ImmutableMedicationAdministration_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationAdministration_Performer {
  Optional<String> id();

  Optional<CodeableConcept> function();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Reference actor();

  static ImmutableMedicationAdministration_Performer.ActorBuildStage builder() {
    return ImmutableMedicationAdministration_Performer.builder();
  }
}
