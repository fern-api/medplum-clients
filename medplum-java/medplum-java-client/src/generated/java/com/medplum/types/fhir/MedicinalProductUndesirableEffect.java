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

  Optional<CodeableConcept> classification();

  Optional<CodeableConcept> frequencyOfOccurrence();

  Optional<List<Population>> population();

  Optional<Code> language();

  Optional<List<Reference>> subject();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> symptomConditionEffect();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  static ImmutableMedicinalProductUndesirableEffect.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductUndesirableEffect.builder();
  }
}
