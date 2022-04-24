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
    as = ImmutableObservation_Component.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Observation_Component {
  Optional<List<CodeableConcept>> interpretation();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<String> valueDateTime();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<String> valueString();

  Optional<Quantity> valueQuantity();

  Optional<Ratio> valueRatio();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> valueRange();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Period> valuePeriod();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Double> valueInteger();

  Optional<Boolean> valueBoolean();

  Optional<SampledData> valueSampledData();

  CodeableConcept code();

  Optional<String> valueTime();

  static ImmutableObservation_Component.CodeBuildStage builder() {
    return ImmutableObservation_Component.builder();
  }
}
