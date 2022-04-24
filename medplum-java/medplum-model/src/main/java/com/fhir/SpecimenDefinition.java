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
    as = ImmutableSpecimenDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SpecimenDefinition {
  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<SpecimenDefinition_TypeTested>> typeTested();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> collection();

  String resourceType();

  Optional<CodeableConcept> typeCollected();

  Optional<List<CodeableConcept>> patientPreparation();

  Optional<id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> implicitRules();

  Optional<Identifier> identifier();

  Optional<String> timeAspect();

  Optional<Narrative> text();

  Optional<code> language();

  static ImmutableSpecimenDefinition.ResourceTypeBuildStage builder() {
    return ImmutableSpecimenDefinition.builder();
  }
}
