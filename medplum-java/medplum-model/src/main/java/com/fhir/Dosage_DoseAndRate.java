package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDosage_DoseAndRate.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Dosage_DoseAndRate {
  Optional<Range> doseRange();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Ratio> rateRatio();

  Optional<Range> rateRange();

  Optional<Quantity> rateQuantity();

  Optional<Quantity> doseQuantity();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDosage_DoseAndRate.Builder builder() {
    return ImmutableDosage_DoseAndRate.builder();
  }
}
