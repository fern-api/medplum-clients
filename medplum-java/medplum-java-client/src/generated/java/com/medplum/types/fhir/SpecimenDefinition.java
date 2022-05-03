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
  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Identifier> identifier();

  String resourceType();

  Optional<CodeableConcept> typeCollected();

  Optional<List<SpecimenDefinition_TypeTested>> typeTested();

  Optional<List<Extension>> extension();

  Optional<String> timeAspect();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> patientPreparation();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> collection();

  static ImmutableSpecimenDefinition.ResourceTypeBuildStage builder() {
    return ImmutableSpecimenDefinition.builder();
  }
}
