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
    as = ImmutableHealthcareService_AvailableTime.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HealthcareService_AvailableTime {
  Optional<List<Extension>> extension();

  Optional<List<Healthcareservice_availabletimeDaysofweekItem>> daysOfWeek();

  Optional<Time> availableStartTime();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Time> availableEndTime();

  Optional<Boolean> allDay();

  static ImmutableHealthcareService_AvailableTime.Builder builder() {
    return ImmutableHealthcareService_AvailableTime.builder();
  }
}
