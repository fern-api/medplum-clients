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
    as = ImmutableObservation_Component.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Observation_Component {
  Optional<String> id();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Boolean> valueBoolean();

  CodeableConcept code();

  Optional<List<CodeableConcept>> interpretation();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<String> valueDateTime();

  Optional<List<Extension>> extension();

  Optional<Quantity> valueQuantity();

  Optional<Range> valueRange();

  Optional<String> valueString();

  Optional<Double> valueInteger();

  Optional<Period> valuePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<SampledData> valueSampledData();

  Optional<Ratio> valueRatio();

  Optional<String> valueTime();

  static ImmutableObservation_Component.CodeBuildStage builder() {
    return ImmutableObservation_Component.builder();
  }
}
