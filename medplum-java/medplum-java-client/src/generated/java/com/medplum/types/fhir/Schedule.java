package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSchedule.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Schedule {
  Optional<Narrative> text();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> serviceType();

  Optional<String> comment();

  Optional<Code> language();

  Optional<Id> id();

  Optional<List<CodeableConcept>> specialty();

  List<Reference> actor();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<Period> planningHorizon();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> active();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  static ImmutableSchedule.ResourceTypeBuildStage builder() {
    return ImmutableSchedule.builder();
  }
}
