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
    as = ImmutableMedicinalProductInteraction_Interactant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductInteraction_Interactant {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Reference> itemReference();

  Optional<CodeableConcept> itemCodeableConcept();

  static ImmutableMedicinalProductInteraction_Interactant.Builder builder() {
    return ImmutableMedicinalProductInteraction_Interactant.builder();
  }
}
