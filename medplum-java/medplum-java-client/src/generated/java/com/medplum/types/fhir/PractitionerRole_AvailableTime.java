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
    as = ImmutablePractitionerRole_AvailableTime.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PractitionerRole_AvailableTime {
  Optional<List<Code>> daysOfWeek();

  Optional<Time> availableEndTime();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Time> availableStartTime();

  Optional<Boolean> allDay();

  static ImmutablePractitionerRole_AvailableTime.Builder builder() {
    return ImmutablePractitionerRole_AvailableTime.builder();
  }
}
