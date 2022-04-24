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
    as = ImmutableMedicinalProductUndesirableEffect.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductUndesirableEffect {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Population>> population();

  Optional<Meta> meta();

  Optional<CodeableConcept> frequencyOfOccurrence();

  String resourceType();

  Optional<id> id();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<code> language();

  Optional<CodeableConcept> classification();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> symptomConditionEffect();

  Optional<List<Reference>> subject();

  static ImmutableMedicinalProductUndesirableEffect.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductUndesirableEffect.builder();
  }
}
