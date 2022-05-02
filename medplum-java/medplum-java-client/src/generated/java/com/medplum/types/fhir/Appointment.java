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
  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> supportingInformation();

  Optional<List<CodeableConcept>> specialty();

  Optional<Instant> end();

  Optional<Meta> meta();

  Optional<List<Reference>> reasonReference();

  Optional<List<Reference>> slot();

  Optional<Narrative> text();

  Optional<PositiveInt> minutesDuration();

  Optional<String> description();

  List<Appointment_Participant> participant();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Period>> requestedPeriod();

  Optional<List<CodeableConcept>> serviceType();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<UnsignedInt> priority();

  Optional<CodeableConcept> appointmentType();

  Optional<String> patientInstruction();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> cancelationReason();

  Optional<Instant> start();

  String resourceType();

  Optional<List<Reference>> basedOn();

  Optional<Id> id();

  Optional<AppointmentStatus> status();

  Optional<DateTime> created();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<String> comment();

  static ImmutableAppointment.ResourceTypeBuildStage builder() {
    return ImmutableAppointment.builder();
  }
}
