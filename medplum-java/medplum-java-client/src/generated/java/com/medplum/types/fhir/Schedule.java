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
  String resourceType();

  Optional<List<ResourceList>> contained();

  List<Reference> actor();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<List<CodeableConcept>> serviceType();

  Optional<List<CodeableConcept>> specialty();

  Optional<String> comment();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> active();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Period> planningHorizon();

  Optional<Uri> implicitRules();

  static ImmutableSchedule.ResourceTypeBuildStage builder() {
    return ImmutableSchedule.builder();
  }
}
