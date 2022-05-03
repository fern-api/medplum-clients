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
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  CodeableConcept country();

  Optional<CodeableConcept> jurisdiction();

  Optional<DateTime> restoreDate();

  Optional<String> id();

  CodeableConcept status();

  Period dateRange();

  static ImmutableMarketingStatus.CountryBuildStage builder() {
    return ImmutableMarketingStatus.builder();
  }
}
