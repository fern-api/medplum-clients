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
    as = ImmutableDataRequirement_DateFilter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement_DateFilter {
  Optional<List<Extension>> extension();

  Optional<String> path();

  Optional<String> valueDateTime();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Duration> valueDuration();

  Optional<String> searchParam();

  Optional<Period> valuePeriod();

  static ImmutableDataRequirement_DateFilter.Builder builder() {
    return ImmutableDataRequirement_DateFilter.builder();
  }
}
