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
    as = ImmutablePractitionerRole_AvailableTime.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PractitionerRole_AvailableTime {
  Optional<Boolean> allDay();

  Optional<time> availableEndTime();

  Optional<List<Extension>> extension();

  Optional<time> availableStartTime();

  Optional<String> id();

  Optional<List<code>> daysOfWeek();

  Optional<List<Extension>> modifierExtension();

  static ImmutablePractitionerRole_AvailableTime.Builder builder() {
    return ImmutablePractitionerRole_AvailableTime.builder();
  }
}
