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
    as = ImmutableSpecimenDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SpecimenDefinition {
  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Identifier> identifier();

  Optional<List<CodeableConcept>> collection();

  String resourceType();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> patientPreparation();

  Optional<CodeableConcept> typeCollected();

  Optional<String> timeAspect();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<List<SpecimenDefinition_TypeTested>> typeTested();

  static ImmutableSpecimenDefinition.ResourceTypeBuildStage builder() {
    return ImmutableSpecimenDefinition.builder();
  }
}
