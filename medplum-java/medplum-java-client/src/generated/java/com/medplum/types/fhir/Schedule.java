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
  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> specialty();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<Period> planningHorizon();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<String> comment();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> active();

  Optional<List<CodeableConcept>> serviceType();

  List<Reference> actor();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  static ImmutableSchedule.ResourceTypeBuildStage builder() {
    return ImmutableSchedule.builder();
  }
}
