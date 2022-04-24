package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<code>> daysOfWeek();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> allDay();

  Optional<time> openingTime();

  Optional<time> closingTime();

  static ImmutableLocation_HoursOfOperation.Builder builder() {
    return ImmutableLocation_HoursOfOperation.builder();
  }
}
