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
  String resourceType();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<SpecimenDefinition_TypeTested>> typeTested();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> typeCollected();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<String> timeAspect();

  Optional<List<CodeableConcept>> collection();

  Optional<Code> language();

  Optional<List<CodeableConcept>> patientPreparation();

  Optional<List<Extension>> extension();

  Optional<Identifier> identifier();

  static ImmutableSpecimenDefinition.ResourceTypeBuildStage builder() {
    return ImmutableSpecimenDefinition.builder();
  }
}