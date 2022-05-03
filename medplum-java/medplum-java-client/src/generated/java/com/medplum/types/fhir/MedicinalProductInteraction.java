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
  Optional<List<Reference>> subject();

  Optional<String> description();

  Optional<CodeableConcept> effect();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<CodeableConcept> management();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<CodeableConcept> incidence();

  Optional<Uri> implicitRules();

  Optional<List<MedicinalProductInteraction_Interactant>> interactant();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  String resourceType();

  static ImmutableMedicinalProductInteraction.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductInteraction.builder();
  }
}
