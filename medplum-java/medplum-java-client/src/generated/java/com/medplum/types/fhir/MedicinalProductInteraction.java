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
    as = ImmutableMedicinalProductInteraction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductInteraction {
  Optional<CodeableConcept> incidence();

  String resourceType();

  Optional<List<Reference>> subject();

  Optional<CodeableConcept> management();

  Optional<Id> id();

  Optional<List<MedicinalProductInteraction_Interactant>> interactant();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> effect();

  Optional<String> description();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<CodeableConcept> type();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProductInteraction.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductInteraction.builder();
  }
}
