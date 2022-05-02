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
    as = ImmutableAppointment_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Appointment_Participant {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Appointment_participantRequired> required();

  Optional<Appointment_participantStatus> status();

  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> type();

  Optional<Reference> actor();

  static ImmutableAppointment_Participant.Builder builder() {
    return ImmutableAppointment_Participant.builder();
  }
}
