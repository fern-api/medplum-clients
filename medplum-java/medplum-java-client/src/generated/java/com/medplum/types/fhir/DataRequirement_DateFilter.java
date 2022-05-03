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
    as = ImmutableDataRequirement_DateFilter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement_DateFilter {
  Optional<String> searchParam();

  Optional<String> valueDateTime();

  Optional<Period> valuePeriod();

  Optional<String> path();

  Optional<Duration> valueDuration();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableDataRequirement_DateFilter.Builder builder() {
    return ImmutableDataRequirement_DateFilter.builder();
  }
}
