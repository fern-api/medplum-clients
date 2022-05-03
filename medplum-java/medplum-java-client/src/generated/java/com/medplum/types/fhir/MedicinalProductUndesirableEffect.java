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
  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Population>> population();

  Optional<CodeableConcept> symptomConditionEffect();

  Optional<CodeableConcept> frequencyOfOccurrence();

  Optional<List<Reference>> subject();

  String resourceType();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<CodeableConcept> classification();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  static ImmutableMedicinalProductUndesirableEffect.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductUndesirableEffect.builder();
  }
}
