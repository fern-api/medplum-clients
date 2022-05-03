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
    as = ImmutableAppointmentResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AppointmentResponse {
  Optional<Instant> start();

  Optional<Narrative> text();

  Optional<Code> participantStatus();

  Optional<Uri> implicitRules();

  Optional<Reference> actor();

  Optional<String> comment();

  Optional<List<Extension>> extension();

  Reference appointment();

  Optional<List<CodeableConcept>> participantType();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Instant> end();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  String resourceType();

  static ImmutableAppointmentResponse.AppointmentBuildStage builder() {
    return ImmutableAppointmentResponse.builder();
  }
}
