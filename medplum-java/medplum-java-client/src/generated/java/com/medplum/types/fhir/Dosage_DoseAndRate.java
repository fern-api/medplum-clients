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
    as = ImmutableDosage_DoseAndRate.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Dosage_DoseAndRate {
  Optional<Ratio> rateRatio();

  Optional<Quantity> rateQuantity();

  Optional<List<Extension>> extension();

  Optional<Range> doseRange();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> doseQuantity();

  Optional<Range> rateRange();

  Optional<CodeableConcept> type();

  Optional<String> id();

  static ImmutableDosage_DoseAndRate.Builder builder() {
    return ImmutableDosage_DoseAndRate.builder();
  }
}
