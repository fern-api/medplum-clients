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
    as = ImmutableMessageHeader.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageHeader {
  Optional<Narrative> text();

  Optional<String> eventUri();

  Optional<Reference> enterer();

  Optional<List<Extension>> modifierExtension();

  Optional<Coding> eventCoding();

  Optional<List<MessageHeader_Destination>> destination();

  String resourceType();

  Optional<Reference> responsible();

  Optional<MessageHeader_Response> response();

  Optional<Reference> author();

  Optional<CodeableConcept> reason();

  Optional<List<Reference>> focus();

  Optional<Uri> implicitRules();

  Optional<Reference> sender();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  MessageHeader_Source source();

  Optional<Canonical> definition();

  Optional<Meta> meta();

  static ImmutableMessageHeader.ResourceTypeBuildStage builder() {
    return ImmutableMessageHeader.builder();
  }
}
