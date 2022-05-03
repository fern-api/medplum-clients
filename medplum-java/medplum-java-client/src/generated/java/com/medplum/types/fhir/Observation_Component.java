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
  Optional<CodeableConcept> dataAbsentReason();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<List<CodeableConcept>> interpretation();

  Optional<Quantity> valueQuantity();

  Optional<String> valueString();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Range> valueRange();

  Optional<String> id();

  Optional<Ratio> valueRatio();

  Optional<SampledData> valueSampledData();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  Optional<Double> valueInteger();

  Optional<String> valueTime();

  Optional<List<Extension>> extension();

  Optional<Period> valuePeriod();

  Optional<String> valueDateTime();

  Optional<Boolean> valueBoolean();

  static ImmutableObservation_Component.CodeBuildStage builder() {
    return ImmutableObservation_Component.builder();
  }
}
