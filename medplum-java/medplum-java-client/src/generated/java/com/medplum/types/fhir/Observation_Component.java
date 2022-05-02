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

  Optional<Quantity> valueQuantity();

  Optional<List<CodeableConcept>> interpretation();

  Optional<List<Extension>> extension();

  Optional<String> valueString();

  Optional<Ratio> valueRatio();

  Optional<String> valueTime();

  Optional<String> valueDateTime();

  Optional<Period> valuePeriod();

  Optional<Range> valueRange();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> valueBoolean();

  Optional<SampledData> valueSampledData();

  CodeableConcept code();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<Double> valueInteger();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  static ImmutableObservation_Component.CodeBuildStage builder() {
    return ImmutableObservation_Component.builder();
  }
}
