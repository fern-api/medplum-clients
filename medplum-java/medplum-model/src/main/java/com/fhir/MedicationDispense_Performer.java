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
    as = ImmutableMedicationDispense_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationDispense_Performer {
  Reference actor();

  Optional<CodeableConcept> function();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableMedicationDispense_Performer.ActorBuildStage builder() {
    return ImmutableMedicationDispense_Performer.builder();
  }
}
