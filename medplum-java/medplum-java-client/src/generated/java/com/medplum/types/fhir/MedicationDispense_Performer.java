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
    as = ImmutableMedicationDispense_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationDispense_Performer {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> function();

  Optional<List<Extension>> extension();

  Reference actor();

  static ImmutableMedicationDispense_Performer.ActorBuildStage builder() {
    return ImmutableMedicationDispense_Performer.builder();
  }
}
