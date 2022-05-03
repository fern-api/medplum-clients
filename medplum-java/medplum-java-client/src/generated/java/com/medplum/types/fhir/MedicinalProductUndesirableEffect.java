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
    as = ImmutableMedicinalProductUndesirableEffect.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductUndesirableEffect {
  Optional<CodeableConcept> symptomConditionEffect();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> frequencyOfOccurrence();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> subject();

  Optional<CodeableConcept> classification();

  Optional<List<Population>> population();

  String resourceType();

  Optional<Uri> implicitRules();

  static ImmutableMedicinalProductUndesirableEffect.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductUndesirableEffect.builder();
  }
}
