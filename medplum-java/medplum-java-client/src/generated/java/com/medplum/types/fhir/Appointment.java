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
  Optional<List<CodeableConcept>> serviceType();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Reference>> basedOn();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> slot();

  Optional<Narrative> text();

  Optional<Instant> end();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<List<Period>> requestedPeriod();

  Optional<String> comment();

  Optional<PositiveInt> minutesDuration();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<CodeableConcept> appointmentType();

  Optional<String> patientInstruction();

  Optional<Meta> meta();

  Optional<AppointmentStatus> status();

  Optional<List<ResourceList>> contained();

  List<Appointment_Participant> participant();

  Optional<List<Reference>> reasonReference();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<DateTime> created();

  Optional<CodeableConcept> cancelationReason();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<Instant> start();

  Optional<List<CodeableConcept>> specialty();

  Optional<UnsignedInt> priority();

  static ImmutableAppointment.ResourceTypeBuildStage builder() {
    return ImmutableAppointment.builder();
  }
}
