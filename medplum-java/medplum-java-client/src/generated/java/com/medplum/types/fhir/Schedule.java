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

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> specialty();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  List<Reference> actor();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<Boolean> active();

  Optional<Period> planningHorizon();

  Optional<String> comment();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> serviceType();

  static ImmutableSchedule.ResourceTypeBuildStage builder() {
    return ImmutableSchedule.builder();
  }
}
