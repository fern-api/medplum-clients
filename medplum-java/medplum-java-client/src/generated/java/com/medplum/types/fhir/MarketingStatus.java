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
  CodeableConcept country();

  Optional<DateTime> restoreDate();

  Optional<List<Extension>> extension();

  CodeableConcept status();

  Optional<CodeableConcept> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Period dateRange();

  static ImmutableMarketingStatus.CountryBuildStage builder() {
    return ImmutableMarketingStatus.builder();
  }
}
