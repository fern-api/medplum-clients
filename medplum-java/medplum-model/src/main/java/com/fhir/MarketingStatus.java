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
    as = ImmutableMarketingStatus.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MarketingStatus {
  Optional<List<Extension>> extension();

  Optional<dateTime> restoreDate();

  Optional<CodeableConcept> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept country();

  Period dateRange();

  CodeableConcept status();

  Optional<String> id();

  static ImmutableMarketingStatus.CountryBuildStage builder() {
    return ImmutableMarketingStatus.builder();
  }
}
