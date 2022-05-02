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
  Optional<Instant> end();

  Optional<List<CodeableConcept>> participantType();

  Optional<Code> language();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<Reference> actor();

  String resourceType();

  Optional<Instant> start();

  Optional<String> comment();

  Optional<List<ResourceList>> contained();

  Optional<Code> participantStatus();

  Optional<List<Extension>> modifierExtension();

  Reference appointment();

  Optional<Meta> meta();

  static ImmutableAppointmentResponse.ResourceTypeBuildStage builder() {
    return ImmutableAppointmentResponse.builder();
  }
}
