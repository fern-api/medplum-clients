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
    as = ImmutableMarketingStatus.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MarketingStatus {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Period dateRange();

  Optional<DateTime> restoreDate();

  CodeableConcept country();

  Optional<CodeableConcept> jurisdiction();

  CodeableConcept status();

  Optional<List<Extension>> extension();

  static ImmutableMarketingStatus.DateRangeBuildStage builder() {
    return ImmutableMarketingStatus.builder();
  }
}
