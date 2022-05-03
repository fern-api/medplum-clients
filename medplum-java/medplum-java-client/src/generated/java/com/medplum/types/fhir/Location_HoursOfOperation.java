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
  Optional<Boolean> allDay();

  Optional<String> id();

  Optional<Time> openingTime();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<Code>> daysOfWeek();

  Optional<Time> closingTime();

  static ImmutableLocation_HoursOfOperation.Builder builder() {
    return ImmutableLocation_HoursOfOperation.builder();
  }
}
