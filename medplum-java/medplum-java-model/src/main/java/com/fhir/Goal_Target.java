package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Quantity> detailQuantity();

  Optional<String> dueDate();

  Optional<List<Extension>> extension();

  Optional<Boolean> detailBoolean();

  Optional<CodeableConcept> measure();

  Optional<Duration> dueDuration();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> detailInteger();

  Optional<Range> detailRange();

  Optional<Ratio> detailRatio();

  Optional<CodeableConcept> detailCodeableConcept();

  Optional<String> id();

  Optional<String> detailString();

  static ImmutableGoal_Target.Builder builder() {
    return ImmutableGoal_Target.builder();
  }
}