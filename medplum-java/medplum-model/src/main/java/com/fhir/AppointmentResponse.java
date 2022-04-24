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
    as = ImmutableAppointmentResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AppointmentResponse {
  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<code> participantStatus();

  Optional<uri> implicitRules();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<List<Extension>> modifierExtension();

  Reference appointment();

  Optional<List<Identifier>> identifier();

  Optional<Reference> actor();

  Optional<instant> end();

  Optional<List<CodeableConcept>> participantType();

  Optional<String> comment();

  Optional<instant> start();

  static ImmutableAppointmentResponse.ResourceTypeBuildStage builder() {
    return ImmutableAppointmentResponse.builder();
  }
}
