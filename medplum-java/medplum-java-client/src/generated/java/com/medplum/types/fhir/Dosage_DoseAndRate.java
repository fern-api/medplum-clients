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
  Optional<Quantity> rateQuantity();

  Optional<Range> doseRange();

  Optional<Quantity> doseQuantity();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Ratio> rateRatio();

  Optional<Range> rateRange();

  Optional<CodeableConcept> type();

  static ImmutableDosage_DoseAndRate.Builder builder() {
    return ImmutableDosage_DoseAndRate.builder();
  }
}
