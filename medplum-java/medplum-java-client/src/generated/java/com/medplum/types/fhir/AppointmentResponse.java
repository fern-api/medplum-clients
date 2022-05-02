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
  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Code> participantStatus();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<Instant> end();

  Optional<Instant> start();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Reference appointment();

  Optional<List<CodeableConcept>> participantType();

  Optional<String> comment();

  Optional<Code> language();

  Optional<Reference> actor();

  static ImmutableAppointmentResponse.ResourceTypeBuildStage builder() {
    return ImmutableAppointmentResponse.builder();
  }
}
