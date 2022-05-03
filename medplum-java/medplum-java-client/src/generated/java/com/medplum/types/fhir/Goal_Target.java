package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableGoal_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Goal_Target {
  Optional<String> detailString();

  Optional<Duration> dueDuration();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> detailRange();

  Optional<String> dueDate();

  Optional<Boolean> detailBoolean();

  Optional<CodeableConcept> detailCodeableConcept();

  Optional<CodeableConcept> measure();

  Optional<Quantity> detailQuantity();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Double> detailInteger();

  Optional<Ratio> detailRatio();

  static ImmutableGoal_Target.Builder builder() {
    return ImmutableGoal_Target.builder();
  }
}
