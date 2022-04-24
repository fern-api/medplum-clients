package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<ResourceList>> contained();

  Optional<Period> planningHorizon();

  Optional<List<CodeableConcept>> serviceCategory();

  List<Reference> actor();

  Optional<id> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> active();

  Optional<List<CodeableConcept>> serviceType();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<uri> implicitRules();

  Optional<code> language();

  String resourceType();

  Optional<List<CodeableConcept>> specialty();

  Optional<String> comment();

  Optional<Meta> meta();

  static ImmutableSchedule.ResourceTypeBuildStage builder() {
    return ImmutableSchedule.builder();
  }
}
