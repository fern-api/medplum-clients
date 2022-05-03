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
  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Code> participantStatus();

  Optional<Instant> start();

  Optional<String> comment();

  Optional<Code> language();

  Optional<Reference> actor();

  Optional<Meta> meta();

  Reference appointment();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Instant> end();

  Optional<List<CodeableConcept>> participantType();

  Optional<List<ResourceList>> contained();

  static ImmutableAppointmentResponse.ResourceTypeBuildStage builder() {
    return ImmutableAppointmentResponse.builder();
  }
}
