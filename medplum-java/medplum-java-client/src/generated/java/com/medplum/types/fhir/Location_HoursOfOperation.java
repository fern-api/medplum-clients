package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableLocation_HoursOfOperation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Location_HoursOfOperation {
  Optional<Time> openingTime();

  Optional<String> id();

  Optional<Time> closingTime();

  Optional<List<Extension>> extension();

  Optional<List<Code>> daysOfWeek();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> allDay();

  static ImmutableLocation_HoursOfOperation.Builder builder() {
    return ImmutableLocation_HoursOfOperation.builder();
  }
}
