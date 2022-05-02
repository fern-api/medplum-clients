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
  Optional<DateTime> restoreDate();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> jurisdiction();

  Period dateRange();

  CodeableConcept status();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept country();

  static ImmutableMarketingStatus.DateRangeBuildStage builder() {
    return ImmutableMarketingStatus.builder();
  }
}
