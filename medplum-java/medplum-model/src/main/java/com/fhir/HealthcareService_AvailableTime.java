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
    as = ImmutableHealthcareService_AvailableTime.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HealthcareService_AvailableTime {
  Optional<List<Extension>> modifierExtension();

  Optional<time> availableStartTime();

  Optional<String> id();

  Optional<time> availableEndTime();

  Optional<Boolean> allDay();

  Optional<List<Healthcareservice_availabletimeDaysofweekItem>> daysOfWeek();

  Optional<List<Extension>> extension();

  static ImmutableHealthcareService_AvailableTime.Builder builder() {
    return ImmutableHealthcareService_AvailableTime.builder();
  }
}
