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
    as = ImmutableAppointment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Appointment {
  Optional<List<CodeableConcept>> specialty();

  Optional<Narrative> text();

  Optional<PositiveInt> minutesDuration();

  List<Appointment_Participant> participant();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<String> comment();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Period>> requestedPeriod();

  Optional<List<CodeableConcept>> serviceType();

  Optional<List<Reference>> reasonReference();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Instant> start();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> basedOn();

  Optional<Meta> meta();

  Optional<Instant> end();

  String resourceType();

  Optional<UnsignedInt> priority();

  Optional<DateTime> created();

  Optional<String> patientInstruction();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<CodeableConcept> cancelationReason();

  Optional<List<Reference>> slot();

  Optional<Id> id();

  Optional<AppointmentStatus> status();

  Optional<String> description();

  Optional<CodeableConcept> appointmentType();

  Optional<Code> language();

  static ImmutableAppointment.ResourceTypeBuildStage builder() {
    return ImmutableAppointment.builder();
  }
}
