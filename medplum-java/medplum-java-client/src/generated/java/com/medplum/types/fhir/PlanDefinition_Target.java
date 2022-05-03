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
    as = ImmutablePlanDefinition_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Target {
  Optional<CodeableConcept> measure();

  Optional<CodeableConcept> detailCodeableConcept();

  Optional<String> id();

  Optional<Quantity> detailQuantity();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Duration> due();

  Optional<Range> detailRange();

  static ImmutablePlanDefinition_Target.Builder builder() {
    return ImmutablePlanDefinition_Target.builder();
  }
}
