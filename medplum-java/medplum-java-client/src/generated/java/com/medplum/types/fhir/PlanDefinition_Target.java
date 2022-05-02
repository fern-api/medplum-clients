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
  Optional<Range> detailRange();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> measure();

  Optional<String> id();

  Optional<CodeableConcept> detailCodeableConcept();

  Optional<Duration> due();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> detailQuantity();

  static ImmutablePlanDefinition_Target.Builder builder() {
    return ImmutablePlanDefinition_Target.builder();
  }
}
