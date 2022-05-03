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
  Optional<Narrative> text();

  List<Appointment_Participant> participant();

  Optional<Instant> end();

  Optional<String> comment();

  Optional<Code> language();

  Optional<Instant> start();

  Optional<DateTime> created();

  Optional<List<Reference>> slot();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> cancelationReason();

  Optional<List<Reference>> reasonReference();

  Optional<List<Period>> requestedPeriod();

  Optional<List<ResourceList>> contained();

  Optional<PositiveInt> minutesDuration();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<Uri> implicitRules();

  Optional<String> description();

  Optional<UnsignedInt> priority();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> appointmentType();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Reference>> basedOn();

  Optional<String> patientInstruction();

  Optional<Meta> meta();

  String resourceType();

  Optional<Id> id();

  Optional<AppointmentStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> serviceType();

  static ImmutableAppointment.ResourceTypeBuildStage builder() {
    return ImmutableAppointment.builder();
  }
}
