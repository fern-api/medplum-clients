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
  Optional<Ratio> detailRatio();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> detailBoolean();

  Optional<String> detailString();

  Optional<List<Extension>> extension();

  Optional<Duration> dueDuration();

  Optional<Range> detailRange();

  Optional<String> dueDate();

  Optional<Quantity> detailQuantity();

  Optional<CodeableConcept> detailCodeableConcept();

  Optional<String> id();

  Optional<Double> detailInteger();

  Optional<CodeableConcept> measure();

  static ImmutableGoal_Target.Builder builder() {
    return ImmutableGoal_Target.builder();
  }
}
