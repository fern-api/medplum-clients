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
  Optional<String> timeAspect();

  Optional<List<CodeableConcept>> collection();

  Optional<CodeableConcept> typeCollected();

  Optional<Id> id();

  Optional<List<CodeableConcept>> patientPreparation();

  String resourceType();

  Optional<Identifier> identifier();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<SpecimenDefinition_TypeTested>> typeTested();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  static ImmutableSpecimenDefinition.ResourceTypeBuildStage builder() {
    return ImmutableSpecimenDefinition.builder();
  }
}
