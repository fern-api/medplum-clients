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
    as = ImmutableMedicinalProductInteraction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductInteraction {
  Optional<String> description();

  Optional<List<MedicinalProductInteraction_Interactant>> interactant();

  String resourceType();

  Optional<id> id();

  Optional<CodeableConcept> effect();

  Optional<List<Extension>> modifierExtension();

  Optional<code> language();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> incidence();

  Optional<CodeableConcept> management();

  Optional<List<Reference>> subject();

  Optional<CodeableConcept> type();

  static ImmutableMedicinalProductInteraction.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductInteraction.builder();
  }
}
