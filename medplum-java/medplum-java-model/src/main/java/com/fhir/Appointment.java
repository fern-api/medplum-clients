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
    as = ImmutableAppointment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Appointment {
  Optional<String> description();

  Optional<dateTime> created();

  List<Appointment_Participant> participant();

  Optional<CodeableConcept> cancelationReason();

  Optional<List<Reference>> basedOn();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<unsignedInt> priority();

  Optional<positiveInt> minutesDuration();

  Optional<instant> start();

  Optional<AppointmentStatus> status();

  Optional<String> comment();

  Optional<String> patientInstruction();

  Optional<List<CodeableConcept>> serviceType();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> reasonReference();

  Optional<Narrative> text();

  Optional<instant> end();

  Optional<List<Extension>> extension();

  Optional<code> language();

  Optional<Meta> meta();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Reference>> slot();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> appointmentType();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Period>> requestedPeriod();

  Optional<List<CodeableConcept>> serviceCategory();

  static ImmutableAppointment.ResourceTypeBuildStage builder() {
    return ImmutableAppointment.builder();
  }
}
