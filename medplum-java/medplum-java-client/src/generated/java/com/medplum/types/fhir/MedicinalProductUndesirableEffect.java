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
  Optional<Narrative> text();

  Optional<List<Reference>> subject();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<CodeableConcept> symptomConditionEffect();

  Optional<CodeableConcept> frequencyOfOccurrence();

  Optional<List<Population>> population();

  Optional<CodeableConcept> classification();

  static ImmutableMedicinalProductUndesirableEffect.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductUndesirableEffect.builder();
  }
}
