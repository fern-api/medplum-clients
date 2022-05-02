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
  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  String resourceType();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> effect();

  Optional<CodeableConcept> management();

  Optional<List<MedicinalProductInteraction_Interactant>> interactant();

  Optional<CodeableConcept> incidence();

  Optional<String> description();

  Optional<List<Reference>> subject();

  static ImmutableMedicinalProductInteraction.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductInteraction.builder();
  }
}
