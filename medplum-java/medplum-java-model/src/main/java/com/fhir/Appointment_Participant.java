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
    as = ImmutableAppointment_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Appointment_Participant {
  Optional<List<CodeableConcept>> type();

  Optional<List<Extension>> modifierExtension();

  Optional<Appointment_participantRequired> required();

  Optional<Reference> actor();

  Optional<Appointment_participantStatus> status();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Period> period();

  static ImmutableAppointment_Participant.Builder builder() {
    return ImmutableAppointment_Participant.builder();
  }
}
