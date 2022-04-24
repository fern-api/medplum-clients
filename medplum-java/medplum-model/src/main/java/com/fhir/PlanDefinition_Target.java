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
    as = ImmutablePlanDefinition_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Target {
  Optional<Range> detailRange();

  Optional<CodeableConcept> measure();

  Optional<Duration> due();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Quantity> detailQuantity();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> detailCodeableConcept();

  static ImmutablePlanDefinition_Target.Builder builder() {
    return ImmutablePlanDefinition_Target.builder();
  }
}
