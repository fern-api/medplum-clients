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
  Optional<String> valueDateTime();

  Optional<String> id();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Double> valueInteger();

  CodeableConcept code();

  Optional<List<CodeableConcept>> interpretation();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<SampledData> valueSampledData();

  Optional<String> valueTime();

  Optional<String> valueString();

  Optional<Period> valuePeriod();

  Optional<List<Extension>> extension();

  Optional<Range> valueRange();

  Optional<Ratio> valueRatio();

  Optional<Boolean> valueBoolean();

  Optional<Quantity> valueQuantity();

  Optional<List<Extension>> modifierExtension();

  static ImmutableObservation_Component.CodeBuildStage builder() {
    return ImmutableObservation_Component.builder();
  }
}
