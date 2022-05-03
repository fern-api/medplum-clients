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
  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> effect();

  Optional<List<MedicinalProductInteraction_Interactant>> interactant();

  String resourceType();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<String> description();

  Optional<Id> id();

  Optional<CodeableConcept> management();

  Optional<CodeableConcept> incidence();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> subject();

  Optional<CodeableConcept> type();

  static ImmutableMedicinalProductInteraction.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductInteraction.builder();
  }
}
